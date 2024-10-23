module com.example.j004_switchscene {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.j004_switchscene to javafx.fxml;
    exports com.example.j004_switchscene;
    exports com.example.j004_switchscene.controller;
    opens com.example.j004_switchscene.controller to javafx.fxml;
}