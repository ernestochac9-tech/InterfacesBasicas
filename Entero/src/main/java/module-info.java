module com.mycompany.entero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.entero to javafx.fxml;
    exports com.mycompany.entero;
}
