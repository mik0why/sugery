/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.IllegalFormatException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mikowhy
 */
public class dateChanger extends javax.swing.JFrame {

    /**
     * Creates new form dateChanger
     */
    private String oldDate; 
    private String newDate; 
    private User user; 
    private userUtils entryTable = new userUtils();
   
    public dateChanger(User user, String date) {
        this.oldDate = date; 
        this.user = user; 
        initComponents();
        prefilFields(); 
    }

    private void modifyDate() throws ParseException, SQLException{

       //TODO move modifyScore before caling entryTable
       String newDate = composeDate(); 
       user.modifyScoreDate(oldDate, newDate); 

    }
    
    private String composeDate() throws ParseException{
           String userDate = new String();
           DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           try{
                userDate = yearField.getText() + "-" + monthField.getText() + "-" + dayField.getText()
                        + " " + timeField.getText(); 
                dateFormat.parse(userDate); 
           }catch(IllegalFormatException e){ //throw ParseException?
               System.out.println("Illegal format!"); //TODO output in a jframe
           }
           return userDate; 
    }
    
    private void prefilFields(){
      //  TODO not sure if necessary
        
    }
    
    private boolean fieldsCheck(){
        //TODO add checking each of the fields
        int year, month, day;
        String time; 
        //timeFormat
        
        
        try{
            year = Integer.parseInt(yearField.getText());
            month = Integer.parseInt(monthField.getText());
            day = Integer.parseInt(dayField.getText());
            
            // TODO set newDate
        }catch(NumberFormatException e){
            //output the error
            System.out.println(e);
            return false;
            
        }
        

        
        return true; 
    }
    
 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        setDate = new javax.swing.JButton();
        yearField = new javax.swing.JTextField();
        monthField = new javax.swing.JTextField();
        dayField = new javax.swing.JTextField();
        timeField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Enter the date in the specified format:");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDate.setText("Set");
        setDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDateActionPerformed(evt);
            }
        });

        yearField.setBackground(new java.awt.Color(255, 255, 255));
        yearField.setForeground(new java.awt.Color(204, 204, 204));
        yearField.setText("2020");
        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });

        monthField.setBackground(new java.awt.Color(255, 255, 255));
        monthField.setForeground(new java.awt.Color(204, 204, 204));
        monthField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monthField.setText("04");
        monthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthFieldActionPerformed(evt);
            }
        });

        dayField.setBackground(new java.awt.Color(255, 255, 255));
        dayField.setForeground(new java.awt.Color(204, 204, 204));
        dayField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dayField.setText("15");
        dayField.setMinimumSize(new java.awt.Dimension(46, 24));
        dayField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayFieldActionPerformed(evt);
            }
        });

        timeField.setBackground(new java.awt.Color(255, 255, 255));
        timeField.setForeground(new java.awt.Color(204, 204, 204));
        timeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timeField.setText("12:30:55");
        timeField.setMinimumSize(new java.awt.Dimension(46, 24));
        timeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(setDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(timeField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(setDate))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDateActionPerformed
        
        if(fieldsCheck()){
            try {
                modifyDate();
            } catch (ParseException ex) {
                Logger.getLogger(dateChanger.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(dateChanger.class.getName()).log(Level.SEVERE, null, ex);
            }
 
                    
        }
        //String x = dateField.toString();        
        // this shouldn't necessairly be a query, it's based on 
        // whether the goal is to update the date, or to set it
        // for the first time - sth to rethink
        
        
    }//GEN-LAST:event_setDateActionPerformed

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldActionPerformed

    private void monthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthFieldActionPerformed

    private void dayFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayFieldActionPerformed

    private void timeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeFieldActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dayField;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField monthField;
    private javax.swing.JButton setDate;
    private javax.swing.JTextField timeField;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables

    //private javax.swing.JTextField dateField;
}
