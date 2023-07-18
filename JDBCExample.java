package demo;
//STEP 1. Import required packages
import java.sql.*; 
public class JDBCExample {   
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3308/students";

  static final String USER = "root";
   static final String PASS = "1234";   
   public static void main(String[] args) throws SQLException,ClassNotFoundException {
   Connection conn = null;
   Statement stmt = null;
   
      Class.forName("com.mysql.cj.jdbc.Driver");

   
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
   
      System.out.println("Connected database...");
      stmt = conn.createStatement();
      String sql="delete from Reg where id=105"; 
      stmt.executeUpdate(sql);
    System.out.println("delete successful");
   
    if(stmt!=null)
        stmt.close();
    if(conn!=null)
       conn.close();
    System.out.println("Goodbye!");
}//end main
}//end JDBCExample