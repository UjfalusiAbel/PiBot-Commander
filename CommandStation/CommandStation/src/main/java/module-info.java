module com.commandstation.commandstation {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.commandstation.commandstation to javafx.fxml;
    exports com.commandstation.commandstation;
    exports com.commandstation.controllers;
    opens com.commandstation.controllers to javafx.fxml;
}