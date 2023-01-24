/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DBConnection {
    public static Connection connect(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/hcmdatabase?", "root", "");
            JOptionPane.showMessageDialog(null, "Connected wiith the database");
        }
        catch(Exception e){
            System.out.println("The error was" + e);
        }
        return con;
    }
}
