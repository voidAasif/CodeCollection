package com.example.j002_fx;

//this controller class connected with FXML with property (fx:"xyx.controller") in hello-view.fxml;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import javax.swing.*;

public class HelloController {

    @FXML
    private VBox vBox;

    @FXML
    private Label welcomeText;

    // Declare button variables with @FXML annotation
    @FXML
    private Button btnOne;

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

        // Create buttons dynamically
        //btnOne define in XML;
        Button btnTwo = new Button("Two");
        Button btnThree = new Button("Three");
        Button btnFour = new Button("Four");
        Button btnFive = new Button("Five");


        // Set actions for the dynamically created buttons
        // Action 2;
        btnTwo.setOnAction(e -> welcomeText.setText("DO")); //actionListener using lambda;

        // Action 3;
        btnThree.setOnAction(new EventHandler<ActionEvent>() { //actionListener using AnonClass;
            @Override
            public void handle(ActionEvent actionEvent) {
                welcomeText.setText("Teen");
            }
        });

        // Action 4;
//        EventHandler<ActionEvent> actionObj = new EventHandler<>(); //this is not possible because of EventHandler is an Interface;
        EventHandler<ActionEvent> actionObj = new EventHandler<ActionEvent>() { // actionListener using event Obj;
            @Override
            public void handle(ActionEvent actionEvent) {
                welcomeText.setText("Char");
            }
        };
        btnFour.setOnAction(actionObj);



        btnFive.setOnAction(this::handleBtnFiveClick);



        // Apply the same DropShadow effect to the new buttons
        btnTwo.setEffect(dropShadow);
        btnThree.setEffect(dropShadow);
        btnFour.setEffect(dropShadow);
        btnFive.setEffect(dropShadow);

        // Add dynamically created buttons to the VBox
        vBox.getChildren().addAll(btnTwo, btnThree, btnFour, btnFive);


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
        combo.setValue("Option 2");

        // ScrollBar;
        scrollBar.adjustValue(20);
        System.out.println(scrollBar.getMax());
        System.out.println(scrollBar.getMin());
        System.out.println(scrollBar.getValue());

        // Add listener to print ScrollBar value when it changes
        scrollBar.valueProperty().addListener((observable, oldValue, newValue) -> { // change listener;
            System.out.println("ScrollBar Value: " + newValue.doubleValue());
        });

    } // end initialize;

    // Action 5;
    public void handleBtnFiveClick(ActionEvent e){ //ActionListener using method ref;
        welcomeText.setText("Paach");
    }

    // Action 1;
    @FXML
    protected void onOneButtonClick() {welcomeText.setText("EK");} //actionListener using XML;


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
    private ComboBox<String> combo;

    @FXML
    private ToggleGroup genderGroup;

    @FXML
    private ScrollBar scrollBar;
}