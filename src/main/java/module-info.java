module mx.arturogil.mavenexample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.fasterxml.jackson.databind;
    requires org.apache.commons.io;

    opens mx.arturogil.mavenexample to javafx.fxml;
    exports mx.arturogil.mavenexample;
}