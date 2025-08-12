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

//constructor de la clase Veterinaria
    public  Veterinaria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ListahistoriasClinicas = new LinkedList<>();
        this.veteriniosclinica = new LinkedList<>();
        this.propietariosdemascotas = new LinkedList<>();
        this.PersonalApoyo = new LinkedList<>();
        this.listademascotasenclinica = new LinkedList<>();
    }
    // Getters y Setters
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

//Metodo para verificar si por el numero de telefono ya esta registrado el propietario
    public boolean verificarPropietario(String telefono) {
        for (Propietario propietario : propietariosdemascotas) {
            if (propietario.getTelefono().equals(telefono)) {
                return false;
            }
        }
        return true;
    }

//metodo que verifica si el veterinario ya esta registrado por su id
    public boolean verificarVeterianario(String idProfesional) {
        for (Veterinario veterinario : veteriniosclinica) {
            if (veterinario.getIdProfesional().equals(idProfesional)) {
                return false;
            }
        }
        return true;
    }

    // Metodo para registrar un propietario
    public boolean registrarPropietario(Propietario propietario) {
        if (verificarPropietario(propietario.getTelefono())) {
            propietariosdemascotas.add(propietario);
            return true;
        }
        return false;
    }

// Metodo para registrar un veterinario
    public boolean registrarMascota(Mascota mascota) {
        for (Mascota NuevaMascota : listademascotasenclinica) {
            if (NuevaMascota.getId() == mascota.getId()) {
                return false;
            }
        }
        listademascotasenclinica.add(mascota);
        return true;
    }
// Metodo para registrar un veterinario
    public boolean registrarVeterinario(Veterinario veterinario) {
        if (verificarVeterianario(veterinario.getIdProfesional())) {
            veteriniosclinica.add(veterinario);
            return true;
        }
        return false;
    }
    //metodo para asignar un id ramdon a la mascota
    public void asignarIdMascota() {
        for (Mascota mascota : listademascotasenclinica) {
            if (mascota.getId() == 0) {
                int idmascota;
                do {
                    idmascota = (int)(Math.random() * 9000000) + 1000000;
                } while (idYaExiste(idmascota));

                mascota.setId(idmascota);
                return;
            }
        }
    }

    private boolean idYaExiste(int id) {
        for (Mascota mascota : listademascotasenclinica) {
            if (mascota.getId() == id) {
                return true;
            }
        }
        return false;
    }


}




