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
    
    Database Usages: 
    
    SELECT: retrieve a particular user from the database
            no need to use it for getters? once the user is retrieved
                can simply operate on the getters
    UPDATE: ? change in users data (idk as now of when would that be)
                eg modifying goal/age (next stage)
    INSERT: new user added
            new score added (unlike getters this should be inserted into SQL)
    DELETE: delete particular score
            delete particular user
        
    */
    
    
    private String first;
    private int age;
    private int goal;
    private Stack<String> mostRecentEntries = new Stack<String>(); 
    private ArrayList<Score> usArr = new ArrayList<Score>();
    private NavigableMap<String, Integer> scoreMap = new TreeMap<String, Integer>(); //= new HashMap<String,Integer>();
    private entryTable dataTable = new entryTable();
    private Stack <String> lastUsed = new Stack <String>(); 
    
    public User(String name, int age, int goal){
        this.first = name;
        this.age = age;
        this.goal = goal;
        
        loadScores();
    }
    
    //TODO: get rid of 'public', other minor changes
    //TODO getters and setters for user
    String getName(){
        return first;
    }
    
    public int getAge(){
        return age;
    }
    
    public int getGoal(){
        return goal;
    }
    
    public TreeMap<String, Integer> getHM(){ // should this be one method?
        return (TreeMap<String, Integer>) scoreMap;
    }
    
    public Stack<String> getEntryStack(){
        return this.mostRecentEntries;  
    }
    
    public int getMaxScoreValue(){
        int max = Integer.MIN_VALUE; 
        for(Entry <String, Integer> e : this.getHM().entrySet()){
            if (e.getValue() > max) max = e.getValue();
        }
        return max; 
    }
    
    public int getMinScoreValue(){
        int min = Integer.MAX_VALUE; 
        for(Entry <String, Integer> e : this.getHM().entrySet()){
            if (e.getValue() < min) min = e.getValue();
        }
        return min; 
    }        
        
        
    
    
    public void HM_Insert(String date, int score){
        this.scoreMap.put(date, score);
        this.mostRecentEntries.push(date);
        setChanged(); //TODO: what it do?
        notifyObservers();
    }
    
    public void HM_Replace(String date, int score){
        this.scoreMap.replace(date, score);
        this.mostRecentEntries.remove(date);
        this.mostRecentEntries.push(date);
        setChanged();
        notifyObservers();
    }
    

   public void HM_Replace_Key(String oldDate, String newDate){
       int value = this.scoreMap.remove(oldDate);
       this.scoreMap.put(newDate, value);
       this.mostRecentEntries.remove(oldDate);
       this.mostRecentEntries.push(newDate);
       setChanged();
       notifyObservers();
       


   }
    
    public void removeScore(String date){
        this.scoreMap.remove(date); 
        this.mostRecentEntries.remove(date);
        setChanged();
        notifyObservers();
    }
    
    public ArrayList<Score> getUsArr(){
        return this.usArr;
    }
    
    public ResultSet sqlConnect(String date, int score, int mode){
        ResultSet rs = null ;
        
        //idk if the mode variable necessary since the SQL query itself determines the operation type
        //i guess at the end bc we don't return anything at deletion?
        if(mode == 0){ // deletion
            return null; 
        }
        
        
        return rs; 
    }
    
        public ArrayList<String> displayAnalysis(String range ) throws ParseException{
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

            return ret; 
    }
    
    public void loadScores(){
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
