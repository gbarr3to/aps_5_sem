module com.example.onlyserverclientapplication_chatside {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.onlyserverclientapplication_chatside to javafx.fxml;
    exports com.example.onlyserverclientapplication_chatside;
}