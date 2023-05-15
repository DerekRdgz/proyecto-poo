/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ConexionDB;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
public class Reportes extends javax.swing.JFrame {

    /**
     * Creates new form ReporteDiario
     */
    public Reportes() {
        
        
        
        
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rep_diario = new javax.swing.JButton();
        rep_semanal = new javax.swing.JButton();
        rep_mensual = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        reporteCompras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rep_diario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rep_diario.setText("Reporte de Egresos Diarios");
        rep_diario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep_diarioActionPerformed(evt);
            }
        });
        getContentPane().add(rep_diario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 190, 40));

        rep_semanal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rep_semanal.setText("Reporte de Egresos Semanales");
        rep_semanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep_semanalActionPerformed(evt);
            }
        });
        getContentPane().add(rep_semanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 210, 40));

        rep_mensual.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rep_mensual.setText("Reporte de Egresos Mensuales");
        rep_mensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep_mensualActionPerformed(evt);
            }
        });
        getContentPane().add(rep_mensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 210, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 90, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Reporte Ingresos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 130, 40));

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Reporte por Tipo de Gasto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, 40));

        reporteCompras.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        reporteCompras.setText("Reporte de Compras");
        reporteCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteComprasActionPerformed(evt);
            }
        });
        getContentPane().add(reporteCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 150, 40));

        jLabel1.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel1.setText("Reportes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    private void rep_diarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep_diarioActionPerformed
        // TODO add your handling code here:
        JTextField field1 = new JTextField();
        
        Object[] fields = { "Ingresa el día del que necesitas el reporte", field1};

        JOptionPane.showConfirmDialog(null, fields, "buscador dias", JOptionPane.OK_CANCEL_OPTION);
        int temp1 = 0;
        int temp2 = Integer.parseInt(field1.getText());
        GeneradorReportes gastoDiario = new GeneradorReportes();
        gastoDiario.obtenerGastosDiarios(temp2, temp1); 

        
    }//GEN-LAST:event_rep_diarioActionPerformed

    private void rep_mensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep_mensualActionPerformed
        JTextField field1 = new JTextField();
        
        Object[] fields = { "Ingresa el día del que necesitas el reporte", field1};

        JOptionPane.showConfirmDialog(null, fields, "Buscador días", JOptionPane.OK_CANCEL_OPTION);
        int temp1 = 2;
        int temp2 = Integer.parseInt(field1.getText());
        GeneradorReportes gastoDiario = new GeneradorReportes();
        gastoDiario.obtenerGastosDiarios(temp2, temp1); 
    }//GEN-LAST:event_rep_mensualActionPerformed

    private void rep_semanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep_semanalActionPerformed
        // TODO add your handling code here:
        JTextField field1 = new JTextField();
        
        Object[] fields = { "Ingresa el día del que necesitas el reporte", field1};

        JOptionPane.showConfirmDialog(null, fields, "Buscador días", JOptionPane.OK_CANCEL_OPTION);
        int temp1 = 1;
        int temp2 = Integer.parseInt(field1.getText());
        GeneradorReportes gastoDiario = new GeneradorReportes();
        gastoDiario.obtenerGastosDiarios(temp2, temp1); 
    }//GEN-LAST:event_rep_semanalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        pantalla_principal pp = new pantalla_principal ();
        pp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           JTextField field1 = new JTextField();
        
        Object[] fields = { "Ingresa el día del que necesitas el reporte de ingresos", field1};

        JOptionPane.showConfirmDialog(null, fields, "Buscador de dias", JOptionPane.OK_CANCEL_OPTION);
        int temp1 = 3;
        int temp2 = Integer.parseInt(field1.getText());
        GeneradorReportes gastoDiario = new GeneradorReportes();
        gastoDiario.obtenerGastosDiarios(temp2, temp1); 
        
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        
        Object[] fields = {"Ingresa si quieres el reporte \n Diario(0)\n Semanal(1)\n Mensual(2)",field1, "Ingresa el tipo de gasto a buscar: ", field2};

        JOptionPane.showConfirmDialog(null, fields, "buscador tipo de gasto", JOptionPane.OK_CANCEL_OPTION);
        int temp1 = Integer.parseInt(field1.getText());
        String temp2 = field2.getText();
        
        Reporte_tipo_gasto reportegasto = new Reporte_tipo_gasto();
        reportegasto.obtenerReportetTipoGasto(temp1, temp2);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void reporteComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteComprasActionPerformed
       
        GeneradorReportesCompras reportecompra = new GeneradorReportesCompras();
        reportecompra.obtenercompras();
        
    }//GEN-LAST:event_reporteComprasActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
            
            
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton rep_diario;
    private javax.swing.JButton rep_mensual;
    private javax.swing.JButton rep_semanal;
    private javax.swing.JButton reporteCompras;
    // End of variables declaration//GEN-END:variables
}
