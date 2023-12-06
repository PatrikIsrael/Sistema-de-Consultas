package br.com.sistemadeconsulta.classes;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "Consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulta")
    private int idConsulta;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @Column(name = "data_consulta")
    private LocalDate dataConsulta;

    @Column(name = "hora_consulta")
    private LocalTime horaConsulta;

    @ManyToOne
    @JoinColumn(name = "id_equipe_medica")
    private EquipeMedica equipe;

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        if (dataConsulta != null) {
            this.dataConsulta = dataConsulta;
        } else {
            throw new IllegalArgumentException("A data da consulta não pode ser nula.");
        }
    }

    public LocalTime getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(LocalTime horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public EquipeMedica getEquipe() {
        return equipe;
    }

    public void setEquipe(EquipeMedica equipe) {
        this.equipe = equipe;
    }

    public String formatarDataHoraConsulta() {
        return "Hora da Consulta: " + horaConsulta;
    }

}
