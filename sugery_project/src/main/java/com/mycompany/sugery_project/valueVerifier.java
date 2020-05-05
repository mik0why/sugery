/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mikowhy
 */
public class valueVerifier {
    private validityTests verifications = new validityTests(); 
    private Hashtable<String, Boolean> tests;
    private userUtils utils; 
    
    public boolean checkInputData(){ return true; }
    
    public boolean checkDate(){ return true; }
    
    
    
    
    public boolean checkConfigData(ArrayList<String> inputs){
        
        //TODO catching exceptions
       String username;
       int age, goal;
       char[] password; 
       
       boolean invalidUsername = false; 
       
        tests = verifications.getConfigTests();
        
        
        //Actually this shouldn't be try catch? Just go through all of them and then display appropriate messages?
        //Unless the format is incorrect - then throw an error right away
        
        try{
            username = inputs.get(0);
            if(!username.equals("")){
                if(!utils.usernameExists(username)){
                    tests.replace("Name", true);
                }else{
                   
                }
            } //, goalOk
        }catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame("Username Exists!"), 
                           "The username already exists.");
            invalidUsername = true; 
            
            
        }
        try{
            age = Integer.parseInt(inputs.get(1));
            if(age > -1) tests.replace("Age", true);
            }catch(Exception e){
                
        }
        try{
            goal = Integer.parseInt(inputs.get(2));    
            if(goal > 0) tests.replace("Goal", true); // or display the other error here?
            }catch(Exception e){
                
        
        } 
        try{
            password = inputs.get(3).toCharArray(); //TODO idk if that will work
            if(password.length > 0) tests.replace("Password", true);
            }catch(Exception e){
                
        }
        
        for (Map.Entry ent : tests.entrySet()){
            if(!(Boolean)ent.getValue()){ 
                System.out.println("ent to String: " + ent.getKey().toString());
                if(ent.getKey().toString() == "Name"  && invalidUsername){ // why printed more than once?
                    break; // don't output this error when the user inputs invalid username
                }else{
                JOptionPane.showMessageDialog(new JFrame("Problem"), 
                    ent.getKey() + " incorrectly specified. Please review");
                }
            }
        }
        
        
        return (tests.get("Name") && tests.get("Age") && tests.get("Goal") && tests.get("Password"));

    }
        
        
        


        
    
    
    
    
}
