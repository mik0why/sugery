/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

//TODO set this as the main one?
//TODO add login options

import java.util.ArrayList;

//how to invoke the other screen once all data gathered?

/**
 *
 * @author mikowhy
 */
public class configJFrame extends javax.swing.JFrame {

    String username = "";
    int age = -1;
    int goal = -1;
    ArrayList<User> usArr = new ArrayList<User>();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        nameArea = new javax.swing.JTextArea();
        goalField = new javax.swing.JScrollPane();
        goalArea = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        ageArea = new javax.swing.JTextArea();
        entryText = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();

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

        jScrollPane3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        nameArea.setColumns(10);
        nameArea.setRows(1);
        nameArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameAreaKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(nameArea);

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
        jTextField7.setText("Goal");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(entryText, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goalField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(createUsrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(entryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createUsrButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(goalField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        createUsrButton.getAccessibleContext().setAccessibleName("apBut1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tryCreatingUser(){
        try{
            username = nameArea.getText().replaceAll("\\s+", "");
            age = Integer.parseInt(ageArea.getText().replaceAll("\\s+",""));
            goal = Integer.parseInt(goalArea.getText().replaceAll("\\s+",""));        
            userCreate();
            mf = new mainFrame(); // TODO get to the other screen
            mf.setVisible(true);
            mf.displayUserData(usArr, 0);

        }catch(Exception e){
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

    private void nameAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameAreaKeyPressed
        // TODO add your handling code here:
        
        //TODO create one method once this is working (field.reqfocus + this.setText)
        if (evt.getKeyCode()==9){
            ageArea.requestFocus();
        }
        // also should do sth so it doesn't actually move in the field by TAB
    }//GEN-LAST:event_nameAreaKeyPressed

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

    
    void userCreate(){ //usr, age, goal are global
        if(!username.equals("") && age > -1 && goal > -1){
            // this check should be more precise
            //e.g. define the range for age
            usArr.add(new User(username, age, goal));   
        }   
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
    private javax.swing.JTextArea goalArea;
    private javax.swing.JScrollPane goalField;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextArea nameArea;
    // End of variables declaration//GEN-END:variables
}
