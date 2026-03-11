/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Meilyn Garcia
 */
public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/bd_control_acceso";
    private static final String USER = "root";
    private static final String PASSWORD = "9045";

    public static Connection getConnection(){

        Connection con = null;

        try{
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa");
        }catch(Exception e){
            System.out.println("Error: " + e);
        }

        return con;
    }

}
