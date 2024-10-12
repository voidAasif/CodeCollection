package com.example.j001_fx;
//basic of frame, panel, layout and it's fun;
//or inline css;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //root node or layout manager;
        Group root = new Group(); //group layout = null layout in swing;
//        root.setStyle("-fx-background-color: linear-gradient(to right, red, blue);");

        Label lbl = new Label();
        lbl.setText("I am Label");
        lbl.setLayoutX(20);
        lbl.setLayoutY(20);


        Text txt = new Text();
        txt.setText("I am Text");
        txt.setX(70);
        txt.setY(70);
//        txt.setStyle("-fx-font-size: 50;");
        txt.setStyle("-fx-font-family: Monospaced;");

        Button btn = new Button();
        btn.setText("I am Button");
        btn.setLayoutX(120);
        btn.setLayoutY(120);
//        btn.setStyle("-fx-background-color: yellow;");
        btn.setStyle("-fx-background-color: yellow; -fx-border-color: black; -fx-border-radius: 50px; -fx-background-radius: 50px;");



        root.getChildren().add(lbl);
        root.getChildren().add(txt);
        root.getChildren().add(btn);


        //Scene or panel; (Scene only work as a Container)
        Scene panel = new Scene(root, 400, 250, Color.RED); //layout, width, height;
        //panel.//apply actions;



        //Stage or frame;
        stage.setScene(panel); //add scene into stage;
        stage.setTitle("First Fx Frame");
//        stage.setX(1300); //display frame on custom position;
//        stage.setY(100);
//        stage.setAlwaysOnTop(true);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("hello");
//        stage.setIconified(true); //minimize;
//        stage.setMaximized(true); //maximize;
//        stage.setResizable(false); //disable resizable;
//        stage.setOpacity(10); //not working;

        //add frame icon;
//        Image frameIcon = new Image("");
//        stage.getIcons().add(frameIcon);

        stage.show(); //display stage;
    }

    public static void main(String[] args) {
        launch();
    }
}