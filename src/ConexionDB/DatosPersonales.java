package ConexionDB;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DatosPersonales extends javax.swing.JFrame {

    public DatosPersonales() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id_producto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nom_pro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cant_comp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cant_vent = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cost_comp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cost_vent = new javax.swing.JTextField();
        btngualdar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        mermas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        uni_med = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fech_comp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fech_vent = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fac_comp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        incre_comp = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        incre_vent = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        almacen = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        devol = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tipo_pago = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ingresa nueva entrada a almacen");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, -1));

        jLabel2.setText("id producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        id_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_productoActionPerformed(evt);
            }
        });
        getContentPane().add(id_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 180, -1));

        jLabel3.setText("nombre del producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        nom_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_proActionPerformed(evt);
            }
        });
        getContentPane().add(nom_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 180, -1));

        jLabel4.setText("cantidad comprada");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        cant_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_compActionPerformed(evt);
            }
        });
        getContentPane().add(cant_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 180, -1));

        jLabel5.setText("cantidad vendida");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        cant_vent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_ventActionPerformed(evt);
            }
        });
        getContentPane().add(cant_vent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 180, -1));

        jLabel6.setText("costo de compra");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        cost_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_compActionPerformed(evt);
            }
        });
        getContentPane().add(cost_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 180, -1));

        jLabel7.setText("costo de venta");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        cost_vent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_ventActionPerformed(evt);
            }
        });
        getContentPane().add(cost_vent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 180, -1));

        btngualdar.setText("Guardar Datos");
        btngualdar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngualdarActionPerformed(evt);
            }
        });
        getContentPane().add(btngualdar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, -1, -1));

        jLabel8.setText("mermas del producto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        mermas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mermasActionPerformed(evt);
            }
        });
        getContentPane().add(mermas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 180, -1));

        jLabel9.setText("unidad de medida");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        uni_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uni_medActionPerformed(evt);
            }
        });
        getContentPane().add(uni_med, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 180, -1));

        jLabel10.setText("fecha de compra");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        fech_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fech_compActionPerformed(evt);
            }
        });
        getContentPane().add(fech_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 180, -1));

        jLabel11.setText("fecha de venta");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        fech_vent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fech_ventActionPerformed(evt);
            }
        });
        getContentPane().add(fech_vent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 180, -1));

        jLabel12.setText("factura de compra");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        fac_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fac_compActionPerformed(evt);
            }
        });
        getContentPane().add(fac_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 180, -1));

        jLabel15.setText("incremento de compra%");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        incre_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incre_compActionPerformed(evt);
            }
        });
        getContentPane().add(incre_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 180, -1));

        jLabel16.setText("incremento de venta%");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        incre_vent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incre_ventActionPerformed(evt);
            }
        });
        getContentPane().add(incre_vent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 180, -1));

        jLabel17.setText("alamcen");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenActionPerformed(evt);
            }
        });
        getContentPane().add(almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 180, -1));

        jLabel18.setText("devoluciones");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        devol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolActionPerformed(evt);
            }
        });
        getContentPane().add(devol, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 180, -1));

        jLabel19.setText("tipo de pago");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        tipo_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_pagoActionPerformed(evt);
            }
        });
        getContentPane().add(tipo_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 180, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_productoActionPerformed

    private void nom_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_proActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_proActionPerformed

    private void cant_compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_compActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cant_compActionPerformed

    private void cant_ventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_ventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cant_ventActionPerformed

    private void cost_compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost_compActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cost_compActionPerformed

    private void cost_ventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost_ventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cost_ventActionPerformed

    private void btngualdarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngualdarActionPerformed
        // TODO add your handling code here:
        if(id_producto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Falta ingresar el ID");
            id_producto.requestFocus();
        }else{
            if(nom_pro.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Falta ingresar el nombre");
                nom_pro.requestFocus();
            }else{
                try{                 
                    ConexionBase conectado = new ConexionBase();
                    Connection con1 = conectado.getConnection();
                    Statement st= con1.createStatement();
                    String SQLGuardar= "INSERT INTO PERSONAL(id_producto,nom_pro,cant_comp,cant_vent,cost_comp,cost_vent,mermas,uni_med,fech_comp,fech_vent,fac_comp,fac_vent,ganancia,incre_comp,incre_vent,almacen,devol,tipo_pago)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = con1.prepareCall(SQLGuardar);
                    pst.setString(1,id_producto.getText());
                    pst.setString(2,nom_pro.getText());
                    pst.setString(3,cant_comp.getText());
                    pst.setString(4,cant_vent.getText());
                    pst.setString(5,cost_comp.getText());
                    pst.setString(6,cost_vent.getText());
                    pst.setString(7, mermas.getText());
                    pst.setString(8, uni_med.getText());
                    pst.setString(9, fech_comp.getText());
                    pst.setString(10,fech_vent.getText());
                    pst.setString(11,fac_comp.getText());
                    pst.setString(12,null);
                    pst.setString(13,null);
                    pst.setString(14,incre_comp.getText());
                    pst.setString(15,incre_vent.getText());
                    pst.setString(16,almacen.getText());
                    pst.setString(17,devol.getText());
                    pst.setString(18,tipo_pago.getText());
                    int n = pst.executeUpdate();
                    
                if (n>0){
                    JOptionPane.showMessageDialog(null,"Datos guardados correctamente");
                    pst.close();
                }
                    
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Datos guardados erroneamente"+ ex);
                }
                
            }
        }
    }//GEN-LAST:event_btngualdarActionPerformed

    private void mermasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mermasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mermasActionPerformed

    private void uni_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uni_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uni_medActionPerformed

    private void fech_compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fech_compActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fech_compActionPerformed

    private void fech_ventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fech_ventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fech_ventActionPerformed

    private void fac_compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fac_compActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fac_compActionPerformed

    private void incre_compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incre_compActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incre_compActionPerformed

    private void incre_ventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incre_ventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incre_ventActionPerformed

    private void almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_almacenActionPerformed

    private void devolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_devolActionPerformed

    private void tipo_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_pagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_pagoActionPerformed

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
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosPersonales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField almacen;
    private javax.swing.JButton btngualdar;
    private javax.swing.JTextField cant_comp;
    private javax.swing.JTextField cant_vent;
    private javax.swing.JTextField cost_comp;
    private javax.swing.JTextField cost_vent;
    private javax.swing.JTextField devol;
    private javax.swing.JTextField fac_comp;
    private javax.swing.JTextField fech_comp;
    private javax.swing.JTextField fech_vent;
    private javax.swing.JTextField id_producto;
    private javax.swing.JTextField incre_comp;
    private javax.swing.JTextField incre_vent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mermas;
    private javax.swing.JTextField nom_pro;
    private javax.swing.JTextField tipo_pago;
    private javax.swing.JTextField uni_med;
    // End of variables declaration//GEN-END:variables
}
