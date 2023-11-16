package application;


import Entities.CadastroService;
import Entities.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        CadastroService cadastroService = new CadastroService();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario(cadastroService);

        interfaceUsuario.iniciarCadastro();
    }
}
