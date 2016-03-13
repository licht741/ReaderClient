package types.controllers;

import endpoint.IReaderService;
import endpoint.Operation;
import endpoint.ReaderServiceService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import types.adapters.OperationAdapter;

import java.util.List;

/*
 *
 * Класс инкапсулирующий работу с пользовательскими книгами
 * Содержит информацию о записях пользователя
 * Реализован паттерном Singleton
 *
 */
public class OperationController {
    private static OperationController instance = null;
    private static int userID;
    private static IReaderService port;

    public final ObservableList<OperationAdapter> operationAdapters;

    private OperationController() {
        operationAdapters = FXCollections.observableArrayList();

        ReaderServiceService service = new ReaderServiceService();
        port = service.getReaderServicePort();
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        OperationController.userID = userID;
    }

    public static OperationController getInstance() {
        if (instance == null)
            instance = new OperationController();
        return instance;
    }

    public void updateData() {
        operationAdapters.clear();
        List<Operation> operations = port.getUserBooks(userID);
        for (Operation oper : operations) {
            OperationAdapter userOrderAdapter = new OperationAdapter(oper);
            operationAdapters.add(userOrderAdapter);
        }
    }

    public int returnBook(int index) {
        int operID = operationAdapters.get(index).getId();
        int result = port.returnBook(operID);
        if (result == 0)
            operationAdapters.remove(index);
        return result;
    }

    public int extendUsage(int index) {
        int operID = operationAdapters.get(index).getId();
        int result = port.extendUsage(operID);
        if (result == 0)
            updateData();
        return result;
    }

}
