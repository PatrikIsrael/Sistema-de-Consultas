package br.com.sistemadeconsulta;

import br.com.sistemadeconsulta.classes.Consulta;
import br.com.sistemadeconsulta.classes.EquipeMedica;
import br.com.sistemadeconsulta.dao.ConsultaDAO;
import br.com.sistemadeconsulta.dao.EquipeMedicaDAO;
import br.com.sistemadeconsulta.utils.TextUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author patri
 */
public class MarcadorConsultas extends javax.swing.JFrame {

    private final ConsultaDAO consultaDAO;
    private final EquipeMedicaDAO equipeMedicaDAO;


    public MarcadorConsultas() {
        initComponents();
        setLocationRelativeTo(null);
        consultaDAO = new ConsultaDAO();
        equipeMedicaDAO = new EquipeMedicaDAO();
        carregarEquipesMedicas();
        carregarHoras();

    }

    private void carregarEquipesMedicas() {
        try {
            List<EquipeMedica> equipesMedicas = equipeMedicaDAO.buscarTodasEquipesMedicas();

            if (equipesMedicas != null) {
                String[] nomesEquipes = new String[equipesMedicas.size()];

                for (int i = 0; i < equipesMedicas.size(); i++) {
                    nomesEquipes[i] = equipesMedicas.get(i).getNomeMedico() + " - " + equipesMedicas.get(i).getEspecialidadeMedica();
                }

                jboxEquipeMedica.setModel(new DefaultComboBoxModel<>(nomesEquipes));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }
    }

    private void carregarHoras() {
        String[] horas = {"08:00", "09:00", "10:00", "11:00", "14:00", "15:00", "16:00", "17:00"};
        jComboBoxHoras.setModel(new DefaultComboBoxModel<>(horas));
    }



  private EquipeMedica buscarEquipeMedicaSelecionada() {
    try {
        String nomeEquipeSelecionada = (String) jboxEquipeMedica.getSelectedItem();
        assert nomeEquipeSelecionada != null;
        String nomeMedicoSelecionado = nomeEquipeSelecionada.split(" - ")[0];
        // Busca a equipe médica pelo nome do médico selecionado
        return equipeMedicaDAO.buscarEquipeMedicaPorNome(nomeMedicoSelecionado);
    } catch (Exception ex) {
        ex.printStackTrace();
        return null;
    }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextUtils textUtils = new TextUtils();

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        javax.swing.JToggleButton btnMarcarConsulta1 = new javax.swing.JToggleButton();
        javax.swing.JToggleButton btnSair = new javax.swing.JToggleButton();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        jboxEquipeMedica = new javax.swing.JComboBox<>();
        javax.swing.JToggleButton btnVoltar = new javax.swing.JToggleButton();
        jComboBoxHoras = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        txtNomePaciente = new javax.swing.JTextField();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textUtils.setLabel(jLabel1, "Selecione a data da consulta");

        btnMarcarConsulta1.setText("Marcar Consulta");
        btnMarcarConsulta1.addActionListener(evt -> btnMarcarConsulta1ActionPerformed());

        btnSair.setText("Sair");
        btnSair.addActionListener(evt -> btnSairActionPerformed());

        textUtils.setLabel(jLabel2, "Selecione a hora da consultar");
        textUtils.setLabel(jLabel3, "Selecione Equipe médica");

        jboxEquipeMedica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jboxEquipeMedica.addActionListener(evt -> jboxEquipeMedicaActionPerformed());

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(evt -> btnVoltarActionPerformed());

        jComboBoxHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxHoras.addActionListener(evt -> jComboBoxHorasActionPerformed());

        textUtils.setLabel(jLabel4, "Nome Paciente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jComboBoxHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jboxEquipeMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMarcarConsulta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addGap(69, 69, 69)
                        .addComponent(btnSair)
                        .addGap(21, 21, 21))
                    .addComponent(jDayChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jboxEquipeMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnMarcarConsulta1)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarcarConsulta1ActionPerformed() {//GEN-FIRST:event_btnMarcarConsulta1ActionPerformed

        int diaSelecionado = jDayChooser1.getDay();

        // Obtendo os valores de hora e equipe médica selecionados
        String horaSelecionadaString = (String) jComboBoxHoras.getSelectedItem();
        String nomePaciente = txtNomePaciente.getText();
        EquipeMedica equipeMedica = buscarEquipeMedicaSelecionada();

        // Verificação de campos vazios e equipe médica encontrada
        if (horaSelecionadaString != null && horaSelecionadaString.isEmpty() || nomePaciente.isEmpty() || equipeMedica == null) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos para marcar a consulta.");
            return;
        }

        // Criação do objeto Calendar e definição da data
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, diaSelecionado);

        // Obtendo os valores de dia, mês e ano do Calendar
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH) + 1;
        int ano = calendar.get(Calendar.YEAR);


        try {

            LocalTime horaSelecionada = horaSelecionadaString != null ? LocalTime.parse(horaSelecionadaString) : LocalTime.now();
            LocalDate dataSelecionada = LocalDate.of(ano, mes, dia);

            Consulta consulta = new Consulta();
            consulta.setPaciente(consultaDAO.buscarPacientePorNome(nomePaciente));
            consulta.setDataConsulta(dataSelecionada);
            consulta.setHoraConsulta(horaSelecionada);
            consulta.setEquipe(equipeMedica);

            if (consultaDAO.verificarDisponibilidadeConsulta(dataSelecionada, horaSelecionada, equipeMedica)) {
                consultaDAO.agendarConsulta(consulta);
                JOptionPane.showMessageDialog(this, "Consulta agendada com sucesso!");

                // Recarrega os horários disponíveis após o agendamento
                reloadHorariosDisponiveis(horaSelecionadaString);

                TelaInicial telaInicial = new TelaInicial();
                telaInicial.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Já existe uma consulta marcada para este horário e equipe. Por favor, selecione outro horário ou equipe.");
            }
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao converter hora ou data.");
        }
    }

    private void reloadHorariosDisponiveis(String horarioOcupado) {
        String[] novosHorarios = new String[jComboBoxHoras.getItemCount() - 1];
        int index = 0;

        for (int i = 0; i < jComboBoxHoras.getItemCount(); i++) {
            String hora = jComboBoxHoras.getItemAt(i);

            if (!hora.equals(horarioOcupado)) {
                novosHorarios[index] = hora;
                index++;
            }
        }

        jComboBoxHoras.setModel(new DefaultComboBoxModel<>(novosHorarios));
    }


    private void btnSairActionPerformed() {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVoltarActionPerformed() {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaLoginPaciente pacientelogin = new TelaLoginPaciente();
        pacientelogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jboxEquipeMedicaActionPerformed() {//GEN-FIRST:event_jboxEquipeMedicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxEquipeMedicaActionPerformed

    private void jComboBoxHorasActionPerformed() {//GEN-FIRST:event_jComboBoxHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHorasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcadorConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MarcadorConsultas().setVisible(true));
    }

    private javax.swing.JComboBox<String> jComboBoxHoras;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JComboBox<String> jboxEquipeMedica;
    private javax.swing.JTextField txtNomePaciente;
    // End of variables declaration//GEN-END:variables
}
