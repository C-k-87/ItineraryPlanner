/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ruhcs2113.budgetplanner;

import java.util.Locale;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jack
 */
public class BudgetPlanner extends javax.swing.JFrame {

    /**
     * Creates new form BudgetPlanner
     */
    public BudgetPlanner() {
        initComponents();
        
        Connect d = new Connect();
        ResultSet rs = d.initialize();
        
        double accomadation = 0;
        double food = 0;
        double attraction = 0;
        double transport = 0;
        double entertaintment = 0;
        double total = 0;
        
        try {
            while(rs.next()) {
                String category = rs.getString("category");
                
                switch(category) {
                    case "Attraction" :
                        attraction += rs.getDouble("budget");
                        break;
                    case "Accommodation":
                        accomadation += rs.getDouble("budget");
                        break;
                    case "Entertaintment":
                        entertaintment += rs.getDouble("budget");
                        break;
                    case "Food":
                        food += rs.getDouble("budget");
                        break;
                    case "Transport":
                        transport += rs.getDouble("budget");
                        break;
                }
            }
            total = accomadation + food + attraction + transport + entertaintment;
        } catch (SQLException ex) {
            System.err.println("Chart generation failed. Reload");
        }
        
        // CHART CREATION CODE -------------------------------------------------
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(percentOf(accomadation, total), "Series 1", "Accomodation");
        dataset.setValue(percentOf(food, total), "Series 1", "Food");
        dataset.setValue(percentOf(entertaintment, total), "Series 1", "Entertaintment");
        dataset.setValue(percentOf(transport, total), "Series 1", "Transport");
        dataset.setValue(percentOf(attraction, total), "Series 1", "Attraction");

        // Create chart
        JFreeChart chart = ChartFactory.createBarChart(
            "",
            "",
            "",
            dataset,
            PlotOrientation.VERTICAL,
            false,
            true,
            false
        );
        /*
        DefaultPieDataset dataset = new DefaultPieDataset( );
        dataset.setValue("Entertaintment" , 20.0);  
        dataset.setValue("Transport" , 20.0);   
        dataset.setValue("Accomodation" , 40.0);    
        dataset.setValue("Food" , 10.0);
        
        JFreeChart chart = ChartFactory.createPieChart(      
            "Mobile Sales",   // chart title 
            dataset,          // data    
            true,             // include legend   
            true, 
            false);
        */
        
        ChartPanel chrtPnl = new ChartPanel(chart);
        chrtPnl.setSize(500,500);
        chrtPnl.setVisible(true);
        chartPanel.add(chrtPnl);
        chartPanel.revalidate();
        chartPanel.repaint();
        
        // LABEL SETTER CODE ---------------------------------------------------
        lblAccomadationValue.setText(String.valueOf(accomadation));
        lblAttractionsValue.setText(String.valueOf(attraction));
        lblEntertaintmentValue.setText(String.valueOf(entertaintment));
        lblFoodValue.setText(String.valueOf(food));
        lblTransportValue.setText(String.valueOf(transport));
    }
    
    private double percentOf(double value, double total) {
        return value/total*100;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelMenuButton = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        lbFramelName = new javax.swing.JLabel();
        panelData = new javax.swing.JPanel();
        lblAttractions = new javax.swing.JLabel();
        lblFood = new javax.swing.JLabel();
        lblTransport = new javax.swing.JLabel();
        lblAccomadation = new javax.swing.JLabel();
        lblEntertaintment = new javax.swing.JLabel();
        lblAttractionsValue = new javax.swing.JLabel();
        lblFoodValue = new javax.swing.JLabel();
        lblTransportValue = new javax.swing.JLabel();
        lblAccomadationValue = new javax.swing.JLabel();
        lblEntertaintmentValue = new javax.swing.JLabel();
        chartPanel = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBackground(new java.awt.Color(222, 222, 222));

        panelMenuButton.setBackground(new java.awt.Color(222, 222, 222));

        btnMenu.setText("Main Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lbFramelName.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        lbFramelName.setForeground(new java.awt.Color(1, 1, 1));
        lbFramelName.setText("BUDGET PLANNER");

        javax.swing.GroupLayout panelMenuButtonLayout = new javax.swing.GroupLayout(panelMenuButton);
        panelMenuButton.setLayout(panelMenuButtonLayout);
        panelMenuButtonLayout.setHorizontalGroup(
            panelMenuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFramelName)
                .addContainerGap())
        );
        panelMenuButtonLayout.setVerticalGroup(
            panelMenuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuButtonLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbFramelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMenuButtonLayout.createSequentialGroup()
                        .addComponent(btnMenu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelData.setBackground(new java.awt.Color(222, 222, 222));
        panelData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Allocated amounts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(1, 1, 1))); // NOI18N
        panelData.setForeground(new java.awt.Color(1, 1, 1));

