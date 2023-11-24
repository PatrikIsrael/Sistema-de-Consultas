package br.com.sistemadeconsulta.classes;

import java.util.ArrayList;
import java.util.List;

public class EquipeMedica {
    private String nomeMedico;
    private String especialidadeMedica;
    private String nomeEnfermeira;

    private static List<EquipeMedica> equipesMedicas = new ArrayList<>();

    // Método para cadastrar uma nova equipe médica
    public static boolean cadastrarEquipeMedica(EquipeMedica equipeMedica) {
        return equipesMedicas.add(equipeMedica);
    }

    // Método para obter a lista de equipes médicas cadastradas
    public static List<EquipeMedica> getEquipesMedicas() {
        return equipesMedicas;
    }

    // Construtor
    public EquipeMedica(String nomeMedico, String especialidadeMedica, String nomeEnfermeira) {
        this.nomeMedico = nomeMedico;
        this.especialidadeMedica = especialidadeMedica;
        this.nomeEnfermeira = nomeEnfermeira;
    }

    // Getters e Setters
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
