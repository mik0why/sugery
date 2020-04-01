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
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
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
    private ArrayList<Score> usArr = new ArrayList<Score>();
    //private Map<String, Integer> scoreMap = new HashMap<>(); //= new HashMap<String,Integer>();
    private NavigableMap<String, Integer> scoreMap = new TreeMap<String, Integer>(); //= new HashMap<String,Integer>();
    User(String name, int age, int goal){
        this.first = name;
        this.age = age;
        this.goal = goal;
    }
    
    //TODO: get rid of 'public', other minor changes
    String getName(){
        return first;
    }
    
    int getAge(){
        return age;
    }
    
    int getGoal(){
        return goal;
    }
    
    TreeMap<String, Integer> getHM(){ // should this be one method?
        return (TreeMap<String, Integer>) scoreMap;
    }
    
    void HM_Insert(String d, int score){
        scoreMap.put(d, score);
    }
    
    void addScore(int result) throws FileNotFoundException, IOException{ //ZMI when else should notifyObservers be called?
        this.usArr.add(new Score(result, new Date()));
        setChanged(); //TODO: what it do?
        notifyObservers();
    }
    
    ArrayList<Score> getUsArr(){
        return this.usArr;
    }
    
    ResultSet sqlConnect(String date, int score, int mode){
        ResultSet rs = null ;
        
        //idk if the mode variable necessary since the SQL query itself determines the operation type
        //i guess at the end bc we don't return anything at deletion?
        if(mode == 0){ // deletion
            return null; 
        }
        
        
        return rs; 
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
