package com.example.j002_fx;

//this controller class connected with FXML with property (fx:"xyx.controller") in hello-view.fxml;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private VBox vbox;

    @FXML
    private FlowPane flowPane;

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
//        vbox

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


//        tilePane

        // TextField;
        textField.setMaxSize(100, 50); //width, height
        textField.setText("Def text");
        textField.setTooltip(new Tooltip("This is toolTip on textField"));

        //PasswordField;
        passwordField.setMaxSize(100, 50);
        passwordField.setTooltip(new Tooltip("I am PasswordField"));

        //CheckBox;
        checkBox.fire(); //default check;
        System.out.println(checkBox.isSelected());
        checkBox.setText("CheckBox: ");
        checkBox.setTooltip(new Tooltip("I am check Box"));

        //RadioButton;

        // Initialize ToggleGroup
        genderGroup = new ToggleGroup();

        // Assign ToggleGroup to RadioButtons
        radioMale.setToggleGroup(genderGroup);
        radioFemale.setToggleGroup(genderGroup);

        radioMale.setSelected(true); //default Male;

        genderGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                RadioButton selectedRadioButton = (RadioButton) newValue;
                String selectedGender = selectedRadioButton.getText();
                System.out.println("Selected Gender: " + selectedGender);
            }
        });

        // ComboBox
        combo.getItems().addAll("Option 1", "Option 2", "Option 3");

        // ScrollBar;
        scrollBar.adjustValue(20);
        System.out.println(scrollBar.getMax());
        System.out.println(scrollBar.getMin());
        System.out.println(scrollBar.getValue());

        // Add listener to print ScrollBar value when it changes
        scrollBar.valueProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("ScrollBar Value: " + newValue.doubleValue());
        });

    }

    @FXML
    protected void onOneButtonClick() {welcomeText.setText("EK");}

    @FXML
    protected void onTwoButtonClick() {welcomeText.setText("DO");}

    @FXML
    protected void onThreeButtonClick() {welcomeText.setText("TEEN");}

    @FXML
    protected void onFourButtonClick() {welcomeText.setText("CHAR");}

    //TitledPane start;

    @FXML
    private TextField textField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private CheckBox checkBox;

    @FXML
    private RadioButton radioMale;

    @FXML
    private RadioButton radioFemale;

    @FXML
    private ToggleGroup genderGroup;

    @FXML
    private ComboBox<String> combo;

    @FXML
    private ScrollBar scrollBar;
}