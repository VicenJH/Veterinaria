package co.edu.uniquindio.poo.veterinaria.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class AgendaCitaMedica {
    private LocalDate fecha;
    private LocalTime hora;
    private String motivoConsulta;

    public AgendaCitaMedica(LocalDate fecha, LocalTime hora, String motivoConsulta) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoConsulta = motivoConsulta;

    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public String getMotivoConsulta() {
        return motivoConsulta;
    }
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

}
