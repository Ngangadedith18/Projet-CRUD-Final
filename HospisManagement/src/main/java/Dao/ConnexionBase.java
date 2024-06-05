/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ideal
 */
public class ConnexionBase {
    public Connection co=null;
    public Statement st=null;
    //insertion du driver
    public void connection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnexionBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
        try {
            //selection de la base
            co=DriverManager.getConnection("jdbc:mysql://localhost/hospis","root","");
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        try {
            //statement
            st=co.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
