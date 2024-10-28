/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Conexion_BD {
            
        static Connection conexion = null;
        static String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        static String url = "jdbc:ucanaccess://D:\\Datos\\Documents\\PanaderiaGestion.accdb";
        
        public static Connection conectar(){
            try {
                if (conexion == null){
                    Class.forName(driver);
                    conexion = DriverManager.getConnection (url); 
                    JOptionPane.showMessageDialog(null,"Conexion Exitosa");
                }            
            }catch(Exception e){
                System.out.println(e);
            }
            return conexion;
        }
}
