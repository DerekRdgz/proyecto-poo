package ConexionDB;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DatosPersonales extends javax.swing.JFrame {

    public DatosPersonales() {
        initComponents();
        setLocationRelativeTo(null);
        
        MostrarDatos();
        MostrarRegistroT();
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
        jButton1 = new javax.swing.JButton();
        ganancia = new javax.swing.JTextField();
        fac_vent = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btngualdar1 = new javax.swing.JButton();
        btngualdar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setText("Ingresar una nueva entrada al almacén");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 470, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setText("ID del Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 100, -1));

        id_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_productoActionPerformed(evt);
            }
        });
        getContentPane().add(id_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 180, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setText("Nombre del Producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        nom_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_proActionPerformed(evt);
            }
        });
        getContentPane().add(nom_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 180, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel4.setText("Cantidad Comprada");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        cant_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_compActionPerformed(evt);
            }
        });
        getContentPane().add(cant_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 180, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel5.setText("Cantidad Vendida");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        cant_vent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_ventActionPerformed(evt);
            }
        });
        getContentPane().add(cant_vent, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 180, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel6.setText("Costo de Compra");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        cost_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_compActionPerformed(evt);
            }
        });
        getContentPane().add(cost_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 180, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel7.setText("Costo de Venta");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        cost_vent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_ventActionPerformed(evt);
            }
        });
        getContentPane().add(cost_vent, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 180, -1));

        btngualdar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btngualdar.setText("Guardar Datos");
        btngualdar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngualdarActionPerformed(evt);
            }
        });
        getContentPane().add(btngualdar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 120, 30));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel8.setText("Mermas del Producto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        mermas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mermasActionPerformed(evt);
            }
        });
        getContentPane().add(mermas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 180, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel9.setText("Unidad de Medida");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        uni_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uni_medActionPerformed(evt);
            }
        });
        getContentPane().add(uni_med, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 180, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel10.setText("Fecha de Compra");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        fech_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fech_compActionPerformed(evt);
            }
        });
        getContentPane().add(fech_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 180, -1));

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel11.setText("Fecha  de Venta");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        fech_vent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fech_ventActionPerformed(evt);
            }
        });
        getContentPane().add(fech_vent, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 180, -1));

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel12.setText("Factura de Compras");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        fac_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fac_compActionPerformed(evt);
            }
        });
        getContentPane().add(fac_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 180, -1));

        jLabel15.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel15.setText("Incremento de Compra %");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 150, -1));

        incre_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incre_compActionPerformed(evt);
            }
        });
        getContentPane().add(incre_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 180, -1));

        jLabel16.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel16.setText("Incremento de Venta %");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, -1));

        incre_vent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incre_ventActionPerformed(evt);
            }
        });
        getContentPane().add(incre_vent, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 180, -1));

        jLabel17.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel17.setText("Almacén");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenActionPerformed(evt);
            }
        });
        getContentPane().add(almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 180, -1));

        jLabel18.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel18.setText("Devoluciones");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, -1));

        devol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolActionPerformed(evt);
            }
        });
        getContentPane().add(devol, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 180, -1));

        jLabel19.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel19.setText("Tipo de Pago");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, -1, -1));

        tipo_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_pagoActionPerformed(evt);
            }
        });
        getContentPane().add(tipo_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 180, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, -1, -1));

        ganancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gananciaActionPerformed(evt);
            }
        });
        getContentPane().add(ganancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 180, -1));

        fac_vent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fac_ventActionPerformed(evt);
            }
        });
        getContentPane().add(fac_vent, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 180, -1));

        jLabel13.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel13.setText("Factura de Venta");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel14.setText("Ganancia");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        btngualdar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btngualdar1.setText("Modificar Datos");
        btngualdar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngualdar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btngualdar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, -1, -1));

        btngualdar2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btngualdar2.setText("Nuevo");
        btngualdar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngualdar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btngualdar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, -1, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 760, 240));

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
                    pst.setString(12,fac_vent.getText());
                    pst.setString(13,ganancia.getText());
                    pst.setString(14,incre_comp.getText());
                    pst.setString(15,incre_vent.getText());
                    pst.setString(16,almacen.getText());
                    pst.setString(17,devol.getText());
                    pst.setString(18,tipo_pago.getText());
                    int n = pst.executeUpdate();
                    pst.close();
                if (n>0){
                    JOptionPane.showMessageDialog(null,"Datos guardados correctamente");
                    limpiar();
                    MostrarDatos();
                    MostrarRegistroT();
                }
                    
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"Datos guardados erroneamente"+ ex);
                }
                
            }
        }
        
    }//GEN-LAST:event_btngualdarActionPerformed
    public void MostrarDatos(){
     DefaultTableModel TablaD= (DefaultTableModel)Tabla.getModel();
     String EncabezadoT[]={"ID Producto","Nombre","Cantidad comprada","Cantidad vendida","Costo de compra","Costo de venta","Mermas","Unidad de medida","Fecha de compra","Fecha de venta","Factura de compra","Incremento de compra ","Incremento de venta ","Almacen","Devoluciones","Tipo de pago"};
     TablaD= new DefaultTableModel(null,EncabezadoT);
     Tabla.setModel(TablaD);
    }
     public void MostrarRegistroT(){
     try{
         Connection Conex=null;
         DefaultTableModel lamismatabla= (DefaultTableModel)Tabla.getModel();
         ConexionBase conectame = new ConexionBase();
         Conex=conectame.getConnection();
         String Registro[]=new String[16];
         String SQL="Select * from PERSONAL";
         Statement sentencia=Conex.createStatement();
         ResultSet rst=sentencia.executeQuery(SQL);
         while(rst.next()){
             Registro[0]=rst.getString("id_producto");
             Registro[1]=rst.getString("nom_pro");
             Registro[2]=rst.getString("cant_comp");
             Registro[3]=rst.getString("cant_vent");
             Registro[4]=rst.getString("cost_comp");
             Registro[5]=rst.getString("cost_vent");
             Registro[6]=rst.getString("mermas");
             Registro[7]=rst.getString("uni_med");
             Registro[8]=rst.getString("fech_comp");
             Registro[9]=rst.getString("fech_vent");
             Registro[10]=rst.getString("fac_comp");
             Registro[11]=rst.getString("incre_comp");
             Registro[12]=rst.getString("incre_vent");
             Registro[13]=rst.getString("almacen");
             Registro[14]=rst.getString("devol");
             Registro[15]=rst.getString("tipo_pago");
             lamismatabla.addRow(Registro);
             
         
     }
         Tabla.setModel(lamismatabla);   
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null, "Se ha producido un error al cargar los datos de la tabla"+e);
         
         
     }
     
 }
     public void limpiar(){
     this.id_producto.setText("");
     this.nom_pro.setText("");
     this.cant_comp.setText("");
     this.cant_vent.setText("");
     this.cost_comp.setText("");
     this.cost_vent.setText("");
     this.mermas.setText("");
     this.uni_med.setText("");
     this.fech_comp.setText("");
     this.fech_vent.setText("");
     this.fac_comp.setText("");
     this.incre_comp.setText("");
     this.incre_vent.setText("");
     this.almacen.setText("");
     this.devol.setText("");
     this.tipo_pago.setText("");
     this.id_producto.requestFocus();
     
     
     
     
 }
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        pantalla_principal pp = new pantalla_principal();
        pp.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gananciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gananciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gananciaActionPerformed

    private void fac_ventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fac_ventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fac_ventActionPerformed

    private void btngualdar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngualdar1ActionPerformed
        // Boton Modificar
        int fila= this.Tabla.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Para Actualizar un dato debe seleccionarlo primero" ); 
        }
        else{
            try{
                Connection con2= null;
                ConexionBase conectado = new ConexionBase();
                con2=conectado.getConnection();
                Statement st=con2.createStatement();
                String SQLModifica="UPDATE PERSONAL SET nom_pro = ? , cant_comp = ? , cant_vent = ?, cost_comp = ?, cost_vent = ?, mermas = ? , uni_med = ?, fech_comp = ?, fech_vent = ?, fac_comp = ?, incre_comp = ?, incre_vent = ?, almacen = ?, devol = ?, tipo_pago = ? WHERE id_producto = ?";
                PreparedStatement pst = con2.prepareStatement(SQLModifica);
                pst.setInt(16,Integer.parseInt(id_producto.getText()));
                pst.setString(1, nom_pro.getText());
                pst.setString(2, cant_comp.getText());
                pst.setString(3, cant_vent.getText());
                pst.setString(4, cost_comp.getText());
                pst.setString(5, cost_vent.getText());
                pst.setString(6, mermas.getText());
                pst.setString(7, uni_med.getText());
                pst.setString(8, fech_comp.getText());
                pst.setString(9, fech_vent.getText());
                pst.setString(10, fac_comp.getText());
                pst.setString(11, incre_comp.getText());
                pst.setString(12, incre_vent.getText());
                pst.setString(13, almacen.getText());
                pst.setString(14, devol.getText());
                pst.setString(15, tipo_pago.getText());
                int s=pst.executeUpdate();
                pst.close();
                
                if(s>0){
                    JOptionPane.showMessageDialog(this, "Datos Actualizados Correctamente");
                    
                }
      
            }

            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Error al actualizar los datos"+e);
                
                
            }
            DatosPersonales dp = new DatosPersonales();
            dp.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btngualdar1ActionPerformed

    private void btngualdar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngualdar2ActionPerformed
        limpiar();
    }//GEN-LAST:event_btngualdar2ActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        try{
            int fila= Tabla.getSelectedRow();
            this.id_producto.setText(Tabla.getValueAt(fila,0).toString());
            this.nom_pro.setText(Tabla.getValueAt(fila,1).toString());
            this.cant_comp.setText(Tabla.getValueAt(fila,2).toString());
            this.cant_vent.setText(Tabla.getValueAt(fila,3).toString());
            this.cost_comp.setText(Tabla.getValueAt(fila,4).toString());
            this.cost_vent.setText(Tabla.getValueAt(fila,5).toString());
            this.mermas.setText(Tabla.getValueAt(fila,6).toString());
            this.uni_med.setText(Tabla.getValueAt(fila,7).toString());
            this.fech_comp.setText(Tabla.getValueAt(fila,8).toString());
            this.fech_vent.setText(Tabla.getValueAt(fila,9).toString());
            this.fac_comp.setText(Tabla.getValueAt(fila,10).toString());
            this.incre_comp.setText(Tabla.getValueAt(fila,11).toString());
            this.incre_vent.setText(Tabla.getValueAt(fila,12).toString());
            this.almacen.setText(Tabla.getValueAt(fila,13).toString());
            this.devol.setText(Tabla.getValueAt(fila,14).toString());
            this.tipo_pago.setText(Tabla.getValueAt(fila,15).toString());

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al selecionar datos"+e );

        }
    }//GEN-LAST:event_TablaMouseClicked

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
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField almacen;
    private javax.swing.JButton btngualdar;
    private javax.swing.JButton btngualdar1;
    private javax.swing.JButton btngualdar2;
    private javax.swing.JTextField cant_comp;
    private javax.swing.JTextField cant_vent;
    private javax.swing.JTextField cost_comp;
    private javax.swing.JTextField cost_vent;
    private javax.swing.JTextField devol;
    private javax.swing.JTextField fac_comp;
    private javax.swing.JTextField fac_vent;
    private javax.swing.JTextField fech_comp;
    private javax.swing.JTextField fech_vent;
    private javax.swing.JTextField ganancia;
    private javax.swing.JTextField id_producto;
    private javax.swing.JTextField incre_comp;
    private javax.swing.JTextField incre_vent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mermas;
    private javax.swing.JTextField nom_pro;
    private javax.swing.JTextField tipo_pago;
    private javax.swing.JTextField uni_med;
    // End of variables declaration//GEN-END:variables

}
