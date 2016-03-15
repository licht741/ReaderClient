package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import types.adapters.OperationAdapter;
import types.builders.*;
import types.controllers.BookController;
import types.controllers.OperationController;

import java.lang.reflect.InvocationTargetException;
import java.security.AllPermission;
import java.util.Date;

public class Controller {

    /*
     * Элементы управления
     */

    @FXML
    private TableColumn bookNameColumn;
    @FXML
    private TableColumn recDateColumn;
    @FXML
    private TableColumn deadlineColumn;

    @FXML
    private Button returnBookButton;
    @FXML
    private Button takeBookButton;
    @FXML
    private Button makeOrderButton;
    @FXML
    private Button extendUsageButton;

    @FXML
    private TableView userBookTable;

    @FXML
    private ListView availableBookList;

    @FXML
    private ListView booksForOrderListView;

    @FXML
    private TextField authPasswdTextField;
    @FXML
    private TextField authLognTextField;
    @FXML
    private TextField authNameTextField;

    @FXML
    private Button authButton;
    @FXML
    private Button regButton;

    @FXML
    private Tab UserBooksTab;
    @FXML
    private Tab TakeBookTab;
    @FXML
    private Tab OrderBookTab;


    @FXML
    public void initialize() {}

    @FXML
    private void UserBooksTabUpdateHandler() {
        try {
            if (UserBooksTab.isSelected())
                OperationController.getInstance().updateData();
        }
        catch (Exception exc) {
            AlertAppDialogBuilder.getConnectionErrorAlert().showAndWait();
        }

    }

    @FXML
    private void TakeBookTabUpdateHandler() {
        try {
            if (TakeBookTab.isSelected())
                BookController.getInstance().updateAvailableBooks();
        }
        catch (Exception exc) {
            AlertAppDialogBuilder.getConnectionErrorAlert().showAndWait();
        }
    }

    @FXML
    private void OrderBookTabUpdateHandler() {
        try{
            if (OrderBookTab.isSelected())
                BookController.getInstance().updateAllBooks();
        }
        catch (Exception exc) {
            AlertAppDialogBuilder.getConnectionErrorAlert().showAndWait();
        }
    }


    /*
     *
     * Обработчик возврата книги
     * Книга выбирается из списка
     * Манипуляции с базой данных делегируются OperationController
     *
     */
    @FXML
    private void handleReturnBook() {
        int selectedIndex = userBookTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex < 0) {
            AlertTakingBookBuilder.getBookIsNotSelectedAlert().showAndWait();
            return;
        }

        int retResult;
        try {
            retResult = OperationController.getInstance().returnBook(selectedIndex);
        }
        catch (javax.xml.ws.WebServiceException exc) {
            AlertAppDialogBuilder.getConnectionErrorAlert().showAndWait();
            return;
        }

