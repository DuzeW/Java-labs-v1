module com.example.zad_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zad_1 to javafx.fxml;
    exports com.example.zad_1;
}