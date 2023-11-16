package Entities;

import java.util.Scanner;


public class InterfaceUsuario {
    private final CadastroService cadastroService;

    public InterfaceUsuario(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    public void iniciarCadastro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu CPF: ");
        String CPF = scanner.nextLine();

        System.out.println("Digite seu RG: ");
        String RG = scanner.nextLine();

        System.out.println("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();
        
        System.out.println("Digite seu numero do Cartao: ");
        String Cartao =  scanner.nextLine();

        // Realizando o cadastro
        Cadastro cadastro = cadastroService.cadastrar(nome, CPF, RG, telefone, endereco, email, Cartao);
    
        System.out.println(cadastro);
        
        scanner.close();
    }
}
