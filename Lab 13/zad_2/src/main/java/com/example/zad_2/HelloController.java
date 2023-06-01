package com.example.zad_2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        String text = field1.getText();
        byte[] bytetext = text.toCharArray();
        for(byte i:bytetext){
            result
        }
    }
    @FXML
    private TextArea area1;

    @FXML
    private TextField field1;
}