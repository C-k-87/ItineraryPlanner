/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ruhcs2123.todolist;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jack
 */
public class Home extends javax.swing.JFrame {

    DefaultTableModel model;
    public double currentTotal;
    
    
    public Home() {
        initComponents();
        
        currentTotal = 0;
        model = (DefaultTableModel) tableTaskTable.getModel();
        
        calculateBudget();
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
        panelAddTask = new javax.swing.JPanel();
        labelTaskTitle = new javax.swing.JLabel();
        fieldTaskTitle = new javax.swing.JTextField();
        labelTaskDescription = new javax.swing.JLabel();
        fieldTaskDescription = new javax.swing.JTextField();
        labelTaskBudget = new javax.swing.JLabel();
        fieldTaskBudget = new javax.swing.JTextField();
        btnTaskAdd = new javax.swing.JButton();
        btnTaskClear = new javax.swing.JButton();
        txtTaskStatus = new javax.swing.JLabel();
        txtBudget = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTaskTable = new javax.swing.JTable();
        btnTaskDone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        panelAddTask.setBackground(new java.awt.Color(171, 171, 171));
        panelAddTask.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insert Task", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(1, 1, 1))); // NOI18N
        panelAddTask.setOpaque(false);

        labelTaskTitle.setForeground(new java.awt.Color(1, 1, 1));
        labelTaskTitle.setText("Title");

        labelTaskDescription.setForeground(new java.awt.Color(1, 1, 1));
        labelTaskDescription.setText("Description");

        labelTaskBudget.setForeground(new java.awt.Color(1, 1, 1));
        labelTaskBudget.setText("Budget");

        btnTaskAdd.setText("Add");
        btnTaskAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskAddActionPerformed(evt);
            }
        });

        btnTaskClear.setText("Clear");
        btnTaskClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskClearActionPerformed(evt);
            }
        });

        txtTaskStatus.setForeground(new java.awt.Color(1, 1, 1));
        txtTaskStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTaskStatus.setText("Enter task");

        txtBudget.setForeground(new java.awt.Color(1, 1, 1));
        txtBudget.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtBudget.setText("Total : ");

        javax.swing.GroupLayout panelAddTaskLayout = new javax.swing.GroupLayout(panelAddTask);
        panelAddTask.setLayout(panelAddTaskLayout);
        panelAddTaskLayout.setHorizontalGroup(
            panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddTaskLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(txtTaskStatus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAddTaskLayout.createSequentialGroup()
                .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddTaskLayout.createSequentialGroup()
                        .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddTaskLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(labelTaskTitle))
                            .addGroup(panelAddTaskLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(labelTaskDescription))
                            .addGroup(panelAddTaskLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnTaskAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnTaskClear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelAddTaskLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(labelTaskBudget)))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(panelAddTaskLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldTaskBudget, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldTaskDescription, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldTaskTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddTaskLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelAddTaskLayout.setVerticalGroup(
            panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddTaskLayout.createSequentialGroup()
                .addComponent(txtBudget)
                .addGap(5, 5, 5)
                .addComponent(labelTaskTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldTaskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTaskDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldTaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTaskBudget)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldTaskBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaskAdd)
                    .addComponent(btnTaskClear))
                .addGap(18, 18, 18)
                .addComponent(txtTaskStatus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableTaskTable.setBackground(new java.awt.Color(145, 145, 145));
        tableTaskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Description", "Budget"
            }
        ));
        jScrollPane1.setViewportView(tableTaskTable);

        btnTaskDone.setText("Mark Done");
        btnTaskDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAddTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addComponent(btnTaskDone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAddTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTaskDone)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearFields() {
        fieldTaskBudget.setText("");
        fieldTaskDescription.setText("");
        fieldTaskTitle.setText("");
    }
    
    private void removeTask() {
        if (tableTaskTable.getSelectedRowCount() == 1) {
            model.removeRow(tableTaskTable.getSelectedRow());
        }
    }
    
    private void calculateBudget() {
        double total = 0;
        for (int i = 0 ; i < model.getRowCount() ; i++) {
            total += Double.parseDouble((String) model.getValueAt(i, 2));
        }
        
        currentTotal = total;
        txtBudget.setText("Budget: "+currentTotal);
    }
    
    private void btnTaskAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskAddActionPerformed
        try {
            Double.parseDouble(fieldTaskBudget.getText());
            model.insertRow(model.getRowCount(), new Object[]{fieldTaskTitle.getText(),fieldTaskDescription.getText(),fieldTaskBudget.getText(),false});
            clearFields();
            txtTaskStatus.setText("Added");
            calculateBudget();
        }catch (NumberFormatException e) {
            txtTaskStatus.setText("Invalid budget");
        }
    }//GEN-LAST:event_btnTaskAddActionPerformed

    private void btnTaskClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskClearActionPerformed
        clearFields();
    }//GEN-LAST:event_btnTaskClearActionPerformed

    private void btnTaskDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskDoneActionPerformed
        removeTask();
    }//GEN-LAST:event_btnTaskDoneActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaskAdd;
    private javax.swing.JButton btnTaskClear;
    private javax.swing.JButton btnTaskDone;
    public javax.swing.JTextField fieldTaskBudget;
    public javax.swing.JTextField fieldTaskDescription;
    public javax.swing.JTextField fieldTaskTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTaskBudget;
    private javax.swing.JLabel labelTaskDescription;
    private javax.swing.JLabel labelTaskTitle;
    private javax.swing.JPanel panelAddTask;
    public javax.swing.JTable tableTaskTable;
    public javax.swing.JLabel txtBudget;
    public javax.swing.JLabel txtTaskStatus;
    // End of variables declaration//GEN-END:variables
}
