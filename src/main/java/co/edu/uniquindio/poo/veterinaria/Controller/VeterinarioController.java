package co.edu.uniquindio.poo.veterinaria.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class VeterinarioController {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtDireccion;
    @FXML
    private Button btnRegistrarVeterinario;
    @FXML
    private TableView<?> tablaVeterinarios;
    @FXML
    private TableColumn<?, ?> colNombre;
    @FXML
    private TableColumn<?, ?> colApellido;
    @FXML
    private TableColumn<?, ?> colTelefono;
    @FXML
    private TableColumn<?, ?> colDireccion;
    @FXML
    private TableColumn<?, ?> colIdProfesional;

    @FXML
    private void initialize() {
        // Aquí puedes inicializar la tabla, listeners, etc.
    }

    @FXML
    private void registrarVeterinario() {
        // Lógica para registrar un veterinario usando los campos de texto
    }
}