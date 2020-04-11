/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

//TODO set this as the main one?
//TODO add login options

import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

//how to invoke the other screen once all data gathered?

/**
 *
 * @author mikowhy
 */



public class configJFrame extends javax.swing.JFrame {
//TODO Description of Methods
    //TODO change these to other values? e.g. Integer.MIN_VALUE (?)

private boolean nameOk = false;
private boolean ageOk = false;
private boolean goalOk = false; 
private boolean passOk = false; 
private Hashtable<String, Boolean> tests = new Hashtable<String, Boolean>();
//private List<boolean> checks = new ArrayList<boolean>();
    
    BufferedWriter writer; 
    String username = "";
    private int age = -1;
    private int goal = -1;
    private ArrayList<User> usArr = new ArrayList<User>(); // idt it should be new
    mainFrame mf ;
    
    public configJFrame() {
        initComponents();
        entryText.setBackground(null);
//        Dimension dx = new Dimension(780, 500));
        
  //      this.setSize(new Dimension(780, 500));
        nameArea1.requestFocus();
        tests.put("nameOk", nameOk);
        tests.put("ageOk", ageOk);
        tests.put("goalOk", goalOk);
        tests.put("passOk", passOk);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        createUsrButton = new javax.swing.JButton();
        goalField = new javax.swing.JScrollPane();
        goalArea = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        ageArea = new javax.swing.JTextArea();
        entryText = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        nameArea1 = new javax.swing.JTextArea();
        jTextField8 = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        goBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        createUsrButton.setBackground(new java.awt.Color(0, 0, 0));
        createUsrButton.setForeground(new java.awt.Color(255, 255, 255));
        createUsrButton.setText("create a new user");
        createUsrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUsrButtonActionPerformed(evt);
            }
        });
        createUsrButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                createUsrButtonKeyPressed(evt);
            }
        });
        getContentPane().add(createUsrButton);
        createUsrButton.setBounds(120, 330, 530, 50);
        createUsrButton.getAccessibleContext().setAccessibleName("apBut1");

        goalField.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        goalField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                goalFieldKeyPressed(evt);
            }
        });

        goalArea.setBackground(new java.awt.Color(0, 0, 0));
        goalArea.setColumns(10);
        goalArea.setForeground(new java.awt.Color(255, 255, 255));
        goalArea.setRows(1);
        goalArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                goalAreaKeyPressed(evt);
            }
        });
        goalField.setViewportView(goalArea);

        getContentPane().add(goalField);
        goalField.setBounds(400, 220, 135, 36);

        jScrollPane6.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        ageArea.setBackground(new java.awt.Color(0, 0, 0));
        ageArea.setColumns(10);
        ageArea.setForeground(new java.awt.Color(255, 255, 255));
        ageArea.setRows(1);
        ageArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageAreaKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(ageArea);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(200, 220, 135, 36);

        entryText.setBackground(new java.awt.Color(51, 51, 51));
        entryText.setFont(new java.awt.Font("Mukta Mahee", 2, 36)); // NOI18N
        entryText.setText("    But first, introduce yourself.");
        entryText.setBorder(null);
        entryText.setFocusable(false);
        entryText.setOpaque(false);
        entryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryTextActionPerformed(evt);
            }
        });
        getContentPane().add(entryText);
        entryText.setBounds(140, 30, 480, 90);

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("Age");
        jTextField5.setFocusable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(240, 270, 46, 24);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(0, 0, 0));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("Name");
        jTextField6.setFocusable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(60, 270, 50, 24);

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(0, 0, 0));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("Password");
        jTextField7.setFocusable(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(620, 270, 86, 24);

        jScrollPane4.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        nameArea1.setBackground(new java.awt.Color(0, 0, 0));
        nameArea1.setColumns(10);
        nameArea1.setForeground(new java.awt.Color(255, 255, 255));
        nameArea1.setRows(1);
        nameArea1.setBorder(null);
        nameArea1.setFocusTraversalPolicyProvider(true);
        nameArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameArea1KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(nameArea1);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(20, 220, 135, 36);

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(0, 0, 0));
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setText("Goal");
        jTextField8.setFocusable(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(440, 270, 46, 24);

        passField.setBackground(new java.awt.Color(0, 0, 0));
        passField.setForeground(new java.awt.Color(255, 255, 255));
        passField.setToolTipText("");
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passFieldKeyPressed(evt);
            }
        });
        getContentPane().add(passField);
        passField.setBounds(590, 220, 135, 40);

        goBack.setBackground(new java.awt.Color(0, 0, 0));
        goBack.setForeground(new java.awt.Color(255, 255, 255));
        goBack.setText("back to login");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });
        getContentPane().add(goBack);
        goBack.setBounds(570, 420, 150, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/mikowhy/Documents/Informatyka/Side Projects/Java/Sugery/sugery/sugery_project/src/main/resources/config.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tryCreatingUser(){
                    //TODO text area displays out of bounds
        try{
            //if(userCreate()){ // successful creation (or just without try?)
            userCreate();
            username = nameArea1.getText().replaceAll("\\s+", "");
            age = Integer.parseInt(ageArea.getText().replaceAll("\\s+",""));
            goal = Integer.parseInt(goalArea.getText().replaceAll("\\s+",""));        
                mf = new mainFrame(new User(username, age, goal)); // TODO should there be a new user statement?
                mf.setVisible(true);
                this.setVisible(false);
                mf.displayUserData(usArr, usArr.size()-1); // the most recent one
            }catch(Exception e){
                  //throw an exception here
                  // check the HT
                 System.out.println(tests.entrySet());
                 for (Entry ent : tests.entrySet()){
                     System.out.println("entry: " + ent);
                     System.out.println("value: " + ent.getValue());
                      if(!(Boolean)ent.getValue()){ // == false){
                        JOptionPane.showMessageDialog(new JFrame("Problem"), ent.getKey() 
                        + "incorrectly specified");
                        }
             
                    }
    } /*catch (ClassNotFoundException ex) {
        Logger.getLogger(configJFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(configJFrame.class.getName()).log(Level.SEVERE, null, ex);
    } */
    
    }
    private void createUsrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUsrButtonActionPerformed
            tryCreatingUser(); // not entirely sure this is correct

    }//GEN-LAST:event_createUsrButtonActionPerformed

    private void entryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryTextActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void ageAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageAreaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==9){
            goalArea.requestFocus();
        }
        
        //if(evt.getKeyChar()== evt.VK_)
        //TODO: for shift + tab
    }//GEN-LAST:event_ageAreaKeyPressed

    private void goalFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_goalFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_goalFieldKeyPressed

    private void createUsrButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_createUsrButtonKeyPressed
        // TODO add your handling code here:
        if (this.hasFocus() && evt.getKeyCode()==13){
                tryCreatingUser(); 
        }
    }//GEN-LAST:event_createUsrButtonKeyPressed

    private void goalAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_goalAreaKeyPressed
        // TODO add your handling code here:
                if (evt.getKeyCode()==9){
                    passField.requestFocus();
        }
    }//GEN-LAST:event_goalAreaKeyPressed

    private void nameArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameArea1KeyPressed
            if (evt.getKeyCode()==9){
                   ageArea.requestFocus();
            }

    }//GEN-LAST:event_nameArea1KeyPressed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
            //TODO move focus
        
    }//GEN-LAST:event_passFieldActionPerformed

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        loginScreen lf = new loginScreen();
        lf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_goBackActionPerformed

    private void passFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldKeyPressed

    
    boolean userCreate(){ //usr, age, goal are global (?)
        boolean success = false;
        //adding new entries to two tables: LoginData & UserData
        //TODO: re-do tables(id not necessary?)
        if(validEntriesCheck()){
            
            
            try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // may not be necessary?
            String url = "jdbc:mysql://localhost/LOG?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            Connection conn = DriverManager.getConnection(url,"root","Pass123!!!"); 
                if(!checkEntries(conn, username)){ // check if the username already exists
                    usCr(conn, username, passField, age, goal); // add user to login & data tables
                    success = true; 
                }else{
                    //TODO replace
                    //errorArea.append("The username already exists!");
                }
            }catch(Exception e){
                System.out.println("Exception: " + e);
            }
        }
        return success;
    }
    boolean checkEntries(Connection conn, String user) throws SQLException{
        //TODO Password Encryption?
        Statement st = conn.createStatement();
        String sql = "SELECT username, password FROM LoginData";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            if(rs.getString("username").equals(user)){
                return true; 
            }
        }
        return false; 
    }
    
    void usCr(Connection conn, String user, JPasswordField passField, int age, int goal) throws SQLException{
        Statement st = conn.createStatement();
        char[] password = passField.getPassword();
        String sql = "INSERT INTO `LoginData` (`username`, `password`) VALUES ('" + user
               + '\'' + "," + '\'' + String.valueOf(password) + "');" ;
        String sql_2 = "INSERT INTO `UserData` (`username`, `age`,`goal`) VALUES ('" + user
                + '\'' + ","  + age + ',' + goal + ");";
        try{
            st.executeUpdate(sql); 
            st.executeUpdate(sql_2); 
            System.out.println("Succesful insert"); 
        }catch(SQLException e){
            System.out.println("Insert unsucessful: " + e);
        }
    }
    
    boolean validEntriesCheck(){
       
        System.out.println("welcome to entries check");


    //TODO: this check should be more precise (e.g. define the range for age)
    
        username = nameArea1.getText().replaceAll("\\s+", "");
        age = Integer.parseInt(ageArea.getText().replaceAll("\\s+",""));
        goal = Integer.parseInt(goalArea.getText().replaceAll("\\s+","")); 
        
        
        //TODO why redefined here
        System.out.println(username + " " + age + " " + goal);
        if(!username.equals("")){
            nameOk = true;
            tests.replace("nameOk", nameOk); //, goalOk)
        }
        if(age > -1) ageOk= true;
        if(goal > 0) this.goalOk= true;
        if(passField.getPassword().length> 0) this.passOk = true;
                    
        
        return (nameOk && ageOk && goalOk && passOk);
        
    }
    
    
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
            java.util.logging.Logger.getLogger(configJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(configJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(configJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(configJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //TODO add the main screen?
                //TODO the login screen should be here?
                new configJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ageArea;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton createUsrButton;
    private javax.swing.JTextField entryText;
    private javax.swing.JButton goBack;
    private javax.swing.JTextArea goalArea;
    private javax.swing.JScrollPane goalField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextArea nameArea1;
    private javax.swing.JPasswordField passField;
    // End of variables declaration//GEN-END:variables
}
