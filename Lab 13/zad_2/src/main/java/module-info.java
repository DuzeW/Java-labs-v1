module com.example.zad_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zad_2 to javafx.fxml;
    exports com.example.zad_2;
}