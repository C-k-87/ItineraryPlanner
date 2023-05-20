/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruhcs2113;

/**
 *
 * @author jack
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;


public class Connect {
    public void addTask(int id, int uid, String title, String description, double budget, String category) {       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itinerary_planner", "root", "");
                      
            String addStatement = ("INSERT INTO tasks VALUES(?,?,?,?,?,?)");
            PreparedStatement ptst = con.prepareStatement(addStatement);
            
            ptst.setString(1, String.valueOf(id));
            ptst.setString(2, String.valueOf(uid));            
            ptst.setString(3, title);
            ptst.setString(4, description);
            ptst.setString(5, String.valueOf(budget));
            ptst.setString(6, category);
            
            ptst.executeUpdate();
            System.out.println("Success");
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error. Connection failed.");
        }
    }
    
    public void removeTask(int row,int uid) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itinerary_planner", "root", "");
            
            String removeStatement = ("DELETE FROM tasks WHERE tasks.task_id = ? AND tasks.uid = ?");
            PreparedStatement ptst = con.prepareStatement(removeStatement);
            
            ptst.setString(1, String.valueOf(row));
            ptst.setString(2, String.valueOf(uid));
            ptst.executeUpdate();
            
            System.out.println("Success");
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error. Connection failed.");
        }
    }
    
    public ResultSet initialize(int uid) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itinerary_planner", "root", "");
            
            String query = "SELECT * FROM tasks WHERE uid = '"+uid+"'";
            
            Statement st = con.createStatement();  
            
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
    
    public int getUID(String username) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itinerary_planner", "root", "");
            
            String query = ("SELECT uid FROM tourist WHERE uname ='"+username+"'");
            
            Statement st = con.createStatement();    
            
            ResultSet rs = st.executeQuery(query); 
            rs.next();
            int uid = rs.getInt("uid");
            
            return uid;
            
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Error. Retrieval failed.");
            return -1;
        }
    }
}