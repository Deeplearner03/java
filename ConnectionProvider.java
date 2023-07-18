package demo;
import java.sql.*;
public class ConnectionProvider {
    private static Connection con;
    public static Connection getConnection() {
        try {
          
                //driver class load
                Class.forName("com.mysql.cj.jdbc.Driver");
                //create a connection..
                con = DriverManager.getConnection("jdbc:mysql://localhost:3308/students", "root", "1234");  
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}