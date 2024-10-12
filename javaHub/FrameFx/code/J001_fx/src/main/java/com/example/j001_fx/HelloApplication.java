package com.example.j001_fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //root node or layout manager;
        TilePane root = new TilePane();
        root.setStyle("-fx-background-color: linear-gradient(to right, red, blue);");


        //Scene or panel; (Scene only work as a Container)
        Scene panel = new Scene(root, 400, 250); //layout, width, height;


        //Stage or frame;
        stage.setScene(panel); //add scene into stage;
        stage.setTitle("First Fx Frame");
//        stage.setX(1300); //display frame on custom position;
//        stage.setY(100);
//        stage.setAlwaysOnTop(true);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("hello");
//        stage.setIconified(true); //minimize;
        stage.setMaximized(true);




        stage.show(); //display stage;
    }

    public static void main(String[] args) {
        launch();
    }
}