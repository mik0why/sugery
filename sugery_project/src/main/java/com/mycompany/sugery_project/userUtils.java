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
    private void loadScores(User user){
        
        
    }
    
    public void addUser(String username, int age, int goal, char[] password) {
        String sql = "INSERT INTO `LoginData` (`username`, `password`) VALUES ('" + username
           + '\'' + "," + '\'' + String.valueOf(password) + "');" ;
        String sql_2 = "INSERT INTO `UserData` (`username`, `age`,`goal`) VALUES ('" + username
            + '\'' + ","  + age + ',' + goal + ");";
        try{
            st.executeUpdate(sql); 
            st.executeUpdate(sql_2); 
            System.out.println("Succesful insert"); 
        }catch(SQLException e){
            System.out.println("Insert unsucessful: " + e);
        }
    }; 
    
    
    public User getUser(String username){
        
        String user = ""; 
        int age = Integer.MIN_VALUE; 
        int goal = Integer.MIN_VALUE;
        try{
            String sql = "SELECT * FROM UserData WHERE username = '" + username + "';";
            ResultSet rs = st.executeQuery(sql); //st.executeQuery(sql);
            rs.next(); // omitting the first one
            user = rs.getString("username");
            age = rs.getInt("age");
            goal = rs.getInt("goal");
            System.out.println("User-2 : " + user + " age: " + age + " goal : " + goal);
            }catch(Exception e){
                System.out.println("Exception: " + e);
        }
        return new User(user, age, goal); // TODO change
        
        
    
    }
    
    
    public boolean usernameExists(String username) throws SQLException{
        String sql = "SELECT username, password FROM LoginData";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            if(rs.getString("username").equals(username)){
                return true; 
            }
        }
        return false;   
    }
    
    public boolean verifyCredentials(String username, char[] password) throws SQLException{
        if (usernameExists(username)){
            try{
                String sql = "SELECT username, password FROM LoginData";
                ResultSet rs = selectEntries(sql); //st.executeQuery(sql);
                while(rs.next()){ // TODO shouldn't it be select from where?
                    String login = rs.getString("username");
                    String us_pass = rs.getString("password");
                    if(login.equals(username) && us_pass.equals(String.copyValueOf(password))){
                        return true;
                        }
                    }
                }catch(Exception e){
                    System.out.println("Exception: " + e);
                }
            }
        return false;
        
    }
    
    
    
    public void addRemoveEntry(User user, String date, int score, String mode) throws SQLException{
        String sql = "UPDATE Scores SET score = " + score
                    + " where username = " + '\'' +  user.getName() + "' AND date = '"
                    + date + "';";   
        
        switch(mode){
            case "update": 
                st.executeUpdate(sql);
                user.getScoreMap().replace(date, score);
                user.getEntryStack().remove(date);
                user.getEntryStack().push(date);
                break;
            case "add" : //TODO fix the sql
                sql = "INSERT INTO `Scores` (`username`, `score`, `date`) VALUES ('"
                + user.getName() + '\'' + "," + score
                + ","+ '\'' +  date  +  "');" ; // as of now it's adding the same score twice
                st.executeUpdate(sql);
                user.getScoreMap().put(date, score);
                user.getEntryStack().push(date);
                break;

                
            case "remove" :
                sql = "DELETE FROM Scores WHERE `username` = '" + user.getName()
                + "' AND `score` = " + score + " AND `date` = '" + date  +  "';";
                st.executeUpdate(sql);
                user.getScoreMap().remove(date);
                user.getEntryStack().remove(date);
                break;
      
        }
    }
    
   
    public void updateDate(User user, String oldDate, String newDate) throws SQLException{
            String sql = "UPDATE Scores SET date = '" + newDate
           + "' where username = " + '\'' +  user.getName() + "' AND date = '"
           + oldDate + "';";
        
            st.execute(sql);
               
            int value = user.getScoreMap().remove(oldDate);
            user.getScoreMap().put(newDate, value);
            user.getEntryStack().remove(oldDate);
            user.getEntryStack().push(newDate);
        
        
    }
    
    
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
    
    public int getMaxScore(User user){
        int max = Integer.MIN_VALUE; 
        for(Map.Entry <String, Integer> e : user.getScoreMap().entrySet()){
            if (e.getValue() > max) max = e.getValue();
            }
        return max; 
    }
    
    public int getMinScore(User user){
        int min = Integer.MAX_VALUE; 
        for(Map.Entry <String, Integer> e : user.getScoreMap().entrySet()){
            if (e.getValue() < min) min = e.getValue();
            }
        return min; 
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
