/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionDB;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;




public class ConexionBase {
    
    Connection conectar = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    
    public ConexionBase(){
        String url = "jdbc:ucanaccess://C:/Users/perry/Downloads/Programita/PERSONAL1.accdb";
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conectar = DriverManager.getConnection(url);
            sentencia = conectar.createStatement();
            JOptionPane.showMessageDialog(null, "Conectado a la base de datos");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el controlador UCanAccess.");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("Error al establecer la conexión a la base de datos.");
            ex.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        return conectar;
    }
}
    
