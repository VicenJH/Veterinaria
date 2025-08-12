package co.edu.uniquindio.poo.veterinaria.Model;

import java.util.LinkedList;

public class Veterinaria {
    String nombre;
    String direccion;
    LinkedList <HistoriaClinica> ListahistoriasClinicas;
    LinkedList<Mascota> listademascotasenclinica;
    LinkedList<Veterinario>veteriniosclinica;
    LinkedList<Propietario>propietariosdemascotas;
    LinkedList<PersonalApoyo>PersonalApoyo;


    public  Veterinaria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ListahistoriasClinicas = new LinkedList<>();
        this.veteriniosclinica = new LinkedList<>();
        this.propietariosdemascotas = new LinkedList<>();
        this.PersonalApoyo = new LinkedList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
