package com.mycompany.edad;

import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    @FXML private TextField txtFechaNacimiento;
    @FXML private Label lblResultado;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void btnCalcular_click() {
        try {
            String texto = txtFechaNacimiento.getText();
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate nacimiento = LocalDate.parse(texto, fmt);
            LocalDate hoy = LocalDate.now();
            Period p = Period.between(nacimiento, hoy);
            lblResultado.setText("Tiene " + p.getYears() + " años con " + p.getMonths() + " meses");
        } catch (Exception e) {
            lblResultado.setText("Formato incorrecto (Use dd/mm/aaaa)");
        }
    }

    @FXML
    private void btnLimpiar_click() {
        txtFechaNacimiento.clear();
        lblResultado.setText("");
    }
}