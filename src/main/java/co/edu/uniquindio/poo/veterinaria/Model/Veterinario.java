package co.edu.uniquindio.poo.veterinaria.Model;

public class Veterinario extends Persona{
    public String idProfesional;


    public Veterinario(String nombre, String apellido, String telefono, String direccion,String idProfesional) {
        super(nombre, apellido, telefono, direccion);

    }

    public String getIdProfesional() {
        return idProfesional;
    }
    public void setIdProfesional(String idProfesional) {
        this.idProfesional = idProfesional;
    }

}
