package com.example.j002_fx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Label welcomeText;

    // Declare button variables with @FXML annotation
    @FXML
    private Button btnOne;

    @FXML
    private Button btnTwo;

    @FXML
    private Button btnThree;

    @FXML
    private Button btnFour;

    @FXML
    public void initialize() {
        // Create DropShadow effect
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(10);
        dropShadow.setOffsetY(10);
        dropShadow.setRadius(5);
        dropShadow.setColor(Color.BLACK); // Shadow color

        // Apply shadow effect to buttons
        btnOne.setEffect(dropShadow);
        btnTwo.setEffect(dropShadow);
        btnThree.setEffect(dropShadow);
        btnFour.setEffect(dropShadow);
    }

    @FXML
    protected void onOneButtonClick() {
        welcomeText.setText("EK");
    }

    @FXML
    protected void onTwoButtonClick() {welcomeText.setText("DO");}

    @FXML
    protected void onThreeButtonClick() {welcomeText.setText("TEEN");}

    @FXML
    protected void onFourButtonClick() {welcomeText.setText("CHAR");}
}