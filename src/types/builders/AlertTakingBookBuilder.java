package types.builders;


import javafx.scene.control.Alert;

public class AlertTakingBookBuilder {
    public static Alert getBookIsNotSelectedAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Не выбрана книга");
        alert.setContentText("Пожалуйста, выберите книгу из списку");
        return alert;
    }

    public static Alert getNotValidSystemDataAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Системная ошибка");
        alert.setContentText("Возникла системная ошибка: пользователь или книга не найдены");
        return alert;
    }

    public static Alert getUserDisabledAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Ошибка доступа");
        alert.setContentText("Ваш доступ заблокирован, Вы не можете произвести данную операцию");
        return alert;
    }

    public static Alert getNotAvailableBookAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Нельзя взять книгу");
        alert.setContentText("Данной книги нет в наличии. Вы можете оформить на неё заказ");
        return alert;
    }

    public static Alert getBookAlreadyTakenAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Книга уже была взята");
        alert.setContentText("Вы уже взяли (и не вернули) такую книгу");
        return alert;
    }

    public static Alert getSystemErrorAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Системная ошибка");
        alert.setContentText("Возникла ошибка при обращении к базе данных или серверу");
        return alert;
    }

}
