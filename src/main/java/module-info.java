module com.example.colculfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.colculfx to javafx.fxml;
    exports com.example.colculfx;
}