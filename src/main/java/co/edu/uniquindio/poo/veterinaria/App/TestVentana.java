package co.edu.uniquindio.poo.veterinaria.App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestVentana extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/veterinaria/RegistrarVeterinario.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Test Registrar Veterinario");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}