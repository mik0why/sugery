/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


//TODO what if instead of adding & updating, first we would have an operation to see whether
// there is a particular entry in the SQL table, and then operate on it?
// but if modifying two values at once it would be hard to figure out what's being updated
/**
 *
 * @author mikowhy
 */
//TODO fix the update thing
public class scoreScreen extends javax.swing.JFrame  { //
    private userUtils dataTable = new userUtils(); 
    private dateChanger dateChanger = new dateChanger(this.user, null);
    /**
     * Creates new form scoreScreen
     */
    
    private User user;
    private boolean updateValue = false; 
    private String date;
    boolean focusTraversalKeysEnabled = false;

    @Override
    public void setFocusTraversalKeysEnabled(boolean focusTraversalKeysEnabled) {
        super.setFocusTraversalKeysEnabled(focusTraversalKeysEnabled); //To change body of generated methods, choose Tools | Templates.
    }
    
    public scoreScreen(User usr, boolean updateValue, String dateToUpdate) { //TODO remove updateValue
        initComponents();
        this.user = usr;
        this.updateValue = updateValue;
        this.date= dateToUpdate; 
        
        
    }

    private void keyPressed(java.awt.event.KeyEvent e){
        if (e.getKeyCode() == 27){
            this.setVisible(false);
        }
    }
    
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
        scoreSet = new javax.swing.JButton();
        scoreField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        dateField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

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

        dateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFieldActionPerformed(evt);
            }
        });

        jButton2.setText("Custom Date");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scoreSet)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scoreSetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scoreSetMouseClicked
        //TODO: delete
    }//GEN-LAST:event_scoreSetMouseClicked

    
    private void scoreFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreFieldKeyPressed
            
        //this is for enter and not working?
        /*
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){ //this should be made a function bc used twice
                try {
                    addScore();
                    
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        */
    }//GEN-LAST:event_scoreFieldKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

            if(evt.getKeyCode() == evt.VK_ESCAPE) {
                this.setVisible(false);
            }
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
                addScore(); //TODO make a change to the date
                JOptionPane.showMessageDialog(new JFrame("Score Added"), "Score Added");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(scoreScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        
        
        
    }//GEN-LAST:event_scoreSetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dateChanger.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateFieldActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField scoreField;
    private javax.swing.JButton scoreSet;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextArea textAr;
    // End of variables declaration//GEN-END:variables


    // need to register the day of the input

    void addScore() throws ClassNotFoundException, SQLException, ParseException{
        /* 
        TODO check if the score in the valid range
        TODO get the last entry and check if not the same
        TODO ADD option to custom the date
        TODO check if score not already in the HT (retrieve the lastElement)
        */
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(this.updateValue){
            this.user.modifyScoreValue(this.date, 
                        Integer.parseInt(scoreField.getText().replaceAll("\\s+","")));
        }else{
            Date curr_date = new Date();
            this.user.addScore(dateFormat.format(curr_date).toString(), 
                    Integer.parseInt(scoreField.getText().replaceAll("\\s+","")));
        }
 
        
    }


}
