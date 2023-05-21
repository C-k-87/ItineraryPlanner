/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ruhcs2113.budgetplanner;

import java.sql.ResultSet;
import java.sql.SQLException;
import ruhcs2113.Connect;
import ruhcs2113.homepage.HomePage;

/**
 *
 * @author jack
 */
public class BudgetPlanner extends javax.swing.JFrame {
    
    private static String username;     //Global username
    /**
     * Creates new form BudgetPlanner
     */
    public BudgetPlanner(String username) {
        initComponents();
        
        
        // Initialize variables ------------------------------------------------
        
        this.username = username;
        
        Connect d = new Connect();
        int uid = d.getUID(username);
        
        double accomadation = 0;
        double food = 0;
        double attraction = 0;
        double transport = 0;
        double entertaintment = 0;
        double total = 0;
        
        // Set values for chart generation -------------------------------------
        
        ResultSet rs = d.initialize(uid);
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
        
        // Generate chart and set it to a panel ---------------------------------
        
        Chart chart = new Chart(accomadation, food, entertaintment, transport, attraction, total, chartPanel);
        
        // Set values for labels -------------------------------------------------------
        
        lblAccomadationValue.setText(String.valueOf(accomadation));
        lblAttractionsValue.setText(String.valueOf(attraction));
        lblEntertaintmentValue.setText(String.valueOf(entertaintment));
        lblFoodValue.setText(String.valueOf(food));
        lblTransportValue.setText(String.valueOf(transport));
        lblTotalValue.setText(String.valueOf(total));
    }


    /**
     * Initialize form
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelMenuButton = new javax.swing.JPanel();
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
        lblTotal = new javax.swing.JLabel();
        lblTotalValue = new javax.swing.JLabel();
        chartPanel = new javax.swing.JLayeredPane();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));

        panelMain.setBackground(new java.awt.Color(40, 44, 75));

        panelMenuButton.setBackground(new java.awt.Color(26, 31, 60));

        lbFramelName.setBackground(new java.awt.Color(254, 254, 254));
        lbFramelName.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        lbFramelName.setForeground(new java.awt.Color(254, 254, 254));
        lbFramelName.setText("BUDGET PLANNER");

        javax.swing.GroupLayout panelMenuButtonLayout = new javax.swing.GroupLayout(panelMenuButton);
        panelMenuButton.setLayout(panelMenuButtonLayout);
        panelMenuButtonLayout.setHorizontalGroup(
            panelMenuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuButtonLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lbFramelName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuButtonLayout.setVerticalGroup(
            panelMenuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbFramelName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelData.setBackground(new java.awt.Color(40, 44, 75));
        panelData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Allocated amounts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(254, 254, 254))); // NOI18N
        panelData.setForeground(new java.awt.Color(1, 1, 1));

        lblAttractions.setForeground(new java.awt.Color(254, 254, 254));
        lblAttractions.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAttractions.setText("Attractions");
        lblAttractions.setToolTipText("");

        lblFood.setForeground(new java.awt.Color(254, 254, 254));
        lblFood.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFood.setText("Food");
        lblFood.setToolTipText("");

        lblTransport.setForeground(new java.awt.Color(254, 254, 254));
        lblTransport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTransport.setText("Transport");
        lblTransport.setToolTipText("");

        lblAccomadation.setForeground(new java.awt.Color(254, 254, 254));
        lblAccomadation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAccomadation.setText("Accomodation");
        lblAccomadation.setToolTipText("");

        lblEntertaintment.setForeground(new java.awt.Color(254, 254, 254));
        lblEntertaintment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEntertaintment.setText("Entertaintment");
        lblEntertaintment.setToolTipText("");

        lblAttractionsValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAttractionsValue.setForeground(new java.awt.Color(254, 254, 254));
        lblAttractionsValue.setText("jLabel1");

        lblFoodValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodValue.setForeground(new java.awt.Color(254, 254, 254));
        lblFoodValue.setText("jLabel1");

        lblTransportValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTransportValue.setForeground(new java.awt.Color(254, 254, 254));
        lblTransportValue.setText("jLabel1");

        lblAccomadationValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAccomadationValue.setForeground(new java.awt.Color(254, 254, 254));
        lblAccomadationValue.setText("jLabel1");

        lblEntertaintmentValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEntertaintmentValue.setForeground(new java.awt.Color(254, 254, 254));
        lblEntertaintmentValue.setText("jLabel1");

        lblTotal.setForeground(new java.awt.Color(254, 254, 254));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal.setText("Total :");
        lblTotal.setToolTipText("");

        lblTotalValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotalValue.setForeground(new java.awt.Color(254, 254, 254));
        lblTotalValue.setText("jLabel1");

        javax.swing.GroupLayout panelDataLayout = new javax.swing.GroupLayout(panelData);
        panelData.setLayout(panelDataLayout);
        panelDataLayout.setHorizontalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEntertaintment, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDataLayout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(lblTotalValue))
                                .addComponent(lblAccomadation, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDataLayout.createSequentialGroup()
                        .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAttractions, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTransport, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFood, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDataLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEntertaintmentValue)
                                    .addComponent(lblTransportValue)
                                    .addComponent(lblFoodValue)
                                    .addComponent(lblAccomadationValue)
                                    .addComponent(lblAttractionsValue))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelDataLayout.setVerticalGroup(
            panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAttractions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAttractionsValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFoodValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTransport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTransportValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAccomadation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccomadationValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEntertaintment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEntertaintmentValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblTotalValue))
                .addContainerGap())
        );

        chartPanel.setBackground(new java.awt.Color(222, 222, 222));
        chartPanel.setForeground(new java.awt.Color(222, 222, 222));

        javax.swing.GroupLayout chartPanelLayout = new javax.swing.GroupLayout(chartPanel);
        chartPanel.setLayout(chartPanelLayout);
        chartPanelLayout.setHorizontalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        chartPanelLayout.setVerticalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnMenu.setBackground(new java.awt.Color(0, 102, 102));
        btnMenu.setText("Main Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelData, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu)
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(chartPanel)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        dispose();
        HomePage hmePage = new HomePage(username);
        hmePage.setVisible(true);
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BudgetPlanner(username).setVisible(true);
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
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalValue;
    private javax.swing.JLabel lblTransport;
    private javax.swing.JLabel lblTransportValue;
    private javax.swing.JPanel panelData;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenuButton;
    // End of variables declaration//GEN-END:variables
}
