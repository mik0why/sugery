/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author mikowhy
 */
public class mainFrame extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form mainFrame
     */
    
    private User user;
    private userUtils table = new userUtils();    
    private ArrayList<JTextField> fields = new ArrayList<JTextField>();


    public mainFrame(User usr) {
        initComponents();
        this.user = usr;
        addFields(); 
 
        
        
    }
    
    private void addFields(){
        fields.add(scoreField);   
        fields.add(weekAvg);
        fields.add(monthAvg);        
    }
    
    private ArrayList<Integer> getScores(){
        ArrayList<Integer> scoreAverages = new ArrayList<Integer>();
        scoreAverages.add(Integer.parseInt(scoreField.getText()));
        scoreAverages.add(Integer.parseInt(weekAvg.getText()));
        scoreAverages.add(Integer.parseInt(monthAvg.getText()));
        return scoreAverages; 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        ageField = new javax.swing.JTextField();
        monthAvg = new javax.swing.JTextField();
        addScoreButton = new javax.swing.JButton();
        dateField = new javax.swing.JTextField();
        allScBut = new javax.swing.JButton();
        scAnalyze = new javax.swing.JButton();
        scoreField = new javax.swing.JTextField();
        goalField = new javax.swing.JTextField();
        logoutKey = new javax.swing.JButton();
        weekScore = new javax.swing.JTextField();
        entryText = new javax.swing.JTextField();
        weekAvg = new javax.swing.JTextField();
        monthScore = new javax.swing.JTextField();
        lastScore = new javax.swing.JTextField();
        entryText1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        feedbackField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 138, 238));
        setBounds(new java.awt.Rectangle(100, 23, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(750, 520));
        setResizable(false);
        setSize(new java.awt.Dimension(740, 550));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 597, 1061, 290);

        ageField.setEditable(false);
        ageField.setBackground(new java.awt.Color(102, 102, 102));
        ageField.setForeground(new java.awt.Color(255, 255, 255));
        ageField.setText("age: ");
        ageField.setToolTipText("");
        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ageField);
        ageField.setBounds(560, 30, 74, 30);

        monthAvg.setEditable(false);
        monthAvg.setBackground(new java.awt.Color(179, 177, 178));
        monthAvg.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        monthAvg.setForeground(new java.awt.Color(51, 51, 51));
        monthAvg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monthAvg.setText("n/a");
        monthAvg.setToolTipText("");
        monthAvg.setBorder(null);
        monthAvg.setFocusable(false);
        monthAvg.setPreferredSize(new java.awt.Dimension(160, 60));
        monthAvg.setSize(new java.awt.Dimension(160, 60));
        monthAvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthAvgActionPerformed(evt);
            }
        });
        monthAvg.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                monthAvgPropertyChange(evt);
            }
        });
        getContentPane().add(monthAvg);
        monthAvg.setBounds(280, 280, 160, 60);

        addScoreButton.setBackground(new java.awt.Color(102, 102, 102));
        addScoreButton.setForeground(new java.awt.Color(255, 255, 255));
        addScoreButton.setText("Add Score");
        addScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addScoreButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addScoreButton);
        addScoreButton.setBounds(280, 400, 145, 32);

        dateField.setEditable(false);
        dateField.setBackground(new java.awt.Color(179, 177, 178));
        dateField.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        dateField.setForeground(new java.awt.Color(51, 51, 0));
        dateField.setText("Last score registered at ");
        dateField.setToolTipText("");
        dateField.setBorder(null);
        dateField.setFocusable(false);
        dateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dateField);
        dateField.setBounds(320, 360, 320, 30);

        allScBut.setBackground(new java.awt.Color(102, 102, 102));
        allScBut.setForeground(new java.awt.Color(255, 255, 255));
        allScBut.setText("All Scores");
        allScBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allScButMouseClicked(evt);
            }
        });
        allScBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allScButActionPerformed(evt);
            }
        });
        allScBut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                allScButKeyPressed(evt);
            }
        });
        getContentPane().add(allScBut);
        allScBut.setBounds(460, 400, 121, 32);

        scAnalyze.setBackground(new java.awt.Color(102, 102, 102));
        scAnalyze.setForeground(new java.awt.Color(255, 255, 255));
        scAnalyze.setText("Score Analysis");
        scAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scAnalyzeActionPerformed(evt);
            }
        });
        getContentPane().add(scAnalyze);
        scAnalyze.setBounds(610, 400, 121, 32);

        scoreField.setEditable(false);
        scoreField.setBackground(new java.awt.Color(179, 177, 178));
        scoreField.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        scoreField.setForeground(new java.awt.Color(0, 102, 51));
        scoreField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scoreField.setText("n/a");
        scoreField.setToolTipText("");
        scoreField.setBorder(null);
        scoreField.setFocusable(false);
        scoreField.setPreferredSize(new java.awt.Dimension(90, 60));
        scoreField.setSize(new java.awt.Dimension(160, 60));
        scoreField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                scoreFieldPropertyChange(evt);
            }
        });
        getContentPane().add(scoreField);
        scoreField.setBounds(280, 140, 160, 60);

        goalField.setEditable(false);
        goalField.setBackground(new java.awt.Color(102, 102, 102));
        goalField.setForeground(new java.awt.Color(255, 255, 255));
        goalField.setText("goal: ");
        goalField.setToolTipText("");
        getContentPane().add(goalField);
        goalField.setBounds(560, 70, 82, 30);

        logoutKey.setBackground(new java.awt.Color(102, 102, 102));
        logoutKey.setForeground(new java.awt.Color(255, 255, 255));
        logoutKey.setText("Logout");
        logoutKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutKeyActionPerformed(evt);
            }
        });
        getContentPane().add(logoutKey);
        logoutKey.setBounds(276, 450, 460, 32);

        weekScore.setBackground(new java.awt.Color(179, 177, 178));
        weekScore.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        weekScore.setForeground(new java.awt.Color(51, 51, 0));
        weekScore.setText("7 Day Average");
        weekScore.setBorder(null);
        weekScore.setFocusable(false);
        getContentPane().add(weekScore);
        weekScore.setBounds(440, 230, 290, 30);

        entryText.setEditable(false);
        entryText.setBackground(new java.awt.Color(178, 176, 177));
        entryText.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        entryText.setForeground(new java.awt.Color(51, 51, 51));
        entryText.setAlignmentX(1.0F);
        entryText.setBorder(null);
        getContentPane().add(entryText);
        entryText.setBounds(270, 20, 250, 70);

        weekAvg.setEditable(false);
        weekAvg.setBackground(new java.awt.Color(179, 177, 178));
        weekAvg.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        weekAvg.setForeground(new java.awt.Color(204, 0, 51));
        weekAvg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        weekAvg.setText("n/a");
        weekAvg.setToolTipText("");
        weekAvg.setBorder(null);
        weekAvg.setFocusable(false);
        weekAvg.setSize(new java.awt.Dimension(160, 60));
        weekAvg.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                weekAvgPropertyChange(evt);
            }
        });
        getContentPane().add(weekAvg);
        weekAvg.setBounds(280, 210, 160, 60);

        monthScore.setBackground(new java.awt.Color(179, 177, 178));
        monthScore.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        monthScore.setForeground(new java.awt.Color(51, 51, 0));
        monthScore.setText("30 Day Average");
        monthScore.setBorder(null);
        monthScore.setFocusable(false);
        monthScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthScoreActionPerformed(evt);
            }
        });
        getContentPane().add(monthScore);
        monthScore.setBounds(440, 300, 290, 30);

        lastScore.setBackground(new java.awt.Color(179, 177, 178));
        lastScore.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lastScore.setForeground(new java.awt.Color(51, 51, 0));
        lastScore.setText("Last Update");
        lastScore.setBorder(null);
        lastScore.setFocusable(false);
        lastScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastScoreActionPerformed(evt);
            }
        });
        getContentPane().add(lastScore);
        lastScore.setBounds(440, 160, 140, 30);

        entryText1.setEditable(false);
        entryText1.setBackground(new java.awt.Color(175, 173, 174));
        entryText1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        entryText1.setForeground(new java.awt.Color(51, 51, 51));
        entryText1.setText("Welcome,");
        entryText1.setAlignmentX(1.0F);
        entryText1.setBorder(null);
        getContentPane().add(entryText1);
        entryText1.setBounds(90, 20, 170, 70);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green-potted-plant-on-white-ceramic-vase-1166644.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(750, 580));
        jLabel4.setMinimumSize(new java.awt.Dimension(750, 580));
        jLabel4.setName(""); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(750, 580));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -40, 760, 580);

        feedbackField.setEditable(false);
        feedbackField.setText("No score yet :(");
        feedbackField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackFieldActionPerformed(evt);
            }
        });
        getContentPane().add(feedbackField);
        feedbackField.setBounds(240, 320, 132, 47);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0), 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(270, 100, 130, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateFieldActionPerformed

    private void feedbackFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feedbackFieldActionPerformed

    private void addScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addScoreButtonActionPerformed
        // show screen for inputting the data
        scoreScreen sc = new scoreScreen(user, false, null); //TODO not sure
        sc.setVisible(true);
        
        if(!sc.isVisible()){
            scoreField.setText(Integer.toString(user.getMostRecentScore()));
        }
      
        
    }//GEN-LAST:event_addScoreButtonActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        if(scoreField.getText().equals("n/a")){
            scoreField.setText(null);
        }
    }//GEN-LAST:event_formMouseClicked

    private void allScButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allScButActionPerformed
        // TODO add your handling code here:
        scoreArchive sa;
        try {
            sa = new scoreArchive(this.user); // where should this be? it's just a new window
            sa.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_allScButActionPerformed

    private void allScButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allScButMouseClicked

    }//GEN-LAST:event_allScButMouseClicked

    private void scoreFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_scoreFieldPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreFieldPropertyChange

    private void allScButKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_allScButKeyPressed
 
    }//GEN-LAST:event_allScButKeyPressed

    private void scAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scAnalyzeActionPerformed
        scoreAnalizer scAn = new scoreAnalizer(this.user); // changed score to scores
        scAn.createAndShowGui();
 
    }//GEN-LAST:event_scAnalyzeActionPerformed

    private void logoutKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutKeyActionPerformed
            this.setVisible(false);
            loginScreen ls = new loginScreen();
            ls.setVisible(true);
            // set loginframe visible
            
    }//GEN-LAST:event_logoutKeyActionPerformed

    private void monthAvgPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_monthAvgPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_monthAvgPropertyChange

    private void weekAvgPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_weekAvgPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_weekAvgPropertyChange

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void monthAvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthAvgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthAvgActionPerformed

    private void monthScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthScoreActionPerformed

    private void lastScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastScoreActionPerformed

    /**
     * @param args the command line arguments
     */




    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addScoreButton;
    private javax.swing.JTextField ageField;
    private javax.swing.JButton allScBut;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField entryText;
    private javax.swing.JTextField entryText1;
    private javax.swing.JTextField feedbackField;
    private javax.swing.JTextField goalField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastScore;
    private javax.swing.JButton logoutKey;
    private javax.swing.JTextField monthAvg;
    private javax.swing.JTextField monthScore;
    private javax.swing.JButton scAnalyze;
    private javax.swing.JTextField scoreField;
    private javax.swing.JTextField weekAvg;
    private javax.swing.JTextField weekScore;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) { //TODO fix (not sure if this or other method)
        if(o == this.user){ // checking if it's one from many im assuming
            scoreField.setText(this.user.getScoreMap().lastEntry().getValue().toString());
            dateField.setText("Last Score Registered At: "+ this.user.getScoreMap().lastKey()); // or last entry
            
            
            scoreField.setText(Integer.toString(this.user.getMostRecentScore()));
            dateField.setText(user.getMostRecentDate());
            try {
                weekAvg.setText(Integer.toString(user.getAverage("week")));
            } catch (ParseException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                monthAvg.setText(Integer.toString(user.getAverage("month")));
            } catch (ParseException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            evaluateScore(this.user.getGoal());

        }else{
        
        }
    }
    
    

    
    public void displayUserData() throws ClassNotFoundException, SQLException, ParseException{ //TODO change parameters
    //TODO display different stuff based on what time it is
    // when the program is closed (spot that moment)

    this.user.addObserver(this); 
    entryText.setText(user.getName() + ".\n"); 
    ageField.setText("age : " + user.getAge());
    goalField.setText("goal : " + user.getGoal()); 

    if(user.isAnyScoreRegistered()){ 
        scoreField.setText(Integer.toString(user.getMostRecentScore()));
        dateField.setText(user.getMostRecentDate());
        weekAvg.setText(Integer.toString(user.getAverage("week")));
        monthAvg.setText(Integer.toString(user.getAverage("month")));
        evaluateScore(user.getGoal()); // todo replace with "setFonts"
    }


    }
    
    public void evaluateScore(int goal){
        // TODO: display the score differently based on how much off from the goal
        //TODO check if it's working properly
        JTextField textField;
         goal = this.user.getGoal();
         int score; 
         ArrayList<Integer> scores = getScores();
        
            //TODO change font instead of text, removed feedback field
            
        for(int i = 0; i < 3; i++){    
            textField = fields.get(i);
            score = scores.get(i);
            if(score <= goal){
                textField.setForeground(new java.awt.Color(0,102,51));
            }else if(score > goal * 1.5){
                textField.setForeground(new java.awt.Color(204,0,51));
            }else if(score > goal * 1.3){
                textField.setForeground(new java.awt.Color(3, 111, 252));
            }else if(score > goal * 1.15){
                textField.setForeground(new java.awt.Color( 206, 252, 3));
            }else if(score > goal * 1){
                textField.setForeground(new java.awt.Color( 30,102,51));                
            }
            else{

            }
        }
    }
    
}
