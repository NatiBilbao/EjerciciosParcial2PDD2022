module com.example.ejerciciosparcial2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciosparcial2 to javafx.fxml;
    exports com.example.ejerciciosparcial2;
}