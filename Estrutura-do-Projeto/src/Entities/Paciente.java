
package Entities;

public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private int idade;
    private String endereco;
    
    public Paciente(String nome, String cpf, String telefone, String endereco, String endereco1, String email, String cartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Getters e setters
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
     @Override
    public String toString() {
        return "Paciente{" +
                "nome= '" + nome + '\'' +
                ", cpf= '" + cpf + '\'' +
                ", telefone= ' " + telefone + '\'' +
                ", idade= " + idade +
                ", endereco= '" + endereco + '\'' +
                '}';
    }
} 
