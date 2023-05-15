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
public class GeneradorReportesCompras {
    private ConexionBase conectado;
    private Connection con1;

    public GeneradorReportesCompras() {
        try {
            conectado = new ConexionBase();
            con1 = conectado.getConnection();
        } catch (Exception e) {
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }
    }

    public void obtenercompras() {
                String queseando = "SELECT id_producto,nom_pro,cant_comp,cant_vent,cost_comp,cost_vent,mermas,uni_med,fech_comp,fech_vent,fac_comp,fac_vent,ganancia,incre_comp,incre_vent,almacen,devol,tipo_pago FROM PERSONAL";
        
         String [][] temp2; 
         temp2 = new String[1][18];
         temp2[0][0] = "id_producto"; 
         temp2[0][1] = "nom_pro"; 
         temp2[0][2] = "cant_comp"; 
         temp2[0][3] = "cant_vent"; 
         temp2[0][4] = "cost_comp"; 
         temp2[0][5] = "cost_vent"; 
         temp2[0][6] = "mermas"; 
         temp2[0][7] = "uni_med"; 
         temp2[0][8] = "fech_comp"; 
         temp2[0][9] = "fech_vent"; 
         temp2[0][10] = "fac_comp"; 
         temp2[0][11] = "fac_vent"; 
         temp2[0][12] = "ganancias"; 
         temp2[0][13] = "incre_comp"; 
         temp2[0][14] = "incre_vent"; 
         temp2[0][15] = "almacen"; 
         temp2[0][16] = "devol"; 
         temp2[0][17] = "tipo_pago"; 
         
        
        try {
            String SQLSeleccionar= queseando; 
            PreparedStatement pst = con1.prepareStatement(SQLSeleccionar);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String id_producto = rs.getString(temp2[0][0]);
                String nom_pro = rs.getString(temp2[0][1]);
                String cant_comp = rs.getString(temp2[0][2]);
                String cant_vent = rs.getString(temp2[0][3]);
                String cost_comp = rs.getString(temp2[0][4]);
                String cost_vent = rs.getString(temp2[0][5]);
                String mermas = rs.getString(temp2[0][6]);
                String uni_med = rs.getString(temp2[0][7]);
                String fech_comp = rs.getString(temp2[0][8]);
                String fech_vent = rs.getString(temp2[0][9]);
                String fac_comp= rs.getString(temp2[0][10]);
                String fac_vent = rs.getString(temp2[0][11]);
                String ganancia = rs.getString(temp2[0][12]);
                String incre_comp = rs.getString(temp2[0][13]);
                String incre_vent = rs.getString(temp2[0][14]);
                String almacen = rs.getString(temp2[0][15]);
                String devol = rs.getString(temp2[0][16]);
                String tipo_pago = rs.getString(temp2[0][17]);

                    System.out.println("ID Producto: " + id_producto);
                    System.out.println("Nombre Producto: " + nom_pro);
                    System.out.println("Cantidad Compra: " + cant_comp);
                    System.out.println("Cantidad Venta: " + cant_vent);
                    System.out.println("Costo Compra: " + cost_comp);
                    System.out.println("Costo Venta: " + cost_vent);
                    System.out.println("Mermas: " + mermas);
                    System.out.println("Unidad Medida: " + uni_med);
                    System.out.println("Fecha Compra: " + fech_comp);
                    System.out.println("Fecha Venta: " + fech_vent);
                    System.out.println("Factura Compra: " + fac_comp);
                    System.out.println("Factura Venta: " + fac_vent);
                    System.out.println("Ganancia: " + ganancia);
                    System.out.println("Incremento Compra: " + incre_comp);
                    System.out.println("Incremento Venta: " + incre_vent);
                    System.out.println("Almacen: " + almacen);
                    System.out.println("Devolución: " + devol);
                    System.out.println("Tipo Pago: " + tipo_pago);
            }
            
            rs.close();
            pst.close();
            con1.close();
        } catch (Exception ex) {
            throw new RuntimeException("Error al obtener los datos: ", ex);
        }}}
