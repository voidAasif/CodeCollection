package com.example.j004_switchscene.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class HomeController {
    @FXML
    private BorderPane borderPane;

    @FXML
    private void initialize(){
        System.out.println("Init UI");
    }

    @FXML
    private void redClick() throws IOException {
        System.out.println("Switch to Red");

        switchView("red");
    }

    @FXML
    private void greenClick(){
        System.out.println("Switch to Green");

        switchView("green");
    }

    @FXML
    private void blueClick(){
        System.out.println("Switch to Blue");

        switchView("blue");
    }

    @FXML
    private void orangeClick(){
        System.out.println("Switch to Orange");

        switchView("orange");
    }

    @FXML
    private void yellowClick(){
        System.out.println("Switch to Yellow");

        switchView("yellow");
    }


    @FXML
    private void okClick(){
        System.out.println("default Ok");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setContentText("I am Default Color");
        alert.showAndWait();
    }

    @SuppressWarnings("all")
    private void switchView(String fxmlFileName) {
        try {
            // Load the FXML file dynamically based on the button clicked
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/j004_switchscene/xml/"+ fxmlFileName +".fxml"));
            Node newView = fxmlLoader.load();


            // Set the new content in the center of the BorderPane
            borderPane.setCenter(newView);

            // Clear existing stylesheets before adding new one
            borderPane.getScene().getStylesheets().clear();
            newView.getScene().getStylesheets().add(getClass().getResource("/com/example/j004_switchscene/css/"+ fxmlFileName +".css").toExternalForm());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
