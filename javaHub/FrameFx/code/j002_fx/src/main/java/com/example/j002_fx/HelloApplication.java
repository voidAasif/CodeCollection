package com.example.j002_fx;

//actions(all ways) and external XML, CSS demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application { //it is only a start point of app;
    @Override
    public void start(Stage stage) throws IOException { //start method invoke when launch method call;

        //load XML form resources;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 440); //load XML on scene;

        scene.getStylesheets().add(getClass().getResource("hello-view.css").toExternalForm()); //load css;


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}