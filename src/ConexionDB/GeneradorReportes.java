/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionDB;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;


public class GeneradorReportes {
     private ConexionBase conectado;
    private Connection con1;

    public GeneradorReportes() {
        try {
            conectado = new ConexionBase();
            con1 = conectado.getConnection();
        } catch (Exception e) {
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }
    }

    public void obtenerGastosDiarios(int num, int periodo) {
        
        String  [] temp;
         temp = new String[4];
         
         temp [0] = "SELECT id_gasto_d, tipo_gasto_d, gasto_d FROM GASTOSDIARIOS";
         temp [1] = "SELECT id_gasto_s, tipo_gasto_s, gasto_s FROM GASTOSSEMANALES";
         temp [2] = "SELECT id_gasto_m, tipo_gasto_m, gasto_m FROM GASTOSMENSUALES";
         temp [3] = "SELECT id_ingreso, tipo_ingreso, monto_ingreso FROM INGRESOSMENSUALES";
         
         String [] [] temp2;
         temp2 = new String[4][3];  
         temp2[0][0] = "id_gasto_d"; 
         temp2[0][1] = "tipo_gasto_d"; 
         temp2[0][2] = "gasto_d"; 
         temp2[1][0] = "id_gasto_s"; 
         temp2[1][1] = "tipo_gasto_s"; 
         temp2[1][2] = "gasto_s"; 
         temp2[2][0] = "id_gasto_m"; 
         temp2[2][1] = "tipo_gasto_m"; 
         temp2[2][2] = "gasto_m"; 
         temp2[3][0] = "id_ingreso"; 
         temp2[3][1] = "tipo_ingreso"; 
         temp2[3][2] = "monto_ingreso"; 
        
        try {
            String SQLSeleccionar= temp[periodo];
            PreparedStatement pst = con1.prepareStatement(SQLSeleccionar);

            ResultSet rs = pst.executeQuery();
            
            boolean idencontrado = false;

            while (rs.next()) {
                String idIngreso = rs.getString(temp2[periodo][0]);
                int i = Integer.parseInt(idIngreso);

                if (num == i) {
                    idencontrado = true;
                    
                    String tipoIngreso = rs.getString(temp2[periodo][1]);
                    String montoIngreso = rs.getString(temp2[periodo][2]);

                    System.out.println("ID : " + idIngreso);
                    System.out.println("Tipo : " + tipoIngreso);
                    System.out.println("Monto : " + montoIngreso);
                    
                BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("Reportes.txt"));
                //BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("PruebaP.pdf"));

                DataOutputStream dos= new DataOutputStream(bos);
                Scanner scanner = new Scanner(System.in);
                dos.writeUTF("ID:" + idIngreso + 
                             "\n Tipo: " + tipoIngreso + 
                             "\n Monto: " + montoIngreso);
                dos.close();
                    System.out.println("Recibo impreso");
                         
                }
                
            }
            if (idencontrado == false) {
                System.out.println("No hay datos de este tipo.");
            }

            rs.close();
            pst.close();
            con1.close();
        } catch (Exception ex) {
            throw new RuntimeException("Error al obtener los datos: ", ex);
        }
    }
}
    

