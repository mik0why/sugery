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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author mikowhy
 */
public class userUtils {
    //TODO im not 100% about extending the user
    
    private Statement st; 
    private sqlManager sql = new sqlManager(); 
    
    public userUtils(){
        
        try{
            
            
            Class.forName("com.mysql.cj.jdbc.Driver"); // is it necessary?
            String url = "jdbc:mysql://localhost/LOG?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            Connection conn = DriverManager.getConnection(url,"root","Pass123!!!"); 
            st = conn.createStatement();
         }catch(Exception e){
             System.out.println("Exception: " + e);
        }        
        
    }
    
 
    //SQL methods
       
    public void addRemoveEntry(User user, String date, int score, String mode) throws SQLException{
        
        String sql = "UPDATE Scores SET score = " + score
        + " where username = " + '\'' +  user.getName() + "' AND date = '"
        + date + "';";

        st.executeUpdate(sql);
        
        switch(mode){
            case "update": 
                user.getScoreMap().replace(date, score);
                user.getEntryStack().remove(date);
                user.getEntryStack().push(date);
                break;
            case "add":
                user.getScoreMap().put(date, score);
                user.getEntryStack().push(date);
                break;
        }
    }
    
    
    public void oldAddRemoveEntry(String query) throws SQLException{    
        
        
        
        
        
        
        
        
        System.out.println(query);
        st.executeUpdate(query);
        
    }; // add or remove based on the type

    public ResultSet selectEntries(String query) throws SQLException{
        System.out.println("query to execute: " + query);
        return st.executeQuery(query);

        
    }
    
    ////
    
    public int getLastScore(User user){
        return user.getScoreMap().lastEntry().getValue(); 
    }
    
    public String getLastDate(User user){
        return user.getScoreMap().lastKey(); 
    }
    
    public int averageScore(User user){
        int max = Integer.MIN_VALUE; 
        for(Map.Entry <String, Integer> e : user.getScoreMap().entrySet()){
            if (e.getValue() > max) max = e.getValue();
            }
        return max; 
    }
    
    public int computeAverageScore(User user, String range, String mode) throws ParseException{
            int dateRange = 0; 
            int sum = 0, counter = 0; 
            
            if(range.equals("week")) dateRange = 7;
            if(range.equals("month")) dateRange = 30;
            
            LocalDate Ldate = LocalDate.now();
            java.sql.Date d2 = java.sql.Date.valueOf(Ldate.minusDays(dateRange)); 
            ArrayList<Integer> ret = new ArrayList<Integer>(); 
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = (range.equals("all"))? 
                    dateFormat.parse("0000-01-01 00:00:00") : d2; 

            
            System.out.println("entry set: " + user.getScoreMap().entrySet());
            for(Map.Entry<String, Integer> e : user.getScoreMap().entrySet()){
                if(dateFormat.parse(e.getKey()).compareTo(date) > 0 ){
                    sum+=e.getValue();
                    counter++;
                }
            }
            ret.add(counter);
            
            System.out.println("average computed : " + sum/counter);
            boolean zero = ((counter != 0) ? (ret.add((sum / counter))) : (ret.add(-1))); // TODO: -1 when no score; change
            if (mode == "average") return ret.get(1);
            
            
            return ret.get(0);
                        // not adding null - remember to clear the output field first (idk what that means)

    }
        
        
        
 

    
    
    private void removeEntry(){};

    private void loginAttempt(String username, char [] password){}; 
    
    
}
