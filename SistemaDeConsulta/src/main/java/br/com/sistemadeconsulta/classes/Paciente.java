package br.com.sistemadeconsulta.classes;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    public String nome;
    private String cpf;
    private String rg;
    private String email;
    private String numeroCartao;
    private boolean ativo;

    private static List<Paciente> pacientesCadastrados = new ArrayList<>();

    public Paciente(String nome, String cpf, String rg, String email, String numeroCartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.numeroCartao = numeroCartao;
        this.ativo = ativo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public static List<Paciente> getPacientesCadastrados() {
        return pacientesCadastrados;
    }

    public static void setPacientesCadastrados(List<Paciente> pacientesCadastrados) {
        Paciente.pacientesCadastrados = pacientesCadastrados;
    }

   

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public static boolean cadastrarPaciente(Paciente paciente) {
        // Verifica se já existe um paciente com o mesmo CPF
        for (Paciente p : pacientesCadastrados) {
            if (p.getCpf().equals(paciente.getCpf())) {
                return false; // Já existe um paciente com o mesmo CPF
            }
        }
        pacientesCadastrados.add(paciente);
        return true; // Paciente cadastrado com sucesso
    }

    public static boolean validarLogin(String nome, String cpf) {
        for (Paciente p : pacientesCadastrados) {
            if (p.getNome().equals(nome) && p.getCpf().equals(cpf)) {
                return true; // Dados de login válidos
            }
        }
        return false; // Dados de login inválidos
    }
}
