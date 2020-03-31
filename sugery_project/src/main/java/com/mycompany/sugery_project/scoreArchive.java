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



/**
 *
 * @author mikowhy
 */
public class scoreArchive extends javax.swing.JFrame {

    /**
     * Creates new form scoreArchive
     */
    User user;
//    ArrayList<Score> scores; 
    /**
     *
     * @param usr
     * @param model
     */
    public scoreArchive(User usr) {
        this.user = usr; 
        initComponents();
    }

          
    public void displayScores() throws ClassNotFoundException, SQLException, ParseException{
        //TODO make private
        //TODO display buttons so the user can modify scores
        //TODO score summary
        
        //TODO: remake Scores into a hashTable?
        // find a solution to not enter the same entry twice

        

                
        DefaultTableModel tablemodel = (DefaultTableModel) jTable1.getModel();
        tablemodel.setRowCount(0); // no initial rows
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(180);
        
        DateFormat dateFormat = new SimpleDateFormat("yyy-mm-dd HH:mm:ss");
        Class.forName("com.mysql.cj.jdbc.Driver"); // is it necessary?
        String url = "jdbc:mysql://localhost/LOG?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
        Connection conn = DriverManager.getConnection(url,"root","Pass123!!!"); 
        Statement st = conn.createStatement();
        String sql = "SELECT * FROM Scores WHERE `username` = " + "'" + this.user.getName() + "' ORDER BY date ASC;"; // DESC LIMIT  1
        ResultSet sq =  st.executeQuery(sql);
        while(sq.next()){ //TODO: check if entry already in the table
            Object[] score = new Object[]{sq.getString("date"), sq.getString("score")}; 
            // search through the table to see if the object is already there
            tablemodel.insertRow(0, new Object[]{sq.getString("date"), sq.getString("score")});
            System.out.println("date and score : " + sq.getInt("score") + ", " + dateFormat.parse(sq.getString("date")));
            //this.user.getUsArr().add(new Score(sq.getInt("score"), dateFormat.parse(sq.getString("date"))));
        }
        displayAnalysis(); 
        System.out.println("Let's see the first score : " +this.user.getUsArr().get(0).date);
        System.out.println("also, let's see array's size: " + this.user.getUsArr().size());
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
        jTable1.setFocusable(false);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(remSc, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(remSc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    //TODO how to delete event ?
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
           this.setVisible(false);

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void remScActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remScActionPerformed
        if(!jTable1.getSelectionModel().isSelectionEmpty()){
            try {
                dbRemove(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()).toString(), jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1).toString());
                ((DefaultTableModel)jTable1.getModel()).removeRow(jTable1.getSelectedRow());
                //TODO: remove from usArr; selection problem
                // use this: jTable1.getSelectedRow();
                // need to do the same with adding to the array
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(scoreArchive.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(scoreArchive.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            //commArea.setText("Select a row first, then click 'Delete'");
            JOptionPane.showMessageDialog(new JFrame("No Selection"), "Select a row first, then click 'Delete'");
        }
    }//GEN-LAST:event_remScActionPerformed

    /**
     * @param args the command line arguments
     */

      private void dbRemove(String date, String score) throws ClassNotFoundException, SQLException{
        System.out.println("entry to remove-2: " + date + " : " + score);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Class.forName("com.mysql.cj.jdbc.Driver"); // is it necessary?
        String url = "jdbc:mysql://localhost/LOG?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
        Connection conn = DriverManager.getConnection(url,"root","Pass123!!!"); 
        Statement st = conn.createStatement();
        String sql = "DELETE FROM Scores WHERE `username` = '" + this.user.getName()
                + "' AND `score` = " + score + " AND `date` = '" + date  +  "';";
        // see this: https://stackoverflow.com/questions/10649782/java-cannot-format-given-object-as-a-date
        System.out.println("sql : " + sql);
        st.executeUpdate(sql);
        //summUpdate(scores); // stuff like: morning scores 
    }

    private void displayAnalysis(){
        //TODO sc will be empty with each execution - needs to be obtained from the server
        
        // so then just with each operation call displayAnalysis I guess?
        // can do stuff like morningCount, eveningCount etc
        getAllScores(); // 
        int sum = 0;
        int counter = 0; 
        
        System.out.println("array size before: " + this.user.getUsArr().size() + "\n");
        for (Score s: this.user.getUsArr()){
            sum+=s.getScoreValue();
            counter++;
        }
        commArea.append("sum: " + sum + "\n");
        commArea.append("There are " + counter + " scores registered. \n");
        commArea.append("Average Value: " + sum / counter);
        
    }
    
    private void getAllScores(){
        ArrayList<Score> ans; 
        String username;
        int score;
        Date dt; 
            try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // is it necessary?
            String url = "jdbc:mysql://localhost/LOG?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
            Connection conn = DriverManager.getConnection(url,"root","Pass123!!!"); 
            Statement st = conn.createStatement();
            String sql = "SELECT username, score, date FROM Scores";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){ // TODO shouldn't it be select from where?
                username = rs.getString("username");
                score = rs.getInt("score");
                dt = rs.getDate("date");
                if(username.equals(this.user.getName())){// && us_pass.equals(String.copyValueOf(password))){
                    //TODO should check if the score isn't already in the usArr
                    Score sco = new Score(score, dt); // hmm not working, 
                    //make a HT and check this way
                    //key: date, value: score
                    if(!this.user.getUsArr().contains(sco)){ //TODO make a one-liner
                        System.out.append("adding");
                        this.user.getUsArr().add(sco);
                        }
                    }
                }
            }catch(Exception e){
                System.out.println("Exception: " + e);
        }
        
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea commArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton remSc;
    // End of variables declaration//GEN-END:variables


}
