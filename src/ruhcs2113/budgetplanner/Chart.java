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
    public JFreeChart chart;
    public ChartPanel chartPan;
    public JPanel panel;
    
    public Chart() {
        // Create dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(10, "Series 1", "Category 1");
        dataset.setValue(20, "Series 1", "Category 2");
        dataset.setValue(30, "Series 1", "Category 3");

        // Create chart
        chart = ChartFactory.createBarChart(
            "My Chart",
            "Category",
            "Value",
            dataset,
            PlotOrientation.VERTICAL,
            false,
            true,
            false
        );

        // Create chart panel and add it to a JPanel
        chartPan = new ChartPanel(chart);
        panel = new JPanel();
        panel.add(chartPan);

        // Add JPanel to JFrame
        add(panel);

        // Set size and visibility of JFrame
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Chart();
    }

}

