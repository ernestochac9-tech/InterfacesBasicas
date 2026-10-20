package com.mycompany.dinero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    @FXML private TextField txtDinero;
    @FXML private Label lbl500, lbl200, lbl100, lbl50, lbl20, lbl10, lbl5, lbl2, lbl1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void btnDesglosar_click() {
        try {
            int dinero = Integer.parseInt(txtDinero.getText());
            int b500 = dinero / 500; 
            dinero %= 500;
            int b200 = dinero / 200; 
            dinero %= 200;
            int b100 = dinero / 100; 
            dinero %= 100;
            int b50  = dinero / 50;  
            dinero %= 50;
            int b20  = dinero / 20;  
            dinero %= 20;
            int m10  = dinero / 10;  
            dinero %= 10;
            int m5   = dinero / 5;   
            dinero %= 5;
            int m2   = dinero / 2;   
            dinero %= 2;
            int m1   = dinero;

            lbl500.setText(String.valueOf(b500));
            lbl200.setText(String.valueOf(b200));
            lbl100.setText(String.valueOf(b100));
            lbl50.setText(String.valueOf(b50));
            lbl20.setText(String.valueOf(b20));
            lbl10.setText(String.valueOf(m10));
            lbl5.setText(String.valueOf(m5));
            lbl2.setText(String.valueOf(m2));
            lbl1.setText(String.valueOf(m1));
        } catch (NumberFormatException e) {
           
        }
    }

    @FXML
    private void btnLimpiarInput_click() {
        txtDinero.clear();
        lbl500.setText("0"); 
        lbl200.setText("0"); 
        lbl100.setText("0");
        lbl50.setText("0");  
        lbl20.setText("0");  
        lbl10.setText("0");
        lbl5.setText("0");   
        lbl2.setText("0");   
        lbl1.setText("0");
    }
}