/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import org.apache.poi.xssf.usermodel.*;


/**
 *
 * @author mikowhy
 */
public class excelExporter {
    private userUtils utils = new userUtils(); 
    
    
    public excelExporter(){
        
    }
    
    public void export(String query) throws SQLException{
        Statement st = utils.getSqlStatement(); 
        ResultSet rs = st.executeQuery(query);
        //XSSFWorkbook workbook = new XSSFWorkbook();
        
        
        
        
    }
    
    
}
