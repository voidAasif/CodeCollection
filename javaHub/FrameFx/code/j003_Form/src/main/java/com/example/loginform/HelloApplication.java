package com.example.loginform;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @SuppressWarnings("all")
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxml = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxml.load(), 500, 800);

        scene.getStylesheets().add(getClass().getResource("FormStyle.css").toExternalForm());

        Image icon = new Image(getClass().getResourceAsStream("res/formIcon.png")); //warning -> may be return null;
        stage.getIcons().add(icon);
        stage.setTitle("Aasif");
        stage.setScene(scene);
        stage.show();
    }
}