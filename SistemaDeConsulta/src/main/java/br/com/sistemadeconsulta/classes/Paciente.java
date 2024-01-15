package br.com.sistemadeconsulta.classes;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Long idPaciente;

    private String nome;
    private String cpf;
    private String rg;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    private String email;

    @Column(name = "numero_cartao")
    private String numeroCartao;

    @Column(name = "numero_telefone")
    private String numeroTelefone;

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public boolean validarCPF() {
        return this.cpf != null && this.cpf.length() == 11;
    }

    public boolean validarRG() {
        return this.rg != null && this.rg.length() <= 7;
    }
    
    public boolean ValidarTelefone(){
        return this.numeroTelefone != null && this.numeroTelefone.length() == 11;
    }
}
