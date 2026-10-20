package com.mycompany.tabla;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    @FXML private TextField txtNumero;
    @FXML private TextArea txtTabla;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void btnCalcular_click() {
        try {
            int n = Integer.parseInt(txtNumero.getText());
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
                sb.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
            }
            txtTabla.setText(sb.toString());
        } catch (Exception e) {
            
        }
    }

    @FXML
    private void btnLimpiar_click() {
        txtNumero.clear();
        txtTabla.clear();
    }
}