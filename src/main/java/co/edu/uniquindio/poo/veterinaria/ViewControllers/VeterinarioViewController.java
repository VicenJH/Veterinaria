package co.edu.uniquindio.poo.veterinaria.ViewControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.SceneManager;

public class VeterinarioViewController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnSearch;

    @FXML
    private TableColumn<?, ?> colDiagnostico;

    @FXML
    private TableColumn<?, ?> colFecha;

    @FXML
    private TableColumn<?, ?> colFechaCita;

    @FXML
    private TableColumn<?, ?> colHoraCita;

    @FXML
    private TableColumn<?, ?> colMascota;

    @FXML
    private TableColumn<?, ?> colMotivo;

    @FXML
    private TableColumn<?, ?> colPropietario;

    @FXML
    private TableColumn<?, ?> colTratamiento;

    @FXML
    private TableView<?> tablaCitas;

    @FXML
    private TableView<?> tablaHistorial;

    @FXML
    private TextField txtBuscarMascota;

    @FXML
    void OnBack(ActionEvent event) {
        // Logic to go back to the previous screen
        // This could be implemented by changing the scene or closing the current window
        // For example:
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        SceneManager.cambiarEscena(stage, "VeterinariaApp.fxml");

    }

    @FXML
    void OnSearch(ActionEvent event) {

    }

}

