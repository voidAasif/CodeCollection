package com.example.j004_switchscene.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class Orange {
    @FXML
    private void okClick(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("I am orange Color");
        alert.showAndWait();
    }
}