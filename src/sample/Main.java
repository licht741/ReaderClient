package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ReaderApp.fxml"));
        primaryStage.setTitle("Читатель");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
        this.primaryStage = primaryStage;

    }

    public static void main(String[] args) {
        launch(args);
    }
}
