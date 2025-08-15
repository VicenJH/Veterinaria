package co.edu.uniquindio.poo.veterinaria.ViewControllers;

import co.edu.uniquindio.poo.veterinaria.Model.Veterinario;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegistrarVeterinarioViewController {

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
    private TableView<Veterinario> tablaVeterinarios;
    @FXML
    private TableColumn<Veterinario, String> colNombre;
    @FXML
    private TableColumn<Veterinario, String> colApellido;
    @FXML
    private TableColumn<Veterinario, String> colTelefono;
    @FXML
    private TableColumn<Veterinario, String> colDireccion;
    @FXML
    private TableColumn<Veterinario, String> colIdProfesional;

    private ObservableList<Veterinario> listaVeterinarios = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        colNombre.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNombre()));
        colApellido.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getApellido()));
        colTelefono.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getTelefono()));
        colDireccion.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getDireccion()));
        colIdProfesional.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getIdProfesional()));

        tablaVeterinarios.setItems(listaVeterinarios);

        btnRegistrarVeterinario.setOnAction(e -> registrarVeterinario());
    }

    @FXML
    private void registrarVeterinario() {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String telefono = txtTelefono.getText();
        String direccion = txtDireccion.getText();
        String idProfesional = "ID" + (listaVeterinarios.size() + 1);

        Veterinario nuevoVeterinario = new Veterinario(nombre, apellido, telefono, direccion, idProfesional);
        listaVeterinarios.add(nuevoVeterinario);

        txtNombre.clear();
        txtApellido.clear();
        txtTelefono.clear();
        txtDireccion.clear();
    }
}