module com.mycompany.tabla {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tabla to javafx.fxml;
    exports com.mycompany.tabla;
}
