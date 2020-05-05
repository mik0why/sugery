/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author mikowhy
 */
public class valueVerifier {
    private validityTests verifications = new validityTests(); 
    private Hashtable<String, Boolean> tests;
    
    
    public boolean checkConfigData(ArrayList<String> inputs){
        
        //TODO catching exceptions
       String username;
       int age, goal;
       char[] password; 
        
        tests = verifications.getConfigTests();
        username = inputs.get(0);
        age = Integer.parseInt(inputs.get(1));
        goal = Integer.parseInt(inputs.get(2));
        password = inputs.get(3).toCharArray(); //TODO idk if that will work
        
        
        //Actually this shouldn't be try catch? Just go through all of them and then display appropriate messages?
        //Unless the format is incorrect - then throw an error right away
        
        try{
            if(!username.equals("")) tests.replace("Name", true); //, goalOk
        }catch(Exception e){
        }
        try{
            if(age > -1) tests.replace("Age", true);
            }catch(Exception e){
        }
        try{
            if(goal > 0) tests.replace("Goal", true); // or display the other error here?
            }catch(Exception e){
        
        } 
        try{
            if(password.length > 0) tests.replace("Password", true);
            }catch(Exception e){
        }
        return (tests.get("Name") && tests.get("Age") && tests.get("Goal") && tests.get("Password"));

    }
        
        
        


        
    
    
    
    
}
