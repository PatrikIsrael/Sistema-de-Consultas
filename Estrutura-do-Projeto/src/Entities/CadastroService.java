package Entities;


public class CadastroService {
    public Cadastro cadastrar(String nome, String CPF, String RG, String telefone, String endereco, String email, String Cartao) {
        // Validação dos dados poderia ser realizada aqui
        return new Cadastro(nome, CPF, RG, telefone, endereco, email,Cartao);
    }
}
