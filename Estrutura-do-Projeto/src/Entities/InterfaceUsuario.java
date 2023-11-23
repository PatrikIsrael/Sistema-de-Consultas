package Entities;

import java.util.Scanner;

public class InterfaceUsuario {
    private final PacienteService pacienteService;

    public InterfaceUsuario(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    public void iniciarCadastro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite seu RG: ");
        String rg = scanner.nextLine();

        System.out.println("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();
        
        System.out.println("Digite seu número do Cartao: ");
        String cartao =  scanner.nextLine();

        // Realizando o cadastro
        Paciente paciente = pacienteService.cadastrar(nome, cpf, rg, telefone, endereco, email, cartao);

        System.out.println(paciente);
        System.out.println("Cadastro Realizado com sucesso!! ");

        scanner.close();
    }
}