        lblAttractions.setForeground(new java.awt.Color(1, 1, 1));
        lblAttractions.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAttractions.setText("Attractions");
        lblAttractions.setToolTipText("");

        lblFood.setForeground(new java.awt.Color(1, 1, 1));
        lblFood.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFood.setText("Food");
        lblFood.setToolTipText("");

        lblTransport.setForeground(new java.awt.Color(1, 1, 1));
        lblTransport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTransport.setText("Transport");
        lblTransport.setToolTipText("");

        lblAccomadation.setForeground(new java.awt.Color(1, 1, 1));
        lblAccomadation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAccomadation.setText("Accomodation");
        lblAccomadation.setToolTipText("");

        lblEntertaintment.setForeground(new java.awt.Color(1, 1, 1));
        lblEntertaintment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEntertaintment.setText("Entertaintment");
        lblEntertaintment.setToolTipText("");

        lblAttractionsValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAttractionsValue.setText("jLabel1");

        lblFoodValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodValue.setText("jLabel1");

        lblTransportValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTransportValue.setText("jLabel1");

        lblAccomadationValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAccomadationValue.setText("jLabel1");

        lblEntertaintmentValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEntertaintmentValue.setText("jLabel1");

        javax.swing.GroupLayout panelDataLayout = new javax.swing.GroupLayout(panelData);
        panelData.setLayout(panelDataLayout);
        panelDataLayout.setHorizontalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEntertaintment, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTransport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAttractions, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFood, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAccomadation, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataLayout.createSequentialGroup()
                        .addComponent(lblAttractionsValue)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataLayout.createSequentialGroup()
                        .addComponent(lblFoodValue)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataLayout.createSequentialGroup()
                        .addComponent(lblTransportValue)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataLayout.createSequentialGroup()
                        .addComponent(lblAccomadationValue)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataLayout.createSequentialGroup()
                        .addComponent(lblEntertaintmentValue)
                        .addGap(111, 111, 111))))
        );
        panelDataLayout.setVerticalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblAttractions)
                .addGap(18, 18, 18)
                .addComponent(lblAttractionsValue)
                .addGap(32, 32, 32)
                .addComponent(lblFood)
                .addGap(18, 18, 18)
                .addComponent(lblFoodValue)
                .addGap(24, 24, 24)
                .addComponent(lblTransport)
                .addGap(18, 18, 18)
                .addComponent(lblTransportValue)
                .addGap(24, 24, 24)
                .addComponent(lblAccomadation)
                .addGap(18, 18, 18)
                .addComponent(lblAccomadationValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEntertaintment)
                .addGap(18, 18, 18)
                .addComponent(lblEntertaintmentValue)
                .addGap(23, 23, 23))
        );

        chartPanel.setBackground(new java.awt.Color(222, 222, 222));
        chartPanel.setForeground(new java.awt.Color(222, 222, 222));

        javax.swing.GroupLayout chartPanelLayout = new javax.swing.GroupLayout(chartPanel);
        chartPanel.setLayout(chartPanelLayout);
        chartPanelLayout.setHorizontalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        chartPanelLayout.setVerticalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(BudgetPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BudgetPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BudgetPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BudgetPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BudgetPlanner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    public javax.swing.JLayeredPane chartPanel;
    private javax.swing.JLabel lbFramelName;
    private javax.swing.JLabel lblAccomadation;
    private javax.swing.JLabel lblAccomadationValue;
    private javax.swing.JLabel lblAttractions;
    private javax.swing.JLabel lblAttractionsValue;
    private javax.swing.JLabel lblEntertaintment;
    private javax.swing.JLabel lblEntertaintmentValue;
    private javax.swing.JLabel lblFood;
    private javax.swing.JLabel lblFoodValue;
    private javax.swing.JLabel lblTransport;
    private javax.swing.JLabel lblTransportValue;
    private javax.swing.JPanel panelData;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenuButton;
    // End of variables declaration//GEN-END:variables
}
