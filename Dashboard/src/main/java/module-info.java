module com.dashboard {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.dashboard to javafx.fxml;
    exports com.dashboard;
    exports com.dashboard.Controller;
    opens com.dashboard.Controller to javafx.fxml;

    exports com.dashboard.Model;
    opens com.dashboard.Model to javafx.fxml;
}