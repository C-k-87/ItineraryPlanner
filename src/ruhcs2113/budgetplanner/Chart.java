/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruhcs2113.budgetplanner;

/**
 *
 * @author jayas
 */
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;

public class Chart extends JFrame {
    private static int x = 512, y = 512;
    public Chart(double accomadation, double food, double entertaintment, double transport, double attraction, double total, JLayeredPane chartPanel) {
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

        ChartPanel chrtPnl = new ChartPanel(chart);
        chrtPnl.setSize(x,y);
        chrtPnl.setVisible(true);
        chartPanel.add(chrtPnl);
        chartPanel.revalidate();
        chartPanel.repaint();
    }
    
    private double percentOf(double value, double total) {
        return value/total*100;
    }
}

