package types.controllers;


import endpoint.Book;
import endpoint.IReaderService;
import endpoint.ReaderServiceService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import types.adapters.BookAdapter;

import java.util.List;

/*
 *
 * Класс инкапсулирующий работу с книгами
 * Содержит доступные для взятия и для заказа книги
 * Реализован паттерном Singleton
 *
 */

public class BookController {
    private static BookController instance = null;
    private static IReaderService port;

    private int userID;

    public final ObservableList<BookAdapter> allBooks;
    public final ObservableList<BookAdapter> availableBooks;
    public final ObservableList<BookAdapter> booksForOrder;

    private BookController() {
        allBooks       = FXCollections.observableArrayList();
        availableBooks = FXCollections.observableArrayList();
        booksForOrder  = FXCollections.observableArrayList();

        ReaderServiceService service = new ReaderServiceService();
        port = service.getReaderServicePort();
    }

    public static BookController getInstance() {
        if (instance == null)
            instance = new BookController();
        return instance;
    }

    public void updateAllBooks() {
        allBooks.clear();
        List<Book> arrayList = port.getAllBooks();
        for (Book book : arrayList) {
            BookAdapter bookAdapter = new BookAdapter(book);
            allBooks.add(bookAdapter);
        }
    }
    public void updateAvailableBooks() {
        availableBooks.clear();
        List<Book> arrayList = port.getAvailableBooks();
        for (Book book : arrayList) {
            BookAdapter bookAdapter = new BookAdapter(book);
            availableBooks.add(bookAdapter);
        }
    }

    public void updateBookForOrder() {
        booksForOrder.clear();

        List<Book> ordBooks = port.getAllBooks();
        for (Book book : ordBooks) {
            BookAdapter bookAdapter = new BookAdapter(book);
            booksForOrder.add(bookAdapter);
        }
    }

    public int makeOrder(int index, int count) {
        int bookID = booksForOrder.get(index).getId();
        int retResult = port.makeOrder(bookID, count);
        if (retResult > 0)
            BookController.getInstance().updateAvailableBooks();
        return retResult;
    }

    public int takeBook(int index) {
        int bookID = availableBooks.get(index).getId();
        int retResult = port.takeBookFromLibrary(userID, bookID);
        if (retResult > 0)
            OperationController.getInstance().updateData();
        return retResult;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
