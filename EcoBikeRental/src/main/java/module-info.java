module com.example.ecobikerental {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ecobikerental to javafx.fxml;
    exports com.example.ecobikerental;
}