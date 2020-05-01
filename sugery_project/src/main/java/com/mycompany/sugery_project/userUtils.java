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
    
    public String userLastDate(User user){
        return user.getHM().lastKey(); 
    }
    
    public int userMaxScore(User user){
        int max = Integer.MIN_VALUE; 
        for(Map.Entry <String, Integer> e : this.getHM().entrySet()){
            if (e.getValue() > max) max = e.getValue();
            }
        return max; 
    }
    
    public String computeAverageScore(String range, String mode) throws ParseException{
        //TODO change return type 
            int dateRange = 0; 
            int sum = 0, counter = 0; 
            
            if(range.equals("week")) dateRange = 7;
            if(range.equals("month")) dateRange = 30;
            
            LocalDate Ldate = LocalDate.now();
            java.sql.Date d2 = java.sql.Date.valueOf(Ldate.minusDays(dateRange)); 
            ArrayList<String> ret = new ArrayList<String>(); 
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = (range.equals("all"))? 
                    dateFormat.parse("0000-01-01 00:00:00") : d2; 

            
 
            for(Map.Entry<String, Integer> e : this.getHM().entrySet()){
                if(dateFormat.parse(e.getKey()).compareTo(date) > 0 ){
                    sum+=e.getValue();
                    counter++;
                }
            }
            // not adding null - remember to clear the output field first
            ret.add(counter + " scores registered");
            boolean zero = ((counter != 0) ? (ret.add(Integer.toString(sum / counter))) : (ret.add("no score")));
            if (mode == "avg") return ret.get(1);
            return ret.get(0);
    }
        
        
        
 

    
    
    private void removeEntry(){};

    private void loginAttempt(String username, char [] password){}; 
    
    
}
