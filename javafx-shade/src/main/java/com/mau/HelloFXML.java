package com.mau;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class HelloFXML extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // use this if need to run using Intellij directly https://stackoverflow.com/a/25217393
        // java modules required
        // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("app.fxml"));

        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

}
