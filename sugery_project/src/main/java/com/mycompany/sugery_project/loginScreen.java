/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*; 
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
 /*
 * @author mikowhy
 */

public class loginScreen extends javax.swing.JFrame {
    //TODO needs a fix:  pressing the "Enter" button
    /**
     * Creates new form loginScreen
     */
    mainFrame mf; // TODO needs to be fixed (what exactly?)
    configJFrame jf = new configJFrame(); 
   
    ArrayList<User> usData = new ArrayList<User>(); // TODO: remove
    userUtils utils = new userUtils(); 

    boolean focusTraversalKeysEnabled = false;
    @Override
    public void setFocusTraversalKeysEnabled(boolean focusTraversalKeysEnabled) {
        super.setFocusTraversalKeysEnabled(focusTraversalKeysEnabled); //To change body of generated methods, choose Tools | Templates.
    }
    //TODO should have a database field
    public loginScreen() {
        initComponents();
        loginButton.setBackground(Color.BLACK);
        jf.getRootPane().setWindowDecorationStyle(JRootPane.COLOR_CHOOSER_DIALOG);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        passField = new javax.swing.JPasswordField();
        jScrollPane3 = new javax.swing.JScrollPane();
        logErrorField = new javax.swing.JTextArea();
        newUserButton = new javax.swing.JButton();
        userField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setBackground(new java.awt.Color(0, 0, 153));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButtonKeyPressed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        passField.setBackground(new java.awt.Color(0, 0, 0));
        passField.setForeground(new java.awt.Color(255, 255, 255));
        passField.setBorder(null);
        jPanel1.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 287, -1));

        logErrorField.setEditable(false);
        logErrorField.setBackground(new java.awt.Color(0, 0, 0));
        logErrorField.setColumns(20);
        logErrorField.setForeground(new java.awt.Color(153, 153, 255));
        logErrorField.setLineWrap(true);
        logErrorField.setRows(1);
        logErrorField.setBorder(null);
        logErrorField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logErrorFieldKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(logErrorField);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, 43));

        newUserButton.setBackground(new java.awt.Color(0, 0, 0));
        newUserButton.setForeground(new java.awt.Color(255, 255, 255));
        newUserButton.setActionCommand("add new user");
        newUserButton.setLabel("create new user");
        newUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newUserButtonMouseClicked(evt);
            }
        });
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });
        newUserButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newUserButtonKeyPressed(evt);
            }
        });
        jPanel1.add(newUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 147, -1));

        userField.setBackground(new java.awt.Color(0, 0, 0));
        userField.setForeground(new java.awt.Color(255, 255, 255));
        userField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        userField.setBorder(null);
        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });
        userField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userFieldKeyPressed(evt);
            }
        });
        jPanel1.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 347, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("forgot password?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 110, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setRequestFocusEnabled(false);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 280, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setRequestFocusEnabled(false);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 280, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back5b2.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1323, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 1122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 500));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Copyright 2020 by mik0why");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 120, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Username");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 496, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==9){
            passField.requestFocus();
        }else if(evt.getKeyCode()==13){
            passField.requestFocusInWindow();
        }
    }//GEN-LAST:event_userFieldKeyPressed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    private void newUserButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newUserButtonKeyPressed
        if(evt.getKeyCode()==13){
            jf.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_newUserButtonKeyPressed

    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserButtonActionPerformed
        jf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_newUserButtonActionPerformed

    private void newUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserButtonMouseClicked
        // creating a new user
        jf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_newUserButtonMouseClicked

    private void logErrorFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logErrorFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==9){
            loginButton.requestFocus();
        }
    }//GEN-LAST:event_logErrorFieldKeyPressed

    private void loginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginButtonKeyPressed
        // TODO rearrange bc redundant
        if(userField.getText().isEmpty() || passField.getPassword().length == 0){
            logErrorField.setText("no login / password entered!"); // can extend to show which one
        }else{
            try {
                System.out.println("evt keycode: " + evt.getKeyCode());
                if(evt.getKeyCode() == 10 ) // enter
                loginAttempt(userField.getText(), passField.getPassword());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loginButtonKeyPressed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        //should rearrange this just to be loginAttempt();

        String username = userField.getText();
        char[] password = passField.getPassword();
        if(username.isEmpty() || password.length == 0){
            logErrorField.setText("no login or password entered!"); // can extend to show which one
        }else{
            try {
                loginAttempt(username, password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(loginScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(loginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginScreen().setVisible(true);
            }
        });
    }
    private void loginAttempt(String login, char[] password) throws ClassNotFoundException, SQLException, ParseException{
        boolean usrFound = utils.verifyCredentials(login, password);
        if(usrFound){ 
            mf = new mainFrame(utils.getUser(userField.getText())); 
            this.setVisible(false);
            mf.setVisible(true);
            mf.displayUserData(); // replace with proper arguments (TODO change the parameter)
        }else{ // no user found in the database
                JOptionPane.showMessageDialog(new JFrame("invalid username"), "Username or password is invalid :(");
        }
    }
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea logErrorField;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton newUserButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
