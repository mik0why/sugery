/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mikowhy
 */
public class entryTable {
    
    private Statement st; 
    public entryTable(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // is it necessary?
            String url = "jdbc:mysql://localhost/LOG?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            Connection conn = DriverManager.getConnection(url,"root","Pass123!!!"); 
            st = conn.createStatement();
         }catch(Exception e){
             System.out.println("Exception: " + e);
        }        
    }
    

    public void addRemoveEntry(String query) throws SQLException{        
        
        
        st.executeUpdate(query);
    }; // add or remove based on the type

    public ResultSet selectEntries(String query) throws SQLException{
        return st.executeQuery(query);

        
    }
    
    private void removeEntry(){};

    private void loginAttempt(String username, char [] password){}; 
    
    
}
