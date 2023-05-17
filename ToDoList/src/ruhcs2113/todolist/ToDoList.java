/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ruhcs2113.todolist;

import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jack
 */
public class ToDoList extends javax.swing.JFrame {

    DefaultTableModel model;
    public int IDCounter;
    
    
    public ToDoList() {
        initComponents();
        model = (DefaultTableModel) tableTaskTable.getModel();
        
        Connect d = new Connect();
        ResultSet rs = d.initialize();
        
        try {
            while(rs.next()) {
                int id = rs.getInt("task_id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                double budget = rs.getDouble("budget");
                String category = rs.getString("category");
                model.insertRow(model.getRowCount(), new Object[]{id,title,description,budget,category});
            }
        } catch (SQLException ex) {
            System.err.println("Table entry failed. Clear and try again.");
        }
        
        IDCounter = ((int) tableTaskTable.getValueAt(model.getRowCount()-1, 0))+1;
        System.out.println("Initial ID Counter: "+IDCounter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContainer = new javax.swing.JPanel();
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
        labelTaskCategory = new javax.swing.JLabel();
        fieldTaskCategory = new javax.swing.JComboBox<>();
        panelTable = new javax.swing.JScrollPane();
        tableTaskTable = new javax.swing.JTable();
        btnTaskDone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContainer.setBackground(new java.awt.Color(254, 254, 254));

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

        labelTaskCategory.setForeground(new java.awt.Color(1, 1, 1));
        labelTaskCategory.setText("Category");

        fieldTaskCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Attraction", "Entertaintment", "Food", "Accommodation", "Transport" }));
        fieldTaskCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTaskCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddTaskLayout = new javax.swing.GroupLayout(panelAddTask);
        panelAddTask.setLayout(panelAddTaskLayout);
        panelAddTaskLayout.setHorizontalGroup(
            panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(26, 26, 26)
                                .addComponent(labelTaskBudget))
                            .addGroup(panelAddTaskLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddTaskLayout.createSequentialGroup()
                                        .addComponent(btnTaskAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(btnTaskClear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelAddTaskLayout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(txtTaskStatus)))))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(panelAddTaskLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldTaskCategory, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldTaskBudget, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldTaskDescription, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldTaskTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelAddTaskLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(labelTaskCategory)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelAddTaskLayout.setVerticalGroup(
            panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddTaskLayout.createSequentialGroup()
                .addGap(21, 21, 21)
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
                .addGap(18, 18, 18)
                .addComponent(labelTaskCategory)
                .addGap(18, 18, 18)
                .addComponent(fieldTaskCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaskAdd)
                    .addComponent(btnTaskClear))
                .addGap(18, 18, 18)
                .addComponent(txtTaskStatus)
                .addGap(22, 22, 22))
        );

        tableTaskTable.setBackground(new java.awt.Color(145, 145, 145));
        tableTaskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Description", "Budget", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panelTable.setViewportView(tableTaskTable);
        if (tableTaskTable.getColumnModel().getColumnCount() > 0) {
            tableTaskTable.getColumnModel().getColumn(0).setResizable(false);
        }

        btnTaskDone.setText("Mark Done");
        btnTaskDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContainerLayout = new javax.swing.GroupLayout(panelContainer);
        panelContainer.setLayout(panelContainerLayout);
        panelContainerLayout.setHorizontalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAddTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addComponent(btnTaskDone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelContainerLayout.setVerticalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAddTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelContainerLayout.createSequentialGroup()
                        .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTaskDone)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Connect d = new Connect();
            
            int removeID = (int) tableTaskTable.getValueAt(tableTaskTable.getSelectedRow(), 0);
            model.removeRow(tableTaskTable.getSelectedRow());
            
            txtTaskStatus.setText("Removed");
            
            d.removeTask(removeID);
        }
    }
    
    private void btnTaskAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskAddActionPerformed
        try {
            int id = IDCounter;
            String title = fieldTaskTitle.getText();
            String description = fieldTaskDescription.getText();
            String budget = fieldTaskBudget.getText();
            Object category = fieldTaskCategory.getSelectedItem();
            Connect d = new Connect();
            
            double budgetValue = Double.parseDouble(budget);
            
            model.insertRow(model.getRowCount(), new Object[]{id,title,description,budget,category});
            clearFields();
            
            txtTaskStatus.setText("Added");
            
            d.addTask(id ,title, description, budgetValue, (String)category);
            IDCounter++;
            
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

    private void fieldTaskCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTaskCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTaskCategoryActionPerformed

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
            java.util.logging.Logger.getLogger(ToDoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToDoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToDoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToDoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToDoList().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaskAdd;
    private javax.swing.JButton btnTaskClear;
    private javax.swing.JButton btnTaskDone;
    public javax.swing.JTextField fieldTaskBudget;
    public javax.swing.JComboBox<String> fieldTaskCategory;
    public javax.swing.JTextField fieldTaskDescription;
    public javax.swing.JTextField fieldTaskTitle;
    private javax.swing.JLabel labelTaskBudget;
    private javax.swing.JLabel labelTaskCategory;
    private javax.swing.JLabel labelTaskDescription;
    private javax.swing.JLabel labelTaskTitle;
    private javax.swing.JPanel panelAddTask;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JScrollPane panelTable;
    public javax.swing.JTable tableTaskTable;
    public javax.swing.JLabel txtTaskStatus;
    // End of variables declaration//GEN-END:variables
}
