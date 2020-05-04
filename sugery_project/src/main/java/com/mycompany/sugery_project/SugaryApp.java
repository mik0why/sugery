/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;
import java.io.Serializable;
import java.sql.* ; 
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
/**
 *
 * @author mikowhy
 */
public class SugaryApp {
    //TODO fields should be private
    
    /**
     * @param args the command line arguments
     */


}


//1. When to make classes public?

class User extends Observable implements Serializable{
    
    /*
    
    //TODO: get rid of 'public', other minor changes
    //TODO getters and setters for user
    //TODO should userUtils be private?
    
    */
    
    
    private String name;
    private int age;
    private int goal;
    private userUtils utils ;

    private NavigableMap<String, Integer> scoreMap = new TreeMap<String, Integer>(); //= new HashMap<String,Integer>();

    private Stack<String> mostRecentEntries = new Stack<String>(); 
    private Stack <String> lastUsed = new Stack <String>(); 
    

    public User(){
        
    }
    
    public User(String name, int age, int goal){
        this.name = name;
        this.age = age;
        this.goal = goal;
        
        utils = new userUtils(); 
        
        loadScores();
    }
     
    public void setName(String name){
        this.name = name; 
    }
    
    public void setAge(int age){
        this.age = age; 
    }
    
    public void setGoal(int goal){
        this.goal = goal ;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public int getGoal(){
        return goal;
    }
    
    public int getMostRecentScore(){
        return utils.getLastScore(this); 
    }
    
    public int getAverage(String period) throws ParseException{ 
        return utils.computeAverageScore(this, period, "average"); // can also be "sum" to display the sum
    }

    public int getScoreCount(){
        return scoreMap.size(); 
    }

    
//    public EntrySet TODO: method to get the entrySet
    
    
    public String getMostRecentDate(){
        return utils.getLastDate(this); 
    }
    
    public int getMaxScoreValue(){; 
       return utils.getMaxScore(this);
    }
    
    public boolean isAnyScoreRegistered(){
        return !scoreMap.isEmpty(); 
    }
    
    public TreeMap<String, Integer> getScoreMap(){ //TODO should it be private?
        return (TreeMap<String, Integer>) scoreMap;   
    }
        
    
    
      public void addScore(String date, int score) throws SQLException{
        
        utils.addRemoveEntry(this, date, score, "add");
        setChanged(); //TODO: what it do?
        notifyObservers();
    }
    
    public void removeScore(String date, int score) throws SQLException{
        utils.addRemoveEntry(this, date, score, "remove");
        setChanged();
        notifyObservers();
    }
    
    
    public void modifyScoreValue(String date, int score) throws SQLException{
        utils.addRemoveEntry(this, date, score, "update score");
        setChanged();
        notifyObservers();
  
}
    

   public void modifyScoreDate(String oldDate, String newDate) throws SQLException{
       
       utils.updateDate(this, oldDate, newDate);
       setChanged();
       notifyObservers();
       


   }
   
   //*****************
     
    public Stack<String> getEntryStack(){
        return this.mostRecentEntries;  
    }
    

    public int getMinScoreValue(){
        int min = Integer.MAX_VALUE; 
        for(Entry <String, Integer> e : this.getScoreMap().entrySet()){
            if (e.getValue() < min) min = e.getValue();
        }
        return min; 
    }        
        
    
    
  
    
    
    private void loadScores(){ 
        //TODO needs to be replaced (move to sql class)
        String username;
        int score;
        String dt;
            try{
                String sql = "SELECT username, score, date FROM Scores";
                ResultSet rs = utils.selectEntries(sql); //st.executeQuery(sql);
                while(rs.next()){ // TODO shouldn't it be select from where?
                    username = rs.getString("username");
                    score = rs.getInt("score");
                    dt = rs.getString("date"); // convert to a different format?  // below check : && us_pass.equals(String.copyValueOf(password))){
                    System.out.println("username : " + username + " this name : " + this.getName());
                    if(username.equals(this.getName())){                    //TODO should check if the score isn't already in the usArr
                        if(!this.getScoreMap().containsKey(dt)){ // checks the date
                            this.getScoreMap().put(dt, score);
                            this.getEntryStack().push(dt);    
                        }
                        }
                    }
            }catch(Exception e){
                System.out.println("Exception: " + e);
        }
        
        
    }    
        
    
}

class Score extends Observable{
    
    int result;
    Date date;
    
    
        Score(int res, Date dt){
            this.result = res;
            this.date = dt;
    }
    
        int getScoreValue(){
            return result;
    }
    
        Date getScoreDate(){
            return date;
    }
    
        void setScoreValue(int val){
            this.result = val;

    }
    
        void setDateAdd(Date dt){
            this.date = dt;
    }
    
        Integer toString(Score sc){
            return sc.getScoreValue();
    }
    
    
}
