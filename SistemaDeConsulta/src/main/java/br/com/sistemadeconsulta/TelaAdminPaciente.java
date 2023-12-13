package br.com.sistemadeconsulta;

import br.com.sistemadeconsulta.classes.Paciente;
import br.com.sistemadeconsulta.dao.PacienteDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

/**
 *
 * @author patri
 */
public class TelaAdminPaciente extends javax.swing.JFrame {

    /**
     * Creates new form TelaPaciente
     */
    public TelaAdminPaciente() {
        initComponents();
        setLocationRelativeTo(null);
        preencheTabelaPacientes(new PacienteDAO().listarPacientes());
    }

    private int getIdPacienteSelecionado() {
        int idPacienteSelecionado = -1; // Valor padrão para indicar que nenhum paciente foi selecionado
        int linhaSelecionada = jTable1.getSelectedRow();

        if (linhaSelecionada >= 0) {
            try {
                idPacienteSelecionado = Integer.parseInt(jTable1.getValueAt(linhaSelecionada, 0).toString());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Erro ao obter ID do paciente: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um paciente na tabela.");
        }

        return idPacienteSelecionado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NomePaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CPFPaciente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome Paciente");

        NomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomePacienteActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Paciente", "Nome Paciente", "CPF ", "RG", "Email", "Numero Cartão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Dados");

        jLabel5.setText("Filtros: ");

        btnBuscar.setText("Pesquisar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Administração Paciente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(26, 26, 26)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnVoltar))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(NomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CPFPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar)
                    .addComponent(BtnVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomePacienteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String nomePaciente = NomePaciente.getText();
            String cpfPaciente = CPFPaciente.getText();

            if (!nomePaciente.isEmpty() || !cpfPaciente.isEmpty()) {
                PacienteDAO pacienteDAO = new PacienteDAO(); // Cria uma instância de PacienteDAO
                List<Paciente> pacientes = (List<Paciente>) pacienteDAO.buscarPorNome(nomePaciente);
                preencheTabelaPacientes(pacientes);
            } else {
                JOptionPane.showMessageDialog(this, "Preencha pelo menos um campo de filtro.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }
    }

    private void preencheTabelaPacientes(List<Paciente> pacientes) {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        for (Paciente paciente : pacientes) {
            modelo.addRow(new Object[]{paciente.getNome(), paciente.getCpf(), paciente.getDataNascimento(), paciente.getEmail(), paciente.getNumeroCartao()});
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        EscolhaTelasAdmin escolha = new EscolhaTelasAdmin();
        escolha.setVisible(true);
        dispose();

    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();

        if (linhaSelecionada >= 0) {
            String nomePaciente = (String) jTable1.getValueAt(linhaSelecionada, 0);
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir o paciente " + nomePaciente + "?");

            if (resposta == JOptionPane.YES_OPTION) {
                PacienteDAO pacienteDAO = new PacienteDAO();
                pacienteDAO.excluirPacientePorNome(nomePaciente);
                preencheTabelaPacientes(pacienteDAO.listarPacientes());
                JOptionPane.showMessageDialog(this, "Paciente excluído com sucesso");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um paciente para excluir.");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
         int idPaciente = getIdPacienteSelecionado();
        if (idPaciente != -1) {
            PacienteDAO pacienteDAO = new PacienteDAO();
            Paciente pacienteSelecionado = pacienteDAO.buscarPacientePorId(idPaciente);

            if (pacienteSelecionado != null) {
                try {
                    String novoNome = JOptionPane.showInputDialog(this, "Digite o novo nome:");
                    String novoCPF = JOptionPane.showInputDialog(this, "Digite o novo CPF:");
                    String novoRG = JOptionPane.showInputDialog(this, "Digite o novo RG:");
                    String novaDataNascimentoString = JOptionPane.showInputDialog(this, "Digite a nova data de nascimento (dd/MM/yyyy):");
                    String novoEmail = JOptionPane.showInputDialog(this, "Digite o novo e-mail:");
                    String novoNumeroCartao = JOptionPane.showInputDialog(this, "Digite o novo número do cartão:");

                    pacienteSelecionado.setNome(novoNome);
                    pacienteSelecionado.setCpf(novoCPF);
                    pacienteSelecionado.setRg(novoRG);

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date novaDataNascimento = dateFormat.parse(novaDataNascimentoString);
                    pacienteSelecionado.setDataNascimento(novaDataNascimento);

                    pacienteSelecionado.setEmail(novoEmail);
                    pacienteSelecionado.setNumeroCartao(novoNumeroCartao);

                    boolean atualizacaoBemSucedida = pacienteDAO.atualizarPaciente(pacienteSelecionado);

                    if (atualizacaoBemSucedida) {
                        JOptionPane.showMessageDialog(this, "Informações do Paciente atualizadas com sucesso!");
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "Falha ao atualizar informações do Paciente.");
                    }
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(this, "Formato de data inválido. Use o formato dd/MM/yyyy.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Paciente não encontrado.");
            }
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdminPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdminPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdminPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdminPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdminPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JTextField CPFPaciente;
    private javax.swing.JTextField NomePaciente;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
