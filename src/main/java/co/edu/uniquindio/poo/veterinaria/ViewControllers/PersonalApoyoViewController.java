package co.edu.uniquindio.poo.veterinaria.ViewControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import utils.SceneManager;

public class PersonalApoyoViewController {

    @FXML
    private Button btnAgendarConsulta;

    @FXML
    private Button btnRegistrarMascota;

    @FXML
    private Button btnRegistrarPropietario;

    @FXML
    private Button btnRegistrarVeterinario;

    @FXML
    private Button btnBack;

    @FXML
    void OnAgendarConsulta(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        SceneManager.cambiarEscena(stage, "AgendarConsulta.fxml");
    }

    @FXML
    void OnRegistrarMascota(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        SceneManager.cambiarEscena(stage, "RegistrarMascota.fxml");

    }
    @FXML
    void OnRegistrarPropietario(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        SceneManager.cambiarEscena(stage, "AgregarPropietario.fxml");
    }

    @FXML
    void OnRegistrarVeterinario(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        SceneManager.cambiarEscena(stage, "RegistrarVeterinario.fxml");

    }

    @FXML
    void OnSalir(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        SceneManager.cambiarEscena(stage, "VeterinariaApp.fxml");

    }

}
