package com.mycompany.entero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    @FXML private TextField txtNumero, txtCantidadCifras, txtSumaImpares, txtSumaPares, txtSumaTotal, txtCifraMayor, txtCifraMenor;
    @FXML private TextArea txtDivisores;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void btnAnalizar_click() {
        try {
            String texto = txtNumero.getText();
            int num = Integer.parseInt(texto);
            int sumaPares = 0, sumaImpares = 0, sumaTotal = 0;
            int mayor = Character.getNumericValue(texto.charAt(0));
            int menor = mayor;

            for (int i = 0; i < texto.length(); i++) {
                int digito = Character.getNumericValue(texto.charAt(i));
                sumaTotal += digito;
                if (digito % 2 == 0) {
                    sumaPares += digito;
                } else {
                    sumaImpares += digito;
                }
                if (digito > mayor) mayor = digito;
                if (digito < menor) menor = digito;
            }

            txtCantidadCifras.setText(String.valueOf(texto.length()));
            txtSumaImpares.setText(String.valueOf(sumaImpares));
            txtSumaPares.setText(String.valueOf(sumaPares));
            txtSumaTotal.setText(String.valueOf(sumaTotal));
            txtCifraMayor.setText(String.valueOf(mayor));
            txtCifraMenor.setText(String.valueOf(menor));

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    sb.append(i).append("\n");
                }
            }
            txtDivisores.setText(sb.toString());
        } catch (Exception e) {
            
        }
    }

    @FXML
    private void btnLimpiar_click() {
        txtNumero.clear();
        txtCantidadCifras.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumaTotal.clear();
        txtCifraMayor.clear();
        txtCifraMenor.clear();
        txtDivisores.clear();
    }
}