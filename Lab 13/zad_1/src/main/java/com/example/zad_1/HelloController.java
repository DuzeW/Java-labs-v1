package com.example.zad_1;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField textFiled;

    @FXML
    private DatePicker dataPicker;

    @FXML
    private Label result;

    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
        String imie = textFiled.getText();
        LocalDate date = dataPicker.getValue();
        LocalDate.now();
        int teraz = LocalDate.now().getYear();
        int podany_rok = date.getYear();
        String wiek = String.valueOf(teraz-podany_rok);
        if(podany_rok>teraz){
            result.setText("wprowadzono datę z przyszłości");
        }
        else {
            result.setText(imie + " ma " + wiek + " lata");
        }
    }
}