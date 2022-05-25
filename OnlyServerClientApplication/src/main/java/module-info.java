module com.example.onlyserverclientapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.onlyserverclientapplication to javafx.fxml;
    exports com.example.onlyserverclientapplication;
}