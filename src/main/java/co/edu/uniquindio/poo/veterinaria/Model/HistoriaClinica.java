package co.edu.uniquindio.poo.veterinaria.Model;

public class HistoriaClinica {
    Mascota mascota;

    public HistoriaClinica(Mascota mascota) {
        this.mascota = mascota;
    }
    public Mascota getMascota() {
        return mascota;
    }
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

}
