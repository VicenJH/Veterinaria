package co.edu.uniquindio.poo.veterinaria.Model;

import java.util.LinkedList;

public class Propietario extends Persona    {
     LinkedList<Mascota>mascotaspropias;

    public Propietario(String nombre, String apellido, String telefono, String direccion) {
        super(nombre, apellido, telefono, direccion);
        this.mascotaspropias=new LinkedList<>();

    }
    public LinkedList getMascotasPropias() {
        return mascotaspropias;
    }

    public void setMascotaspropias(LinkedList<Mascota> mascotaspropias) {
        this.mascotaspropias = mascotaspropias;
    }
}
