/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

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
    String first;
    int age;
    int goal;
    
    public User(String name, int age, int goal){
        this.first = name;
        this.age = age;
        this.goal = goal;
    }
    
    public void getName(){
        
    }
    
    public int getAge(){
        
        return 0;
    }
    
    public int getGoal(){
        
        return 0;
    }
    
    
}