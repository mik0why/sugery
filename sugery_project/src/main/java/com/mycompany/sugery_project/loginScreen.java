/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

 /*
 * @author mikowhy
 */
public class loginScreen extends javax.swing.JFrame {
    //TODO needs a fix:  pressing the "Enter" button
    /**
     * Creates new form loginScreen
     */
    mainFrame mf; // TODO needs to be fixed
    configJFrame jf = new configJFrame(); 
    ArrayList<User>al = new ArrayList<User>(); // temporal?


    boolean focusTraversalKeysEnabled = false;
    @Override
    public void setFocusTraversalKeysEnabled(boolean focusTraversalKeysEnabled) {
        super.setFocusTraversalKeysEnabled(focusTraversalKeysEnabled); //To change body of generated methods, choose Tools | Templates.
    }
    //TODO should have a database field
    public loginScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        usernameArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        passwordArea = new javax.swing.JTextArea();
        userField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        newUserButton = new javax.swing.JButton();
        passField = new javax.swing.JPasswordField();
        jScrollPane3 = new javax.swing.JScrollPane();
        logErrorField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameArea.setBackground(new java.awt.Color(238, 238, 238));
        usernameArea.setColumns(10);
        usernameArea.setRows(1);
        usernameArea.setText("Username:");
        usernameArea.setAutoscrolls(false);
        usernameArea.setFocusable(false);
        usernameArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameAreaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(usernameArea);

        passwordArea.setBackground(new java.awt.Color(238, 238, 238));
        passwordArea.setColumns(10);
        passwordArea.setRows(1);
        passwordArea.setText("Password:");
        passwordArea.setAutoscrolls(false);
        passwordArea.setFocusable(false);
        passwordArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordAreaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(passwordArea);

        userField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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

        jButton1.setText("forgot password?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        loginButton.setText("login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButtonKeyPressed(evt);
            }
        });

        newUserButton.setText("new user");
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

        logErrorField.setEditable(false);
        logErrorField.setBackground(new java.awt.Color(238, 238, 238));
        logErrorField.setColumns(20);
        logErrorField.setRows(1);
        logErrorField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logErrorFieldKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(logErrorField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(passField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(loginButton)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(loginButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(newUserButton))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        //should rearrange this just to be loginAttempt(); 
        
        String username = userField.getText();
        char[] password = passField.getPassword();
        if(username.isEmpty() || password.length == 0){
            logErrorField.setText("no login / password entered!"); // can extend to show which one
        }else{
            loginAttempt(username, password);
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void newUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserButtonMouseClicked
        // TODO add your handling code here:
        jf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_newUserButtonMouseClicked

    private void usernameAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameAreaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_TAB){
           userField.requestFocus();
        }
    }//GEN-LAST:event_usernameAreaKeyPressed

    private void passwordAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordAreaKeyPressed
           if(evt.getKeyCode()==KeyEvent.VK_TAB){
           passField.requestFocus();
        }
    }//GEN-LAST:event_passwordAreaKeyPressed

    private void logErrorFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logErrorFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==9){
            loginButton.requestFocus();
        }
    }//GEN-LAST:event_logErrorFieldKeyPressed

    private void userFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==9){
            passField.requestFocus();
        }else if(evt.getKeyCode()==13){
            passField.requestFocusInWindow();
        }
    }//GEN-LAST:event_userFieldKeyPressed

    private void loginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginButtonKeyPressed
        // TODO rearrange bc redundant
           String username = userField.getText();
        char[] password = passField.getPassword();
        if(username.isEmpty() || password.length == 0){
            logErrorField.setText("no login / password entered!"); // can extend to show which one
        }else{
            loginAttempt(username, password);
        }     
    }//GEN-LAST:event_loginButtonKeyPressed

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
    private void loginAttempt(String login, char[] password){
        boolean usrFound = false; // should be modifed to false
       // Scanner x; 
        String currUs; 
        String currPass;
        // condition to check if login and password match entries in db
        // validate - check if reasonable, verify - check if accurate
        // convert password to string
        String pass = String.copyValueOf(password);
        //check if the doc with passwords exist, if not - create it
        File passArch = new File("data.txt");
        if(!passArch.exists()){ // the file doesn't exist - first login
            System.out.println("the file doesn't exist");
            try{
                if(passArch.createNewFile()){
                    System.out.println("made it");
                }else{
                    System.out.println("not done");
                }
            }catch(IOException e){
                System.out.println("An error occured");
            }
        }else{ // the actual verification
            System.out.println("the file exists");
            
            try{
                Scanner x = new Scanner(passArch);
                x.useDelimiter("[,\n]"); // hmm idk if we gonna use this one
                while(x.hasNext() && !usrFound){
                    System.out.println("scanning...");
                    currUs = x.next();
                    currPass = x.next();
                    if(currUs.trim().equals(login) && currPass.trim().equals(pass)){
                        usrFound = true; 
                    }
                }
                if(!usrFound){
                    // incorrect password
                    logErrorField.setText("incorrect password :(");
                }else{
                    logErrorField.setText("correct!");
                    usrFound = true; 
                }
            }catch(Exception e){
                   System.out.println("Exception : " + e);
            }
        }
        
        
        if(usrFound){
            al.add(new User(login, 22, 100)); // get rid of
            mf = new mainFrame(al.get(0)); //get user from db (TODO change which one)
            mf.setVisible(true);
            mf.displayUserData(al, 0); // replace with proper arguments (TODO change the parameter)
            this.setVisible(false);
        }else{ // if they don't
            
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea logErrorField;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton newUserButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTextArea passwordArea;
    private javax.swing.JTextField userField;
    private javax.swing.JTextArea usernameArea;
    // End of variables declaration//GEN-END:variables
}
