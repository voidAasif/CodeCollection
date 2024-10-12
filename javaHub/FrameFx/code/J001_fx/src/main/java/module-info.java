module com.example.j001_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.j001_fx to javafx.fxml;
    exports com.example.j001_fx;
}