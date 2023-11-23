package Entities;

public class PacienteService {
    public Paciente cadastrar(String nome, String cpf, String rg, String telefone, String endereco, String email, String cartao) {
     
        Paciente paciente = new Paciente(nome, cpf, rg, telefone, endereco, email, cartao);
      
        return paciente;
    }
}
