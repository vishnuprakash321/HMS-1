/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vi
 */
public class connect {
    public Statement conn() throws InstantiationException, IllegalAccessException, SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","enter");
            System.out.println("connected");
            Statement st = c.createStatement();
            return st;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error "+ex.getMessage());
        }
        return null;
    }
    
}
