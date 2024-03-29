/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.sistemadeconsulta;

import br.com.sistemadeconsulta.utils.TextUtils;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author patri
 */
public class EscolhaTelasAdmin extends javax.swing.JFrame {

    /**
     * Creates new form EscolhaTelasAdmin
     */
    public EscolhaTelasAdmin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextUtils textUtils = new TextUtils();

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JToggleButton btnTelaEquipeMedica = new javax.swing.JToggleButton();
        javax.swing.JToggleButton btnTelaPaciente = new javax.swing.JToggleButton();
        javax.swing.JToggleButton btnVoltar = new javax.swing.JToggleButton();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        javax.swing.JToggleButton btnConsultas = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textUtils.setLabel(jLabel1, "Escolha uma opção");

        btnTelaEquipeMedica.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        btnTelaEquipeMedica.setText("Equipe Medica");
        btnTelaEquipeMedica.addActionListener(evt -> btnTelaEquipeMedicaActionPerformed());

        btnTelaPaciente.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        btnTelaPaciente.setText("Paciente");
        btnTelaPaciente.addActionListener(evt -> btnTelaPacienteActionPerformed());

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(evt -> btnVoltarActionPerformed());

        btnConsultas.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        btnConsultas.setText("Consultas");
        btnConsultas.addActionListener(evt -> btnConsultasActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnTelaPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTelaEquipeMedica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 127, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(btnTelaEquipeMedica)
                .addGap(18, 18, 18)
                .addComponent(btnTelaPaciente)
                .addGap(18, 18, 18)
                .addComponent(btnConsultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTelaEquipeMedicaActionPerformed() {//GEN-FIRST:event_btnTelaEquipeMedicaActionPerformed
       TelaAdminEquipe equipe = new TelaAdminEquipe();
       equipe.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnTelaEquipeMedicaActionPerformed

    private void btnTelaPacienteActionPerformed() {//GEN-FIRST:event_btnTelaPacienteActionPerformed
       TelaAdminPaciente paciente = new TelaAdminPaciente();
       paciente.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnTelaPacienteActionPerformed

    private void btnVoltarActionPerformed() {//GEN-FIRST:event_btnVoltarActionPerformed
       TelaInicial inicio = new TelaInicial();
       inicio.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConsultasActionPerformed() {//GEN-FIRST:event_btnConsultasActionPerformed
       TelaAdminConsultas consultas= new TelaAdminConsultas();
       consultas.setVisible(true);
    }//GEN-LAST:event_btnConsultasActionPerformed

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
            java.util.logging.Logger.getLogger(EscolhaTelasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new EscolhaTelasAdmin().setVisible(true));
    }
}
