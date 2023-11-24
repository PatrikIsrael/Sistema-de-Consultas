
package br.com.sistemadeconsulta.classes;

import java.util.Date;

public class Consulta {
    private Date dataConsulta;
    private String nomePaciente;
    private String nomeMedico;
    private String especialidadeMedica;
    private String nomeEnfermeira;

    // Construtor
    public Consulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.especialidadeMedica = especialidadeMedica;
        this.nomeEnfermeira = nomeEnfermeira;
    }

    // Getters e Setters
    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecialidadeMedica() {
        return especialidadeMedica;
    }

    public void setEspecialidadeMedica(String especialidadeMedica) {
        this.especialidadeMedica = especialidadeMedica;
    }

    public String getNomeEnfermeira() {
        return nomeEnfermeira;
    }

    public void setNomeEnfermeira(String nomeEnfermeira) {
        this.nomeEnfermeira = nomeEnfermeira;
    }
}

