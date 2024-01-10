/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_adibah;

import java.sql.SQLException;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ConnectionDb {
    static final String jdbc_driver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/penjualanrumah?zeroDateTimeBehavior=CONVERT_TO_NULL";
    static final String user = "root";
    static final String pass = "";
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    public static Connection connectionDatabase(){
        try{
            Class.forName(jdbc_driver);
        } catch(ClassNotFoundException cnf){
            
        }try {
            conn = DriverManager.getConnection(url, user, pass);
//            JOptionPane.showMessageDialog(null, "Koneksi database berhasil");
        } catch(SQLException e) {
//            JOptionPane.showMessageDialog(null,"Koneksi database gagal");
        } catch(HeadlessException e) {
            
        }
        return conn;
    }
    
    
}
