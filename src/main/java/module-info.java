module co.edu.uniquindio.poo.veterinaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens co.edu.uniquindio.poo.veterinaria to javafx.fxml;
    exports co.edu.uniquindio.poo.veterinaria.App;
    opens co.edu.uniquindio.poo.veterinaria.App to javafx.fxml;
    exports co.edu.uniquindio.poo.veterinaria.ViewControllers;
    opens co.edu.uniquindio.poo.veterinaria.ViewControllers to javafx.fxml;
}