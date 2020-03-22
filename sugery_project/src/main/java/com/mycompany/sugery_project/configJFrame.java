/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

//TODO set this as the main one?
//TODO add login options

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
import javax.swing.JPasswordField;

//how to invoke the other screen once all data gathered?

/**
 *
 * @author mikowhy
 */
public class configJFrame extends javax.swing.JFrame {
//TODO Description of Methods
    //TODO change these to other values? e.g. Integer.MIN_VALUE (?)
    BufferedWriter writer; 
    String username = "";
    int age = -1;
    int goal = -1;
    ArrayList<User> usArr = new ArrayList<User>(); // idt it should be new
    mainFrame mf ;
    
    public configJFrame() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        errorArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        goalField.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        goalField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                goalFieldKeyPressed(evt);
            }
        });

        goalArea.setColumns(10);
        goalArea.setRows(1);
        goalArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                goalAreaKeyPressed(evt);
            }
        });
        goalField.setViewportView(goalArea);

        jScrollPane6.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        ageArea.setColumns(10);
        ageArea.setRows(1);
        ageArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageAreaKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(ageArea);

        entryText.setEditable(false);
        entryText.setBackground(new java.awt.Color(238, 238, 238));
        entryText.setText("First, tell us about yourself.");
        entryText.setBorder(null);
        entryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryTextActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(238, 238, 238));
        jTextField5.setText("Age");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(238, 238, 238));
        jTextField6.setText("Name");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(238, 238, 238));
        jTextField7.setText("Password");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jScrollPane4.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        nameArea1.setColumns(10);
        nameArea1.setRows(1);
        nameArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameArea1KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(nameArea1);

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(238, 238, 238));
        jTextField8.setText("Goal");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        passField.setToolTipText("");
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });

        errorArea.setBackground(new java.awt.Color(238, 238, 238));
        errorArea.setColumns(20);
        errorArea.setRows(5);
        jScrollPane1.setViewportView(errorArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(entryText, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(goalField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createUsrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(entryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(createUsrButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goalField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        createUsrButton.getAccessibleContext().setAccessibleName("apBut1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tryCreatingUser(){
        try{
            //TODO text area displays out of bounds
            username = nameArea1.getText().replaceAll("\\s+", "");
            age = Integer.parseInt(ageArea.getText().replaceAll("\\s+",""));
            goal = Integer.parseInt(goalArea.getText().replaceAll("\\s+",""));        
            userCreate();
            mf = new mainFrame(usArr.get(usArr.size()-1)); // or size -1?
            mf.setVisible(true);
            this.setVisible(false);
            mf.displayUserData(usArr, usArr.size()-1); // the most recent one

        }catch(Exception e){ // TODO more detailed exceptions
            entryText.setText(null);
            entryText.setText("missing info!" + e);
        }
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
                    createUsrButton.requestFocus();
        }
    }//GEN-LAST:event_goalAreaKeyPressed

    private void nameArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameArea1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameArea1KeyPressed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    
    void userCreate(){ //usr, age, goal are global (?)
        //adding new entries to two tables: LoginData & UserData
        //TODO: re-do tables(id not necessary?)
        if(validEntriesCheck()){
            try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // may not be necessary?
            String url = "jdbc:mysql://localhost/LOG?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            Connection conn = DriverManager.getConnection(url,"root","Pass123!!!"); 
                if(!checkEntries(conn, username)){ // check if the username already exists
                    usCr(conn, username, passField, age, goal); // add user to login & data tables
                }else{
                    errorArea.append("The username already exists!");
                }
            }catch(Exception e){
                System.out.println("Exception: " + e);
            }
        }  
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
                    //TODO: this check should be more precise (e.g. define the range for age)
        boolean retVal = (!username.equals("") && age > -1 && goal > -1 && passField.getPassword().length> 0) 
                ?  true :  false; 
        if(retVal) return true;
        else{
            // check which entry is not correct
            // output in the form
        }
        return false; 
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
    private javax.swing.JTextArea errorArea;
    private javax.swing.JTextArea goalArea;
    private javax.swing.JScrollPane goalField;
    private javax.swing.JScrollPane jScrollPane1;
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
