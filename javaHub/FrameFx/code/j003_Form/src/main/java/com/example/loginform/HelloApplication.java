package com.example.loginform;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxml = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxml.load(), 500, 800);

        scene.getStylesheets().add(getClass().getResource("FormStyle.css").toExternalForm());

        stage.setTitle("Aasif");
        stage.setScene(scene);
        stage.show();
    }
}