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

/**
 *
 * @author mikowhy
 */
public class SugaryApp {
    //TODO fields should be private
    
    /**
     * @param args the command line arguments
     */

/*
    public static void main(String[] args) {
        // TODO code application logic here
    
    }
  */  
}


//1. When to make classes public?

class User extends Observable implements Serializable{
    
    /*
        When should the database be used?
    
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

    public User(String name, int age, int goal){
        this.first = name;
        this.age = age;
        this.goal = goal;
    }
    
    public String getName(){
        return first;
    }
    
    public int getAge(){
        return age;
    }
    
    public int getGoal(){
        return goal;
    }
    
    public void addScore(int result) throws FileNotFoundException, IOException{ //ZMI when else should notifyObservers be called?
        this.usArr.add(new Score(result, new Date()));
        setChanged(); //TODO: what it do?
        notifyObservers();
    }
    
    public ArrayList<Score> getUsArr(){
        return this.usArr;
    }
    /*
        public void setScore(int todayScore){ // need to specify which score in the array
        this.score = todayScore;
    }
    
    public int getScore(){
        return score;
    }
*/
    
}

class Score extends Observable{
    
    int result;
    Date date;
    
    
    public Score(int res, Date dt){
            this.result = res;
            this.date = dt;
    }
    
    public int getScoreValue(){
        return result;
    }
    
    public Date getScoreDate(){
        return date;
    }
    
    public void setScoreValue(int val){
        this.result = val;

    }
    
    public void setDateAdd(Date dt){
        this.date = dt;
    }
    
    public Integer toString(Score sc){
        return sc.getScoreValue();
    }
    
    
}
