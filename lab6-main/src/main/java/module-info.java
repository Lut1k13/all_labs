module com.example.lab_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.lab_2 to javafx.fxml;
    exports com.example.lab_2;
    exports com.example.lab_2.model;
    opens com.example.lab_2.model to javafx.fxml;
}