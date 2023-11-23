
package Entities;



import java.util.Date;

public class Consulta {
    private Date dataConsulta;
    private String tipoConsulta;
    private Paciente paciente;
    private Medico medico;
    private Enfermeiro enfermeiro;

    public Consulta(Date dataConsulta, String tipoConsulta, Paciente paciente, Medico medico, Enfermeiro enfermeiro) {
        this.dataConsulta = dataConsulta;
        this.tipoConsulta = tipoConsulta;
        this.paciente = paciente;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
    }

    // Getters e setters
    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }
}

