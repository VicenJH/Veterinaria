package co.edu.uniquindio.poo.veterinaria.Model;

public class Veterinario extends Persona{


    public Veterinario(String nombre, String apellido, String telefono, String direccion,String idProfesional) {
        super(nombre, apellido, telefono, direccion);

    }

    public int getIdProfesional() {
        return idProfesional;
    }
    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

}
