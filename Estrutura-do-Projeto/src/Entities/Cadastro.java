package Entities;

public class Cadastro {
    private String nome;
    private String CPF;
    private String RG;
    private String Telefone;
    private String Endereco;
    private String Email;
    private String Cartao;

    public Cadastro(String nome, String CPF, String RG, String Telefone, String Endereco, String Email, String Cartao) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.Email = Email;
        this.Cartao = Cartao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCartao() {
        return Cartao;
    }

    public void setCartao(String Cartao) {
        this.Cartao = Cartao;
    }
    
      @Override
    public String toString() {
        return "Cadastro realizado com sucesso!\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + CPF + "\n" +
                "RG: " + RG + "\n" +
                "Telefone: " + Telefone + "\n" +
                "Endereço: " + Endereco + "\n" +
                "E-mail: " + Email;
    }
}
