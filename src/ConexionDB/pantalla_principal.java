/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ConexionDB;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author herna
 */
public class pantalla_principal extends javax.swing.JFrame {

    /**
     * Creates new form pantalla_principañ
     */
    public pantalla_principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mensuales = new javax.swing.JButton();
        diario = new javax.swing.JButton();
        semanales = new javax.swing.JButton();
        IngresosMensuales = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        repDiario1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Menú Principal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 250, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Ingresar una Compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 150, 40));

        mensuales.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mensuales.setText("Gastos Mensuales");
        mensuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensualesActionPerformed(evt);
            }
        });
        getContentPane().add(mensuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 40));

        diario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        diario.setText("Gastos Diarios");
        diario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diarioActionPerformed(evt);
            }
        });
        getContentPane().add(diario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 150, 40));

        semanales.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        semanales.setText("Gastos Semanales");
        semanales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semanalesActionPerformed(evt);
            }
        });
        getContentPane().add(semanales, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, 40));

        IngresosMensuales.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        IngresosMensuales.setText("Ingresos Mensuales");
        IngresosMensuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresosMensualesActionPerformed(evt);
            }
        });
        getContentPane().add(IngresosMensuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 150, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 100, 40));

        repDiario1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        repDiario1.setText("Reportes");
        repDiario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repDiario1ActionPerformed(evt);
            }
        });
        getContentPane().add(repDiario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DatosPersonales dp = new DatosPersonales();
        dp.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mensualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensualesActionPerformed
        int i = 1;
        while(i == 1){
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        
        Object[] fields = { "Mes del gasto", field1,"Tipo de gasto mensual", field2, "Monto del gasto mensual", field3};

        JOptionPane.showConfirmDialog(null, fields, "Gastos mensuales", JOptionPane.OK_CANCEL_OPTION);
        int temp1 = Integer.parseInt(field1.getText());
        
        
         try{                 
                    ConexionBase conectado = new ConexionBase();
                    Connection con1 = conectado.getConnection();
                    Statement st= con1.createStatement();
                    String SQLGuardar= "INSERT INTO GASTOSMENSUALES(id_gasto_m,tipo_gasto_m,gasto_m)VALUES(?,?,?)";
                    PreparedStatement pst = con1.prepareCall(SQLGuardar);
                    
                    pst.setString(1,field1.getText());
                    pst.setString(2,field2.getText());
                    pst.setString(3,field3.getText());
                    
                    int n = pst.executeUpdate();
                    
                if (n>0){
                    JOptionPane.showMessageDialog(null,"Datos guardados correctamente\n");
                    pst.close();
                    i = Integer.parseInt(JOptionPane.showInputDialog("Si quieres continuar ingresa 1 \n Para salir ingresa 0"));
                }
                    
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Datos guardados erroneamente"+ ex);
                }
        
        }
    }//GEN-LAST:event_mensualesActionPerformed

    private void diarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diarioActionPerformed
        int i = 1;
        while(i == 1){
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        
        Object[] fields = { "Dia del gasto", field1,"Tipo de gasto diario", field2, "Monto del gasto diario", field3};

        JOptionPane.showConfirmDialog(null, fields, "Gastos diario", JOptionPane.OK_CANCEL_OPTION);
        
        int temp1 = Integer.parseInt(field1.getText());
        
         try{                 
                    ConexionBase conectado = new ConexionBase();
                    Connection con1 = conectado.getConnection();
                    Statement st= con1.createStatement();
                    String SQLGuardar= "INSERT INTO GASTOSDIARIOS(id_gasto_d,tipo_gasto_d,gasto_d)VALUES(?,?,?)";
                    PreparedStatement pst = con1.prepareCall(SQLGuardar);
                    
                    pst.setString(1,field1.getText());
                    pst.setString(2,field2.getText());
                    pst.setString(3,field3.getText());
                    
                    int n = pst.executeUpdate();
                    
                if (n>0){
                    JOptionPane.showMessageDialog(null,"Datos guardados correctamente\n");
                    pst.close();
                    
                     i = Integer.parseInt(JOptionPane.showInputDialog("Si quieres continuar ingresa 1 \n Para salir ingresa 0"));
                    
                    
                }
                    
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Datos guardados erroneamente"+ ex);
                }}
    }//GEN-LAST:event_diarioActionPerformed

    private void semanalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semanalesActionPerformed
       
        int i =1;
        while (i==1){
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        
        Object[] fields = { "Semana", field1,"Tipo de gasto semanal", field2, "Monto del gasto semanal", field3};

        JOptionPane.showConfirmDialog(null, fields, "Gastos semanales", JOptionPane.OK_CANCEL_OPTION);
        int temp1 = Integer.parseInt(field1.getText());
        
       
         try{                 
                    ConexionBase conectado = new ConexionBase();
                    Connection con1 = conectado.getConnection();
                    Statement st= con1.createStatement();
                    String SQLGuardar= "INSERT INTO GASTOSSEMANALES(id_gasto_s,tipo_gasto_s,gasto_s)VALUES(?,?,?)";
                    PreparedStatement pst = con1.prepareCall(SQLGuardar);
                    
                    pst.setString(1,field1.getText());
                    pst.setString(2,field2.getText());
                    pst.setString(3,field3.getText());
                    
                    int n = pst.executeUpdate();
                    
                if (n>0){
                    JOptionPane.showMessageDialog(null,"Datos guardados correctamente\n");
                    pst.close();
                    i = Integer.parseInt(JOptionPane.showInputDialog("Si quierss continuar ingresa 1 \n Para salir ingresa 0"));
                }
                    
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Datos guardados erroneamente"+ ex);
                }}
    }//GEN-LAST:event_semanalesActionPerformed

    private void IngresosMensualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresosMensualesActionPerformed
        
                JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        
        Object[] fields = { "Id de ingreso ", field1,"Tipo ingreso ", field2, "Monto ingreso", field3};

        JOptionPane.showConfirmDialog(null, fields, "Ingresos mensuales", JOptionPane.OK_CANCEL_OPTION);
        
         try{                 
                    ConexionBase conectado = new ConexionBase();
                    Connection con1 = conectado.getConnection();
                    Statement st= con1.createStatement();
                    String SQLGuardar= "INSERT INTO INGRESOSMENSUALES(id_ingreso,tipo_ingreso,monto_ingreso)VALUES(?,?,?)";
                    PreparedStatement pst = con1.prepareCall(SQLGuardar);
                    
                    pst.setString(1,field1.getText());
                    pst.setString(2,field2.getText());
                    pst.setString(3,field3.getText());
                    
                    int n = pst.executeUpdate();
                    
                if (n>0){
                    JOptionPane.showMessageDialog(null,"Datos guardados correctamente\n");
                    pst.close();
                }
                    
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Datos guardados erroneamente"+ ex);
                }
    }//GEN-LAST:event_IngresosMensualesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void repDiario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repDiario1ActionPerformed
        Reportes reportes = new Reportes();
        reportes.setVisible(true);
        dispose();
    }//GEN-LAST:event_repDiario1ActionPerformed

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
            java.util.logging.Logger.getLogger(pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IngresosMensuales;
    private javax.swing.JButton diario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mensuales;
    private javax.swing.JButton repDiario1;
    private javax.swing.JButton semanales;
    // End of variables declaration//GEN-END:variables
}
