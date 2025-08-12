package co.edu.uniquindio.poo.veterinaria.Model;

public class ConsultaMedica {
    private Agenda agenda;
    private String diagnostico;
    private String tratamiento;

    public ConsultaMedica(AgendaCitaMedica agendacitamedica, String diagnostico,  String tratamiento) {
        this.agendacitamedica = agendacitamedica;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;


    }


}
