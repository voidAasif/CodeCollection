module com.example.j002_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.j002_fx to javafx.fxml;
    exports com.example.j002_fx;
}