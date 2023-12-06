package br.com.sistemadeconsulta;

import br.com.sistemadeconsulta.classes.Consulta;
import br.com.sistemadeconsulta.classes.EquipeMedica;
import br.com.sistemadeconsulta.dao.ConsultaDAO;
import br.com.sistemadeconsulta.dao.EquipeMedicaDAO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author patri
 */
public class MarcadorConsultas extends javax.swing.JFrame {

    private final ConsultaDAO consultaDAO;
    private final EquipeMedicaDAO equipeMedicaDAO;
    private Date dataSelecionada;

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
            } else {
                // Tratar caso não seja possível carregar as equipes médicas
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }
    }

    private void carregarHoras() {
        String[] horas = {"08:00", "09:00", "10:00", "11:00", "14:00", "15:00", "16:00", "17:00"};
        jComboBoxHoras.setModel(new DefaultComboBoxModel<>(horas));
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMarcarConsulta1 = new javax.swing.JToggleButton();
        btnSair = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jboxEquipeMedica = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JToggleButton();
        jComboBoxHoras = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNomePaciente = new javax.swing.JTextField();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Selecione a data da consulta");

        btnMarcarConsulta1.setText("Marcar Consulta");
        btnMarcarConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarConsulta1ActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Selecione a hora da consultar");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Selecione Equipe médica");

        jboxEquipeMedica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jboxEquipeMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxEquipeMedicaActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jComboBoxHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHorasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Nome Paciente");

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

    private void btnMarcarConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarConsulta1ActionPerformed
        // Obtendo o dia selecionado do jDayChooser1
        int diaSelecionado = jDayChooser1.getDay();

        // Obtendo os valores de hora e equipe médica selecionados
        String horaSelecionadaString = (String) jComboBoxHoras.getSelectedItem();
        String nomePaciente = txtNomePaciente.getText();
        EquipeMedica equipeMedica = buscarEquipeMedicaPorNome(jboxEquipeMedica.getSelectedItem().toString());

        // Verificação de campos vazios
        if (horaSelecionadaString.isEmpty() || nomePaciente.isEmpty() || equipeMedica != null) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos para marcar a consulta.");
            return;
        }

        // Criação do objeto Calendar e definição da data
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, diaSelecionado);
        // Adicione aqui a definição do mês e do ano caso você possua campos separados para isso.

        // Obtendo os valores de dia, mês e ano do Calendar
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH) + 1; // Adicionando 1 porque o mês é base 0
        int ano = calendar.get(Calendar.YEAR);

        // Tratamento de erros e conversão para data e hora
        try {
            LocalTime horaSelecionada = LocalTime.parse(horaSelecionadaString);
            LocalDate dataSelecionada = LocalDate.of(ano, mes, dia);

            // Restante do seu código para agendar a consulta usando os dados obtidos
            Consulta consulta = new Consulta();
            consulta.setPaciente(consultaDAO.buscarPacientePorNome(nomePaciente));
            consulta.setDataConsulta(dataSelecionada);
            consulta.setHoraConsulta(horaSelecionada);
            consulta.setEquipe(equipeMedica);

            if (consultaDAO.verificarDisponibilidadeConsulta(dataSelecionada, horaSelecionada, equipeMedica)) {
                consultaDAO.agendarConsulta(consulta);
                JOptionPane.showMessageDialog(this, "Consulta agendada com sucesso!");

                
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

    private EquipeMedica buscarEquipeMedicaPorNome(String nomeEquipe) {
        return equipeMedicaDAO.buscarEquipeMedicaPorNome(nomeEquipe);

    }//GEN-LAST:event_btnMarcarConsulta1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaLoginPaciente pacientelogin = new TelaLoginPaciente();
        pacientelogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jboxEquipeMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxEquipeMedicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxEquipeMedicaActionPerformed

    private void jComboBoxHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHorasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MarcadorConsultas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcadorConsultas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcadorConsultas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcadorConsultas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcadorConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnMarcarConsulta1;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JToggleButton btnVoltar;
    private javax.swing.JComboBox<String> jComboBoxHoras;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jboxEquipeMedica;
    private javax.swing.JTextField txtNomePaciente;
    // End of variables declaration//GEN-END:variables
}
