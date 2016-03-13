package types.builders;


import javafx.scene.control.Alert;

public class AlertReturningBookBuilder {
    public static Alert getRecordErrorAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Системная ошибка");
        alert.setContentText("Возникла системная ошибка: данная запись не найдена или уже возвращена");
        return alert;
    }
    public static Alert getSystemErrorAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Системная ошибка");
        alert.setContentText("Возникла системная ошибка при обращении к серверу или базе данных");
        return alert;
    }
}
