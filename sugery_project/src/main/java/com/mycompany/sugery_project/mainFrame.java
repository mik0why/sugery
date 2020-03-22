/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javafx.stage.Stage;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mikowhy
 */
public class mainFrame extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form mainFrame
     */
    
    User user;
    // where to move this?
//    scoreArchive sa = new scoreArchive(this.user); // where should this be? it's just a new window
// TODO : rethink the display (maybe should also show goal etc?)
    public mainFrame(User usr) {
        initComponents();
        this.user = usr;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entryText = new javax.swing.JTextField();
        scoreField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        feedbackField = new javax.swing.JTextField();
        addScoreButton = new javax.swing.JButton();
        allScBut = new javax.swing.JButton();
        scAnalyze = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 138, 238));
        setBounds(new java.awt.Rectangle(100, 23, 0, 0));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        entryText.setEditable(false);
        entryText.setBackground(new java.awt.Color(238, 138, 238));
        entryText.setText("jTextField1");

        scoreField.setEditable(false);
        scoreField.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        scoreField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scoreField.setText("n/a");
        scoreField.setToolTipText("");
        scoreField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                scoreFieldPropertyChange(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jTextField1.setText("Your Score Today: ");
        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        feedbackField.setEditable(false);
        feedbackField.setText("No score yet :(");
        feedbackField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackFieldActionPerformed(evt);
            }
        });

        addScoreButton.setText("add score");
        addScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addScoreButtonActionPerformed(evt);
            }
        });

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

        scAnalyze.setText("Score Analysis");
        scAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scAnalyzeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(feedbackField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(addScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(entryText, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scAnalyze, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(allScBut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(entryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addScoreButton)
                    .addComponent(feedbackField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(allScBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scAnalyze)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void feedbackFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feedbackFieldActionPerformed

    private void addScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addScoreButtonActionPerformed
        // TODO add your handling code here:
        // show screen for inputting the data
        scoreScreen sc = new scoreScreen(user, 0); //TODO not sure
        sc.setVisible(true);
        
        if(!sc.isVisible()){
            scoreField.setText(Integer.toString(sc.user.usArr.get(0).result));
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
        scoreArchive sa = new scoreArchive(this.user); // where should this be? it's just a new window
        sa.setVisible(true);
        sa.displayScores();
        
    }//GEN-LAST:event_allScButActionPerformed

    private void allScButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allScButMouseClicked
        // TODO add your handling code here:
        scoreArchive sa = new scoreArchive(this.user); // where should this be? it's just a new window
        sa.setVisible(true);
        sa.displayScores();
        
    }//GEN-LAST:event_allScButMouseClicked

    private void scoreFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_scoreFieldPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreFieldPropertyChange

    private void allScButKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_allScButKeyPressed
        if(evt.getKeyCode() == 13){ // not working?
                scoreArchive sa = new scoreArchive(this.user); // where should this be? it's just a new window
            sa.setVisible(true);
            sa.displayScores();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_allScButKeyPressed

    private void scAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scAnalyzeActionPerformed
        scoreAnalizer scAn = new scoreAnalizer(this.user); // changed score to scores
        System.out.println(this.user.usArr);
        scAn.createAndShowGui();
        
        
        
        
        
    }//GEN-LAST:event_scAnalyzeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) { // TODO is the main necessary?
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new mainFrame().setVisible(true);
            }
        });
    }

    public void displayUserData(ArrayList<User> al, int idx){ //TODO change parameters
        //TODO display different stuff based on what time it is
        //TODO should the arrayList be also saved to a file?
            // when the program is closed (spot that moment)
        this.user.addObserver(this); // TODO: what's this?
        entryText.setText("Welcome, " + this.user.getName() + ".\n"); // why can i access .first?
        //getRecentScore
        
        int scoreArrSize = al.get(idx).usArr.size();
           if (scoreArrSize > 0){ // TODO not sure yet how to modify it
            scoreField.setText(Integer.toString(al.get(idx).usArr.get(al.get(idx).usArr.size()-1).getScoreValue()));
            jTextField1.setText(null);
            jTextField1.setText("most recent score (registered on " +
            al.get(idx).usArr.get(al.get(idx).usArr.size()-1).date
            + " )" );            
            }else{
                feedbackField.setText("no score yet :(");
            }

     
        //based on what the score is, and how much off from the goal
            //display the score differently

        }
   // }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addScoreButton;
    private javax.swing.JButton allScBut;
    private javax.swing.JTextField entryText;
    private javax.swing.JTextField feedbackField;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton scAnalyze;
    private javax.swing.JTextField scoreField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        if(o == this.user){ // checking if it's one from many im assuming
            int recentScore = this.user.usArr.get(this.user.usArr.size()-1).result;
            scoreField.setText(Integer.toString(this.user.usArr.get(this.user.usArr.size()-1).result)); // ZMI the most recent one
            jTextField1.setText("Your score updated at : " +  this.user.usArr.get(this.user.usArr.size()-1).date);
            evaluateScore(recentScore, this.user.goal);
        }else{
        
        //ZMI not done yet bc still causes an exception
           
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    public void evaluateScore(int score, int goal){
        // TODO: display the score differently based on how much off from the goal
        
        if(score <= goal){
            feedbackField.setText("LETS GO!!!");
            feedbackField.setBackground(Color.GREEN);
        }else{
            feedbackField.setText("too high dawg.");
            feedbackField.setBackground(Color.red);
        }
        
        
        
    }
}
