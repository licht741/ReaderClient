package types.builders;

import javafx.scene.control.Alert;

public class AlertExendUsageBuilder {
    public static Alert getSystemErrorAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Системная ошибка");
        alert.setContentText("Возникла системная ошибка при обращении к серверу или базе данных");
        return alert;
    }

    public static Alert getRecordErrorAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Ошибка продления");
        alert.setContentText("Продление срока пользования невозможно");
        return alert;
    }

}
