package application;

import Entities.PacienteService;
import Entities.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        PacienteService pacienteService = new PacienteService();
        InterfaceUsuario interfaceUsusario = new InterfaceUsuario(pacienteService);

        interfaceUsusario.iniciarCadastro();
    }
}
