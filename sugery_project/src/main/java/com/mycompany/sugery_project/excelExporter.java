/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.sql.Statement;

/**
 *
 * @author mikowhy
 */
public class excelExporter {
    private userUtils utils = new userUtils(); 
    
    
    public excelExporter(){
        
    }
    
    public void export(String query){
        Statement st = utils.getSqlStatement(); 
        
        
        
    }
    
    
}
