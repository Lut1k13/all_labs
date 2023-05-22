module com.example.dao {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.dao to javafx.fxml;
    exports com.example.dao;
}