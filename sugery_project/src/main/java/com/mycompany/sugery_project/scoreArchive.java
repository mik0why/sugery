/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sugery_project;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Observable;
import java.util.Observer;



/**
 *
 * @author mikowhy
 */
public class scoreArchive extends javax.swing.JFrame implements Observer{

    //TODO Event Deletion (the average should display the score after insertion right away
    // bc with deletion seems like it's already working
    /**
     * Creates new form scoreArchive
     */
    private User user;
    private userUtils dataTable = new userUtils();
    private scoreScreen scoreScreen; // TODO may have to be initialized
    /**
     *
     * @param usr
     * @param model
     */
    public scoreArchive(User usr) throws SQLException, ParseException {
        this.user = usr; 
        initComponents();
        this.user.addObserver(this);
        pullScores();
        updateScores(user.getScoreCount(), user.getAverage("all"));

    }

     // @Override
    public boolean isCellEditable(int row, int column) {     
                return false;               
        };      
     
    
    private void pullScores() throws SQLException, ParseException{ // TODO rename (fillTable()? )
        DefaultTableModel tableModel = (DefaultTableModel) scoreTable.getModel();      
        tableModel.setRowCount(0); // no initial rows
        scoreTable.getColumnModel().getColumn(0).setPreferredWidth(180);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        String sql = "SELECT * FROM Scores WHERE `username` = " + "'" + 
            user.getName() + "' ORDER BY date ASC;"; // DESC LIMIT  1
        ResultSet sq =  dataTable.selectEntries(sql); // st.executeQuery(sql);
        while(sq.next()){ //TODO why does this show the wrong date? 2 months ahead
            tableModel.insertRow(0, new Object[]{sq.getString("date"), sq.getString("score")});
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
        scoreTable = new javax.swing.JTable();
        removeScoreButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        commArea = new javax.swing.JTextArea();
        addSc = new javax.swing.JButton();
        edSc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

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

        scoreTable.setModel(new javax.swing.table.DefaultTableModel(
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
        scoreTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                scoreTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(scoreTable);

        removeScoreButton.setText("Remove Score");
        removeScoreButton.setToolTipText("");
        removeScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeScoreButtonActionPerformed(evt);
            }
        });

        commArea.setEditable(false);
        commArea.setBackground(new java.awt.Color(238, 238, 238));
        commArea.setColumns(20);
        commArea.setRows(5);
        commArea.setFocusable(false);
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
                            .addComponent(removeScoreButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(removeScoreButton)
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

    private void removeScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeScoreButtonActionPerformed
        //TODO what if there are no scores loaded?
        //TODO is there an exception here
        //TODO highlight next row after deletion
          // need to do the same with adding to the array - ??
        if(!scoreTable.getSelectionModel().isSelectionEmpty()){
            try {
                //int score = scoreTable.getModel().getValueAt(scoreTable.getSelectedRow(), 1));
                user.removeScore(scoreTable.getModel().getValueAt(scoreTable.getSelectedRow(), 0).toString(),  
                            Integer.parseInt(scoreTable.getModel().getValueAt(scoreTable.getSelectedRow(), 1).toString()));

                pullScores();              
                removeScoreButton.requestFocus(); 
            } catch (SQLException ex) {
                Logger.getLogger(scoreArchive.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(scoreArchive.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(new JFrame("No Selection"), "Select a row first, then click 'Delete'");
        }
    }//GEN-LAST:event_removeScoreButtonActionPerformed

    private void scoreTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scoreTableKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == 8){  // disable editing
            System.out.println("backspace");
        }else if (evt.getKeyCode() == 9){
            //TODO disable switching to next row (make one column not focusable)?
           scoreTable.changeSelection(scoreTable.getSelectionModel().getLeadSelectionIndex(),
                    0, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
            addSc.requestFocus();
        }
    }//GEN-LAST:event_scoreTableKeyPressed

    private void addScActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addScActionPerformed
        scoreScreen = new scoreScreen(user, false, null); // idk if that's the right val
        scoreScreen.setVisible(true);
    }//GEN-LAST:event_addScActionPerformed

    private void edScActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edScActionPerformed
        //TODO check if there is a score selected first
        new singleScoreDisplay(user, 
        scoreTable.getModel().getValueAt(scoreTable.getSelectedRow(), 0).toString(),  
        Integer.parseInt(scoreTable.getModel().getValueAt(scoreTable.getSelectedRow(), 1).
                toString())).setVisible(true);
    }//GEN-LAST:event_edScActionPerformed

    
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSc;
    private javax.swing.JTextArea commArea;
    private javax.swing.JButton edSc;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeScoreButton;
    private javax.swing.JTable scoreTable;
    // End of variables declaration//GEN-END:variables


    
    
    public void updateScores(int scoreCount, int average){
        commArea.setText(null);
        commArea.append(scoreCount + " scores registered. \n");
        commArea.append("Average Value: " + average);
    }
    
    
    @Override
    public void update(Observable o, Object arg){
           if(o == this.user){
                try {
                  //  updateScores(user.displayAnalysis("all"));  // TODO idk if necessary
                    pullScores();

                } catch (SQLException ex) {
                    Logger.getLogger(scoreArchive.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(scoreArchive.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
   
        }
    

}
