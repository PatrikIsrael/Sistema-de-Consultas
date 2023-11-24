
package br.com.sistemadeconsulta;

import br.com.sistemadeconsulta.classes.EquipeMedica;
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

    private Date dataSelecionada;
    
    public MarcadorConsultas() {
        initComponents();
        
        setLocationRelativeTo(null);
       carregarEquipesMedicas(); // Método para carregar as equipes médicas ao iniciar o formulário
    }
    // Método para carregar as equipes médicas no jboxEquipeMedica
    private void carregarEquipesMedicas() {
        List<EquipeMedica> equipesMedicas = EquipeMedica.getEquipesMedicas();
        
        // Criar um array de strings para armazenar os nomes das equipes médicas
        String[] nomesEquipes = new String[equipesMedicas.size()];
        
        for (int i = 0; i < equipesMedicas.size(); i++) {
            nomesEquipes[i] = equipesMedicas.get(i).getNomeMedico() + " - " + equipesMedicas.get(i).getEspecialidadeMedica();
        }
        
        // Definir o modelo do ComboBox com os nomes das equipes médicas
        jboxEquipeMedica.setModel(new DefaultComboBoxModel<>(nomesEquipes));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMarcarConsulta1 = new javax.swing.JToggleButton();
        btnSair = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        txtHora = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jboxEquipeMedica = new javax.swing.JComboBox<>();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMarcarConsulta1)
                .addGap(91, 91, 91)
                .addComponent(btnSair)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jboxEquipeMedica, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))))
                        .addGap(0, 217, Short.MAX_VALUE))
                    .addComponent(jDayChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jboxEquipeMedica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnMarcarConsulta1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarcarConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarConsulta1ActionPerformed
int diaSelecionado = jDayChooser1.getDay();

// Criar um objeto Calendar
Calendar calendar = Calendar.getInstance();
calendar.set(Calendar.DAY_OF_MONTH, diaSelecionado);

// Obtendo os valores de dia, mês e ano do Calendar
int dia = calendar.get(Calendar.DAY_OF_MONTH);
int mes = calendar.get(Calendar.MONTH) + 1; // Adicionando 1 porque o mês é base 0
int ano = calendar.get(Calendar.YEAR);

// Formatar a data selecionada
String dataSelecionada = ano + "-" + mes + "-" + dia;

    JOptionPane.showMessageDialog(
        this,
        "Consulta agendada para: " + dataSelecionada,
        "Consulta Agendada",
        JOptionPane.INFORMATION_MESSAGE
    );

    // Recuperar a hora digitada no campo de texto txtHora
    String hora = txtHora.getText();

    // Recuperar a equipe médica selecionada no jboxEquipeMedica
    String equipeMedicaSelecionada = jboxEquipeMedica.getSelectedItem().toString();

    // Verificar se a data, hora e equipe médica foram selecionadas
    if (dataSelecionada != null && !hora.isEmpty() && !equipeMedicaSelecionada.isEmpty()) {
        // Simplesmente exibir uma mensagem indicando que a consulta foi agendada para os dados selecionados
        JOptionPane.showMessageDialog(
            this,
            "Consulta agendada para: " + dataSelecionada + " às " + hora + " com a equipe médica: " + equipeMedicaSelecionada,
            "Consulta Agendada",
            JOptionPane.INFORMATION_MESSAGE
        );
    } else {
        JOptionPane.showMessageDialog(this, "Preencha todos os campos para marcar a consulta.");
    }
    }//GEN-LAST:event_btnMarcarConsulta1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(MarcadorConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcadorConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcadorConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcadorConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jboxEquipeMedica;
    private javax.swing.JFormattedTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
