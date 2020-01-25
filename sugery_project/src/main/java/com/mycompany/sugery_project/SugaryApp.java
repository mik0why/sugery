/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mikowhy
 */
public class SugaryApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}


//1. When to make classes public?

class User{
    
    // score should be an integer array, so then can easily operate on it
    
    String first;
    int age;
    int goal;
    ArrayList<Score> usArr = new ArrayList<Score>();

/*    int score = 0;    
    int scoreArr[]; 
    
    Score scorArr[]; 
*/    
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
    
    /*
        public void setScore(int todayScore){ // need to specify which score in the array
        this.score = todayScore;
    }
    
    public int getScore(){
        return score;
    }
*/
    
}

class Score{
    
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
