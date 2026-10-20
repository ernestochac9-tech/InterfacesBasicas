package com.mycompany.gastos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Control de Gastos Semanales");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}