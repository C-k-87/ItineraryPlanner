/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruhcs2113.todolist;

/**
 *
 * @author jack
 */
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;


public class Connect {
    void addTask(int id,String title, String description, double budget, String category) {       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itinerary_planner", "root", "");
                      
            String addStatement = ("INSERT INTO tasks VALUES(?,?,?,?,?)");
            PreparedStatement ptst = con.prepareStatement(addStatement);
            
            ptst.setString(1, String.valueOf(id));
            ptst.setString(2, title);
            ptst.setString(3, description);
            ptst.setString(4, String.valueOf(budget));
            ptst.setString(5, category);
            
            ptst.executeUpdate();
            System.out.println("Success");
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error. Connection failed.");
        }
    }
    
    void removeTask(int row) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itinerary_planner", "root", "");
            
            String removeStatement = ("DELETE FROM tasks WHERE tasks.task_id = ?");
            PreparedStatement ptst = con.prepareStatement(removeStatement);
            
            ptst.setString(1, String.valueOf(row));
            ptst.executeUpdate();
            
            System.out.println("Success");
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error. Connection failed.");
        }
    }
    
    ResultSet initialize() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itinerary_planner", "root", "");
            
            Statement st = con.createStatement();
            String query = "SELECT * FROM tasks";
            
            ResultSet rs = st.executeQuery(query);         
            
            System.out.println("Initialized.");
            
            return rs;
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error. Connection failed.");
        }
        System.err.println("FATAL: Couldn't initialize table");
        return null;
    }
}