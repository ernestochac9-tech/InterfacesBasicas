package com.mycompany.gastos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    @FXML private TextField txtAlimentacion, txtRefrigerios, txtTransporte, txtTelefonia, txtOtros;
    @FXML private TextField txtTotal, txtMayor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void btnCalcularEstadisticas_click() {
        try {
            int a = Integer.parseInt(txtAlimentacion.getText());
            int r = Integer.parseInt(txtRefrigerios.getText());
            int t = Integer.parseInt(txtTransporte.getText());
            int l = Integer.parseInt(txtTelefonia.getText());
            int o = Integer.parseInt(txtOtros.getText());

            int total = a + r + t + l + o;
            txtTotal.setText(String.valueOf(total));

            int max = a;
            String categoria = "Alimentación";
            if (r > max) { 
                max = r; categoria = "Refrigerios";
            }
            if (t > max) {
                max = t; categoria = "Transporte"; 
            }
            if (l > max) {
                max = l; categoria = "Telefonía"; 
            }
            if (o > max) {
                max = o; categoria = "Otros"; 
            }

            txtMayor.setText(categoria);
        } catch (Exception e) {
            
        }
    }

    @FXML
    private void btnLimpiar_click() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtMayor.clear();
    }
}