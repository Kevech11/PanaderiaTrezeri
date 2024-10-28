/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conector;
import Conexion.Conexion_BD;
import java.sql.Connection;
/**
 *
 * @author Usuario
 */
public class AppStore {
    public static void main (String[] args){
        Connection conexion = Conexion_BD.conectar();
    }
}
