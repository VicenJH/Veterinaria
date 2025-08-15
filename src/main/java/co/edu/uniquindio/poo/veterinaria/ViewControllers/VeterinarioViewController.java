package co.edu.uniquindio.poo.veterinaria.ViewControllers;

import co.edu.uniquindio.poo.veterinaria.Model.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class VeterinarioViewController {

    @FXML
    private TextField txtBuscarMascota;
    @FXML
    private TableView<ConsultaMedica> tablaHistorial;
    @FXML
    private TableColumn<ConsultaMedica, String> colFecha;
    @FXML
    private TableColumn<ConsultaMedica, String> colDiagnostico;
    @FXML
    private TableColumn<ConsultaMedica, String> colTratamiento;

    @FXML
    private TableView<AgendaCitaMedica> tablaCitas;
    @FXML
    private TableColumn<AgendaCitaMedica, String> colMascota;
    @FXML
    private TableColumn<AgendaCitaMedica, String> colPropietario;
    @FXML
    private TableColumn<AgendaCitaMedica, String> colFechaCita;
    @FXML
    private TableColumn<AgendaCitaMedica, String> colHoraCita;
    @FXML
    private TableColumn<AgendaCitaMedica, String> colMotivo;

    private Veterinaria veterinaria;

    @FXML
    public void initialize() {
        colFecha.setCellValueFactory(data -> new SimpleStringProperty(
                data.getValue().getAgendacitamedica().getFecha().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        ));
        colDiagnostico.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getDiagnostico()));
        colTratamiento.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getTratamiento()));

        colMascota.setCellValueFactory(data -> new SimpleStringProperty("Mascota"));
        colPropietario.setCellValueFactory(data -> new SimpleStringProperty("Propietario"));
        colFechaCita.setCellValueFactory(data -> new SimpleStringProperty(
                data.getValue().getFecha().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        ));
        colHoraCita.setCellValueFactory(data -> new SimpleStringProperty(
                data.getValue().getHora().toString()
        ));
        colMotivo.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMotivoConsulta()));

        if (veterinaria != null) {
            tablaCitas.setItems(FXCollections.observableArrayList(veterinaria.getCitas()));
        }
    }

    @FXML
    private void buscarHistorial() {
        String texto = txtBuscarMascota.getText();
        Mascota mascota = null;
        try {
            int id = Integer.parseInt(texto);
            mascota = veterinaria.buscarMascota(id);
        } catch (NumberFormatException e) {
            for (Mascota m : veterinaria.getListademascotasenclinica()) {
                if (m.getNombre().equalsIgnoreCase(texto)) {
                    mascota = m;
                    break;
                }
            }
        }
        if (mascota != null && mascota.getHistoriaClinica() != null) {
            tablaHistorial.setItems(FXCollections.observableArrayList(
                    mascota.getHistoriaClinica().getConsultas()
            ));
        } else {
            tablaHistorial.setItems(FXCollections.observableArrayList());
        }
    }

    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }
}