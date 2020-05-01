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
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author mikowhy
 */
public class userUtils extends User {
    
    private Statement st; 
    
    public userUtils(){
        
        try{
            
            System.out.println("name in utils : " + this.getName());
            //user.setName = " ... " 
            
            Class.forName("com.mysql.cj.jdbc.Driver"); // is it necessary?
            String url = "jdbc:mysql://localhost/LOG?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            Connection conn = DriverManager.getConnection(url,"root","Pass123!!!"); 
            st = conn.createStatement();
         }catch(Exception e){
             System.out.println("Exception: " + e);
        }        
        
    }
    


   
    
    public void getScoreMap() { //reeMap<String, Integer> getScoreHashMap(){
        NavigableMap<String, Integer> scoreMap = new TreeMap<String, Integer>(); //= new HashMap<String,Integer>();

        /*
        String username;
        int score;
        String dt; 
            try{
            String sql = "SELECT username, score, date FROM Scores";
            ResultSet rs = dataTable.selectEntries(sql); //st.executeQuery(sql);
            while(rs.next()){ // TODO shouldn't it be select from where?
                username = rs.getString("username");
                score = rs.getInt("score");
                dt = rs.getString("date"); // convert to a different format?  // below check : && us_pass.equals(String.copyValueOf(password))){
                if(username.equals(this.getName())){                    //TODO should check if the score isn't already in the usArr
                    if(!this.getHM().containsKey(dt)){ // checks the date
                        this.HM_Insert(dt, score);
                        }
                    }
                }
            }catch(Exception e){
                System.out.println("Exception: " + e);
        }
        
        */
        
        
        
        
    }
    
    
    public void addRemoveEntry(String query) throws SQLException{        
        
        System.out.println(query);
        st.executeUpdate(query);
        
    }; // add or remove based on the type

    public ResultSet selectEntries(String query) throws SQLException{
        return st.executeQuery(query);

        
    }
    
    public int getLastScore(User user){
        return user.getHM().lastEntry().getValue(); 
    }
    
    public String getMostRecentDate(User user){
        return user.getHM().lastKey(); 
    }
    
    private void removeEntry(){};

    private void loginAttempt(String username, char [] password){}; 
    
    
}
