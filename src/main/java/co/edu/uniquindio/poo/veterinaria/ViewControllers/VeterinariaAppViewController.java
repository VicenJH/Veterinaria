package co.edu.uniquindio.poo.veterinaria.ViewControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VeterinariaAppViewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}