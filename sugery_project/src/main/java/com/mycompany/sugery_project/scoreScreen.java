/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.lang.Object;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.String;

/**
 *
 * @author mikowhy
 */
//TODO fix the update thing
public class scoreScreen extends javax.swing.JFrame  {

    /**
     * Creates new form scoreScreen
     */
    User user;
    int index; //Not necessary 
    boolean focusTraversalKeysEnabled = false;

    @Override
    public void setFocusTraversalKeysEnabled(boolean focusTraversalKeysEnabled) {
        super.setFocusTraversalKeysEnabled(focusTraversalKeysEnabled); //To change body of generated methods, choose Tools | Templates.
    }
    
    public scoreScreen(User usr, int idx) { // change usr to string
        initComponents();
        this.user = usr;
    }

    private void keyPressed(java.awt.event.KeyEvent e){
        if (e.getKeyCode() == 27){
            this.setVisible(false);
        }
    }
    /*
    public void addScore(int result){
        Score sc = new Score(result, new Date());
        user.usArr.add(sc);
    }
    */
    
    public void modifyScore(){ // sql update (?)
        
    }
    
    public void deleteScore(){ // sql deletion
        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAr = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        scoreSet = new javax.swing.JButton();
        scoreField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        checkbox1 = new java.awt.Checkbox();
        dateField = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jScrollPane2.setBorder(null);

        textAr.setEditable(false);
        textAr.setBackground(new java.awt.Color(238, 238, 238));
        textAr.setColumns(20);
        textAr.setRows(1);
        textAr.setText("Enter your score in the area below:");
        textAr.setAutoscrolls(false);
        textAr.setBorder(null);
        jScrollPane2.setViewportView(textAr);

        jTextField1.setBackground(new java.awt.Color(238, 238, 238));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        scoreSet.setText("set");
        scoreSet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scoreSetMouseClicked(evt);
            }
        });
        scoreSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreSetActionPerformed(evt);
            }
        });
        scoreSet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                scoreSetKeyPressed(evt);
            }
        });

        scoreField.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        scoreField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scoreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                scoreFieldKeyPressed(evt);
            }
        });

        jButton3.setText("close");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        checkbox1.setBackground(new java.awt.Color(63, 63, 65));
        checkbox1.setForeground(new java.awt.Color(255, 255, 255));
        checkbox1.setLabel("Custom Date");

        dateField.setText("jTextField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addGap(195, 195, 195))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scoreSet, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scoreSet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void scoreSetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreSetMouseClicked
        //TODO: delete
    }//GEN-LAST:event_scoreSetMouseClicked

    
    private void scoreFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreFieldKeyPressed
            
        //this is for enter and not working?
        System.out.println("here");    
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){ //this should be made a function bc used twice
                try {
                    this.user.addScore(Integer.parseInt(scoreField.getText().replaceAll("\\s+","")));
                    addScore();
                } catch (IOException ex) {
                    Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
                jTextField1.setText(scoreField.getText().replaceAll("\\s+","") + " set as the score");
            }
        
    }//GEN-LAST:event_scoreFieldKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void scoreSetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreSetKeyPressed
//TODO del
    }//GEN-LAST:event_scoreSetKeyPressed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
                   this.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
                   this.setVisible(false);
    }//GEN-LAST:event_jButton3KeyPressed

    private void scoreSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreSetActionPerformed
        // TODO add your handling code here:
         try {
             
                        this.user.addScore(Integer.parseInt(scoreField.getText().replaceAll("\\s+","")));
                        addScore(); //TODO make a change to the date
           
                        
                        /*
                        if(checkbox1.isSelected()){
                            
                        } */
                        
                        
                        jTextField1.setText(scoreField.getText().replaceAll("\\s+","") + " set as the score");
                        //this.user.addScore(Integer.parseInt(scoreField.getText().replaceAll("\\s+","")));
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParseException ex) {
                        Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
            Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
                    jTextField1.setText(scoreField.getText().replaceAll("\\s+","") + " set as the score");
        
        
        
        
    }//GEN-LAST:event_scoreSetActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox checkbox1;
    private javax.swing.JTextField dateField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField scoreField;
    private javax.swing.JButton scoreSet;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextArea textAr;
    // End of variables declaration//GEN-END:variables


    // need to register the day of the input

    void addScore() throws ClassNotFoundException, SQLException, ParseException{
        //TODO only triggered on one KeyEvent?
        /*TODO maybe there should be a condition that if the same score
        was added less thatn 5/10 seconds ago then it shouldn't add it
        or better: have a window that asks whether you want to add the same score?
       
        Already Added : .... Do you want to add this score again?
        
        BTW functionality for custom date
    */
        
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Class.forName("com.mysql.cj.jdbc.Driver"); // is it necessary?
        String url = "jdbc:mysql://localhost/LOG?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
        Connection conn = DriverManager.getConnection(url,"root","Pass123!!!"); 
        Statement st = conn.createStatement();
        if(checkbox1.getState()){
            // date is custom
        }
        
        
        String sql = "INSERT INTO `Scores` (`username`, `score`, `date`) VALUES ('"
                + this.user.getName() + '\'' + "," + Integer.parseInt(scoreField.getText().replaceAll("\\s+","")) 
        + ","+ '\'' +  dateFormat.format(new Date())  +  "');" ; 
        st.executeUpdate(sql);
        this.user.getUsArr().add(new Score(Integer.parseInt(scoreField.getText().replaceAll("\\s+","")), new Date()));
        
    }


}
