/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sugery_project;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author mikowhy
 */
public class singleScoreDisplay extends javax.swing.JFrame implements Observer{

    private User user; 
    private int score; 
    private String date;
    /** Creates new form singleScoreDisplay */
    public singleScoreDisplay(User user, String date, int score) {
        
        initComponents();
        this.user = user;
        this.score = score; 
        this.date= date; 
        this.user.addObserver(this);
        displayData();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    private void displayData(){
        scoreValueField.setText(Integer.toString(score));
        dateField.setText(date);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scoreValueField = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        dateChange = new javax.swing.JButton();
        dateField = new javax.swing.JTextField();
        valueChange = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(405, 325));
        setMinimumSize(new java.awt.Dimension(405, 325));
        setPreferredSize(new java.awt.Dimension(420, 305));
        getContentPane().setLayout(null);

        scoreValueField.setEditable(false);
        scoreValueField.setBackground(new java.awt.Color(0, 0, 0));
        scoreValueField.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        scoreValueField.setForeground(new java.awt.Color(255, 255, 255));
        scoreValueField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scoreValueField.setText("142");
        scoreValueField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreValueFieldActionPerformed(evt);
            }
        });
        getContentPane().add(scoreValueField);
        scoreValueField.setBounds(40, 20, 340, 70);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Registered At");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(280, 110, 110, 30);

        dateChange.setText("Change Date");
        getContentPane().add(dateChange);
        dateChange.setBounds(280, 230, 130, 32);

        dateField.setEditable(false);
        dateField.setBackground(new java.awt.Color(0, 0, 0));
        dateField.setForeground(new java.awt.Color(255, 255, 255));
        dateField.setText("jTextField3");
        getContentPane().add(dateField);
        dateField.setBounds(190, 140, 200, 40);

        valueChange.setText("Change Value");
        valueChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueChangeActionPerformed(evt);
            }
        });
        getContentPane().add(valueChange);
        valueChange.setBounds(140, 230, 120, 30);

        quitButton.setText("close");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(quitButton);
        quitButton.setBounds(330, 270, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swirl-candy-stick-1266105.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 420, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scoreValueFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreValueFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreValueFieldActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void valueChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueChangeActionPerformed
        new scoreScreen(this.user, true, this.date).setVisible(true);
    }//GEN-LAST:event_valueChangeActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dateChange;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton quitButton;
    private javax.swing.JTextField scoreValueField;
    private javax.swing.JButton valueChange;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        
        if(o == this.user){
            //ok for score - but what about when the date changes?
            scoreValueField.setText(Integer.toString(this.user.getHM().get(this.date)));
        }
        
        
        
        
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
