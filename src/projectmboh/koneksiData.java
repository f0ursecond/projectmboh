/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmboh;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author f0ursecond
 */
public class koneksiData {
    private Connection connect;
       private String driverName = "com.mysql.jdbc.Driver";
       private String url = "jdbc:mysql://localhost:3306/db_zul_portfolio1";
       private String username = "root";
       private String password = "";
       
       
       public Connection getKoneksi() throws SQLException{
           if(connect == null){
               try {
                   Class.forName(driverName);
                   System.out.println("Driver Ditemukan");
                   
                   try {
                       connect = DriverManager.getConnection(url, username, password);
                       System.out.println("Database connected");
                   } catch (SQLException se){
                       System.out.println("Koneksi gagal" + se);
                       System.exit(0);
                   }    
               } catch (ClassNotFoundException cnfe){
                   System.out.println("Driver not found");
                   System.exit(0);
               }
           }
           return connect;
       }     
}
