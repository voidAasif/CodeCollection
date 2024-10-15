package com.example.loginform;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class HelloController {

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton male;

    @FXML
    private RadioButton female;

    @FXML
    private VBox radioContainer;

    @FXML
    private GridPane skillsGrid;

    private CheckBox c, cpp, html, css, js, react, python, flask;

    @FXML
    private ComboBox<String> courseCombo;

    @FXML
    private void initialize(){

        gender = new ToggleGroup();
        male.setToggleGroup(gender);
        female.setToggleGroup(gender);

        radioContainer.setSpacing(10); //add space between radios;

        addressInput.setWrapText(true);
        addressInput.setMaxHeight(100);

        c = createCheckBox("C");
        cpp = createCheckBox("C++");
        html = createCheckBox("HTML");
        css = createCheckBox("CSS");
        js = createCheckBox("JavaScript");
        react = createCheckBox("React JS");
        python = createCheckBox("Python");
        flask = createCheckBox("Flask");

        skillsGrid.add(new Label("Skills: "), 0, 0);

        skillsGrid.add(c, 0, 1);
        skillsGrid.add(cpp, 0, 2);

        skillsGrid.add(html, 1, 1);
        skillsGrid.add(css, 1, 2);

        skillsGrid.add(js, 2, 1);
        skillsGrid.add(react, 2, 2);

        skillsGrid.add(python, 3, 1);
        skillsGrid.add(flask, 3, 2);

        //ComboBox;
        courseCombo.getItems().addAll("BA", "MBA", "BCA", "B.Sc", "M.Sc");

    } //init end;

    private CheckBox createCheckBox(String text){
        CheckBox checkBox = new CheckBox(text);
        checkBox.getStyleClass().add("checkBox"); // Add the .checkBox style class
        return checkBox;
    }

    @FXML
    private TextField firstNameTF;
    @FXML
    private TextField midNameTF;
    @FXML
    private TextField lastNameTF;
    @FXML
    private TextArea addressInput;

    //actions;
    @FXML
    private void submitClick(){
        String firstName = firstNameTF.getText();
        String midName = midNameTF.getText();
        String lastName = lastNameTF.getText();
        String gender = male.isSelected() ? "Male" : "Female";
        String address = addressInput.getText();
        String course = courseCombo.getValue();
        String skills = "";
        skills = skills + (c.isSelected()? "C, " : "");
        skills = skills + (cpp.isSelected()? "C++, " : "");
        skills = skills + (html.isSelected()? "HTML, " : "");
        skills = skills + (css.isSelected()? "CSS, " : "");
        skills = skills + (js.isSelected()? "JavaScript, " : "");
        skills = skills + (react.isSelected()? "React JS, " : "");
        skills = skills + (python.isSelected()? "Python, " : "");
        skills = skills + (flask.isSelected()? "Flask" : "");


        System.out.println(firstName +" "+ midName +" "+ lastName);
        System.out.println(gender);
        System.out.println(address);
        System.out.println(course);
        System.out.println(skills);
    }
}