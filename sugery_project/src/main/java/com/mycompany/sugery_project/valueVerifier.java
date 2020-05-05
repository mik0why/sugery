/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.sql.SQLException;
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
    private userUtils utils = new userUtils(); 
    
    public boolean checkInputData(){ return true; }
    
    public boolean checkDate(){ return true; }
    
    
    
    
    public boolean checkConfigData(ArrayList<String> inputs) throws SQLException{
        
        //TODO catching exceptions
       String username;
       int age, goal;
       char[] password; 
       boolean invalidUsername = false; 
       
       tests = verifications.getConfigTests();
        
            username = inputs.get(0);
            if(!username.equals("")){
                if(!utils.usernameExists(username)){ //npe,why?
                    tests.replace("Name", true);
                }else{
                    JOptionPane.showMessageDialog(new JFrame("Username Exists!"), 
                        "The username already exists.");
                    invalidUsername = true; 
                }
            } //, goalOk
        
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

            password = inputs.get(3).toCharArray(); //TODO idk if that will work
            if(password.length > 0) tests.replace("Password", true);

        
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