        switch (retResult) {
            case -2:
                AlertReturningBookBuilder.getSystemErrorAlert().showAndWait();
                break;
            case -1:
                AlertReturningBookBuilder.getRecordErrorAlert().showAndWait();
                break;
        }
    }

    /*
     *
     * Обработчик взятия книги
     * Книга выбирается из списка
     * Манипуляции с базой данных делегируются BookController
     *
     */

    @FXML
    private void handleTakeBook() {
        int selectedIndex = availableBookList.getSelectionModel().getSelectedIndex();
        if (selectedIndex < 0) {
            AlertTakingBookBuilder.getBookIsNotSelectedAlert().showAndWait();
            return;
        }
        int retResult;
        try {
            retResult = BookController.getInstance().takeBook(selectedIndex);
        }
        catch (javax.xml.ws.WebServiceException exc) {
            AlertAppDialogBuilder.getConnectionErrorAlert().showAndWait();
            return;
        }

        switch (retResult) {
            case -6:
                AlertTakingBookBuilder.getSystemErrorAlert().showAndWait();
                break;
            case -5:
                AlertTakingBookBuilder.getBookAlreadyTakenAlert().showAndWait();
                break;
            case -4:
                AlertTakingBookBuilder.getNotAvailableBookAlert().showAndWait();
            case -2:
                AlertTakingBookBuilder.getUserDisabledAlert().showAndWait();
                break;
            case -3:
            case -1:
                AlertTakingBookBuilder.getNotValidSystemDataAlert().showAndWait();
                break;
        }

    }

    /*
     *
     * Обработчик продления срока пользования книгой
     * Книга выбирается из списка
     * Манипуляции с базой данных делегируются OperationController
     * Срок может быть не продлён, если есть активный заказ на эту книгу
     *
     */

    @FXML
    private void handleExtendUsageButton() {
        int selectedIndex = userBookTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex < 0) {
            AlertTakingBookBuilder.getBookIsNotSelectedAlert().showAndWait();
            return;
        }

        int retResult;
        try {
            retResult = OperationController.getInstance().extendUsage(selectedIndex);
        }
        catch (javax.xml.ws.WebServiceException exc) {
            AlertAppDialogBuilder.getConnectionErrorAlert().showAndWait();
            return;
        }

        switch (retResult) {
            case -2:
                AlertExendUsageBuilder.getSystemErrorAlert().showAndWait();
                break;
            case -1:
                AlertExendUsageBuilder.getRecordErrorAlert().showAndWait();
                break;
        }
    }


    /*
     *
     * Обработчик заказов на книгу
     * Книга выбирается из списка
     * Запись о заказе размещается в базе данных
     * Заказ может выполнен, если кто-нибудь вернёт книгу в библиотеку или библиотекарь закажет новые книги
     *
     */
    @FXML
    private void handleMakeOrderUsageButton() {
        int selectedIndex = booksForOrderListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex < 0) {
            AlertTakingBookBuilder.getBookIsNotSelectedAlert().showAndWait();
            return;
        }
        int retResult;
        try {
            retResult = BookController.getInstance().makeOrder(selectedIndex, 1);
        }
        catch (javax.xml.ws.WebServiceException exc) {
            AlertAppDialogBuilder.getConnectionErrorAlert().showAndWait();
            return;
        }
        switch (retResult) {
            case -2:
                AlertMakeOrderBuilder.getSystemErrorAlert().showAndWait();
                break;
            case -1:
                AlertMakeOrderBuilder.getRecordErrorAlert().showAndWait();
                break;
        }

    }

    /*
     * Обработчик регистрации нового пользователя в библиотеке
     * Работа с базой данных делегируется AuthorizationController
     * Все поля должны быть заполнены
     * Логин пользователя должен быть уникален
     *
     * При успешной регистрации, автоматически вызывается метод авторизации читателя
     */
    @FXML
    private void regButtonHandler() {
        String login = authLognTextField.getText();
        String password = authPasswdTextField.getText();
        String name = authNameTextField.getText();
        int result;
        try {
            result = AuthorizationController.getInstance().registration(login, password, name);
        }
        catch (javax.xml.ws.WebServiceException exc) {
            AlertAppDialogBuilder.getConnectionErrorAlert().showAndWait();
            return;
        }

        switch (result) {
            case -1:
                AlertRegistrationDialogBuilder.getExistingLoginErrorAlert().showAndWait();
                break;
            case -2:
                AlertRegistrationDialogBuilder.getInvalidInputDataErrorAlert().showAndWait();
                break;
            case -3:
                AlertRegistrationDialogBuilder.getSystemErrorAlert().showAndWait();
                break;
            case 0:
                authButtonHandler();
        }
    }

    /*
     * Обработчик авторизации пользователя
     * Работа с базой данных делегируется AuthorizationController
     */

    @FXML
    private void authButtonHandler() {
        String login = authLognTextField.getText();
        String passwd = authPasswdTextField.getText();

        int result;

        try {
            result = AuthorizationController.getInstance().authorization(login, passwd);
        }
        catch (Exception exc) {
            AlertAppDialogBuilder.getConnectionErrorAlert().showAndWait();
            return;
        }


        switch (result) {
            case -1:
                AlertAuthorizationDialogBuilder.getAuthErrorAlert().showAndWait();
                break;
            case -2:
                AlertAuthorizationDialogBuilder.getUserDisabledAlert().showAndWait();
                UserBooksTab.setDisable(false);
                break;
            case -3:
                AlertAuthorizationDialogBuilder.getSystemErrorAlert().showAndWait();
                break;
            case 0:
                AlertAuthorizationDialogBuilder.getAuthSuccessAlert();
                authModeEnable();
        }
    }


    /*
     * Вспомогательные методы манипуляций с элементами управления
     */

    private void authModeEnable() {
        UserBooksTab.setDisable(false);
        TakeBookTab.setDisable(false);
        OrderBookTab.setDisable(false);
        authNameTextField.setDisable(true);
        OperationController.getInstance().updateData();

        BookController.getInstance().updateAllBooks();
        BookController.getInstance().updateAvailableBooks();
        BookController.getInstance().updateBookForOrder();

        initializeBooksTable();
        initializeAvailableBooksList();
        initializeOrderBooksList();
    }

    private void initializeBooksTable() {
        bookNameColumn.setCellValueFactory(new PropertyValueFactory<OperationAdapter, String>("book"));
        recDateColumn.setCellValueFactory(new PropertyValueFactory<OperationAdapter, Date>("receivedDateFormat"));
        deadlineColumn.setCellValueFactory(new PropertyValueFactory<OperationAdapter, Date>("deadlineDateFormat"));
        userBookTable.setItems(OperationController.getInstance().operationAdapters);
    }

    private void initializeAvailableBooksList() {
        availableBookList.setItems(BookController.getInstance().availableBooks);
    }

    private void initializeOrderBooksList() {
        booksForOrderListView.setItems(BookController.getInstance().booksForOrder);
    }
}
