/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TableColumn;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.lang.Object;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Observable;
import java.util.Observer;



/**
 *
 * @author mikowhy
 */
public class scoreArchive extends javax.swing.JFrame {

    //TODO Event Deletion (the average should display the score after insertion right away
    // bc with deletion seems like it's already working
    /**
     * Creates new form scoreArchive
     */
    private User user;
    private entryTable dataTable = new entryTable();
    /**
     *
     * @param usr
     * @param model
     */
    public scoreArchive(User usr) {
        this.user = usr; 
        initComponents();
    }

     // @Override
    public boolean isCellEditable(int row, int column) {     
                return false;               
        };      
     
     
    void displayScores() throws ClassNotFoundException, SQLException, ParseException{
        //TODO make private
        //TODO display buttons so the user can modify scores
        //TODO score summary
        //TODO: remake Scores into a hashTable?
        // find a solution to not enter the same entry twice
        //  idea: look at the previous entry & if they're the same, ask if you're sure
        // q: how to quickly retrieve that entry - where from

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0); // no initial rows
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(180);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        String sql = "SELECT * FROM Scores WHERE `username` = " + "'" + 
                this.user.getName() + "' ORDER BY date ASC;"; // DESC LIMIT  1
        ResultSet sq =  dataTable.selectEntries(sql); // st.executeQuery(sql);
        while(sq.next()){ //TODO: check if entry already in the table
            tableModel.insertRow(0, new Object[]{sq.getString("date"), sq.getString("score")});
            System.out.println("date and score : " + sq.getInt("score") + ", " + dateFormat.parse(sq.getString("date")));
            //TODO why does this show the wrong date? 2 months ahead
            //this.user.getUsArr().add(new Score(sq.getInt("score"), dateFormat.parse(sq.getString("date"))));
        }
        getAllScores();
        updateScores(user.displayAnalysis("all")); // all scores
    }
    
    
    private void dbRemove(String date, String score) throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM Scores WHERE `username` = '" + this.user.getName()
                + "' AND `score` = " + score + " AND `date` = '" + date  +  "';";
        dataTable.addRemoveEntry(sql);
        this.user.getHM().remove(date);
    }

    
    public void updateScores(ArrayList<String> summary){
        commArea.setText(null);
        commArea.append(summary.get(0) + " scores registered. \n");
        commArea.append("Average Value: " + summary.get(1));
    }
    
    private void displayAnalysis() throws ParseException{
        //TODO btw this can be extended to show more than just week
        // for example month, year ... etc (or custom period)
        
        //parameter: Date earliest date (input_date)
        Date curr_date; 
        
        // Entry<String, Integer> set
        // range to which the values should be calculated - e.g. week or all
        
        
        //TODO sc will be empty with each execution - needs to be obtained from the server
        
        // so then just with each operation call displayAnalysis I guess?
        // can do stuff like morningCount, eveningCount etc
        getAllScores(); // TODO idt it will be useful anymore, but need to make sure (ins, del)
        int sum = 0;
        int counter = 0;         
        
        //TODO sth like this below; modify each call to include the cutoff date
        
        for(Entry<String, Integer> e : this.user.getHM().entrySet()){
            curr_date = new SimpleDateFormat("dd/MM/yyyy").parse(e.getKey().toString());  
            System.out.println(curr_date);
            
            sum+=e.getValue();
            counter++;
            
        }
        
        //this should be returned in an array?
        commArea.setText(null);
        commArea.append(counter + " scores registered. \n");
        commArea.append("Average Value: " + sum / counter);
        
    }
    
    private void getAllScores(){
        String username;
        int score;
        String dt; 
            try{
            String sql = "SELECT username, score, date FROM Scores";
            ResultSet rs = dataTable.selectEntries(sql); //st.executeQuery(sql);
            while(rs.next()){ // TODO shouldn't it be select from where?
                username = rs.getString("username");
                score = rs.getInt("score");
                dt = rs.getString("date"); // convert to a different format?  // below check : && us_pass.equals(String.copyValueOf(password))){
                if(username.equals(this.user.getName())){                    //TODO should check if the score isn't already in the usArr
                    if(!this.user.getHM().containsKey(dt)){ // checks the date
                        this.user.HM_Insert(dt, score);
                        }
                    }
                }
            }catch(Exception e){
                System.out.println("Exception: " + e);
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        remSc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        commArea = new javax.swing.JTextArea();
        addSc = new javax.swing.JButton();
        edSc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Close");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Score"
            }
        ));
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        remSc.setText("Remove Score");
        remSc.setToolTipText("");
        remSc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remScActionPerformed(evt);
            }
        });

        commArea.setEditable(false);
        commArea.setBackground(new java.awt.Color(238, 238, 238));
        commArea.setColumns(20);
        commArea.setRows(5);
        jScrollPane2.setViewportView(commArea);

        addSc.setText("Add Score");
        addSc.setToolTipText("");
        addSc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addScActionPerformed(evt);
            }
        });

        edSc.setText("Edit Score");
        edSc.setToolTipText("");
        edSc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edScActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(remSc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edSc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addSc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edSc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(remSc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
           this.setVisible(false);

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void remScActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remScActionPerformed
        //TODO what if there are no scores loaded?
        if(!jTable1.getSelectionModel().isSelectionEmpty()){
            try {
                dbRemove(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString(),  
                        jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1).toString());
                ((DefaultTableModel)jTable1.getModel()).removeRow(jTable1.getSelectedRow());
       
                updateScores(user.displayAnalysis("all"));
                // need to do the same with adding to the array
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(scoreArchive.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(scoreArchive.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(scoreArchive.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            //commArea.setText("Select a row first, then click 'Delete'");
            JOptionPane.showMessageDialog(new JFrame("No Selection"), "Select a row first, then click 'Delete'");
        }
    }//GEN-LAST:event_remScActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == 8){  // disable editing
            System.out.println("backspace");
        }else if (evt.getKeyCode() == 9){
            //TODO disable switching to next row
            remSc.requestFocus();
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void addScActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addScActionPerformed
        //TODO: the screen should also be updated when adding a score in this way
        scoreScreen sc = new scoreScreen(this.user, 0); // idk if that's the right val
        sc.setVisible(true);
    }//GEN-LAST:event_addScActionPerformed

    private void edScActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edScActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edScActionPerformed

    
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSc;
    private javax.swing.JTextArea commArea;
    private javax.swing.JButton edSc;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton remSc;
    // End of variables declaration//GEN-END:variables



}
