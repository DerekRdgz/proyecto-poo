/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author herna
 */
public class Reporte_tipo_gasto {
         private ConexionBase conectado;
    private Connection con1;

    public Reporte_tipo_gasto() {
        try {
            conectado = new ConexionBase();
            con1 = conectado.getConnection();
        } catch (Exception e) {
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }
    }

    public void obtenerReportetTipoGasto(int queseando,String Tipogasto) {
        
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
            String SQLSeleccionar= temp[queseando];
            PreparedStatement pst = con1.prepareStatement(SQLSeleccionar);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String tipoIngreso = rs.getString(temp2[queseando][1]);
                //if(Tipogasto == tipoIngreso){
                String idIngreso = rs.getString(temp2[queseando][0]);
                String montoIngreso = rs.getString(temp2[queseando][2]);

                    System.out.println("ID : " + idIngreso);
                    System.out.println("Tipo : " + tipoIngreso);
                    System.out.println("Monto : " + montoIngreso);
                //}
            }
            rs.close();
            pst.close();
            con1.close();
        } catch (Exception ex) {
            throw new RuntimeException("Error al obtener los datos: ", ex);
        }
    }
}
