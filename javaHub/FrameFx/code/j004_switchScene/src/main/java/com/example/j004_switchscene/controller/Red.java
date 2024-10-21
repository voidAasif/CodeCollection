package com.example.j004_switchscene.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Alert;

import java.io.IOException;

public class Red {
    @FXML
    private void okClick(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("I am red Color");
        alert.showAndWait();
    }

//    @SuppressWarnings("all")
//    private void nextView(String fxmlFileName) {
//        try {
//            // Load the FXML file dynamically based on the button clicked
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/j004_switchscene/xml/"+ fxmlFileName +".fxml"));
//            Node newView = fxmlLoader.load();
//
//
//            // Set the new content in the center of the BorderPane
//            borderPane.setCenter(newView);
//
//            // Clear existing stylesheets before adding new one
//            borderPane.getScene().getStylesheets().clear();
//            newView.getScene().getStylesheets().add(getClass().getResource("/com/example/j004_switchscene/css/"+ fxmlFileName +".css").toExternalForm());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
