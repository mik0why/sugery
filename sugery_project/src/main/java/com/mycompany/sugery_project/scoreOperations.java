/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author mikowhy
 */
public class scoreOperations {
    
    public scoreOperations(){
        
    }
    
    public ArrayList<String> displayAnalysis(Set<Entry<String, Integer>>  set ){
        ArrayList<String> ret = new ArrayList<String>(); 
        
        
        
        
        int sum = 0, counter = 0; 
        
        for(Entry<String, Integer> e : set){
            sum+=e.getValue();
            counter++;
        }
        // not adding null - remember to clear the output field first
        ret.add(counter + " scores registered");
        ret.add(Integer.toString(sum / counter));
        
        
        
        
        
        
        return ret; 
    }
    
    
}
