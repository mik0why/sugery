/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.util.Hashtable;

/**
 *
 * @author mikowhy
 */
public class validityTests {
 
    
    
    
    public Hashtable<String, Boolean> getConfigTests(){
        Hashtable<String, Boolean> testSet = new Hashtable<>(); 
        testSet = new Hashtable<String, Boolean>();
        testSet.put("Name", false);
        testSet.put("Age", false);
        testSet.put("Goal", false);
        testSet.put("Password", false);

        return testSet; 
    }
}
    
    
   
