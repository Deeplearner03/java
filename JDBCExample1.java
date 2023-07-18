package demo;
//STEP 1. Import required packages
import java.sql.*;

public class JDBCExample1 {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3308/xyz";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "1234";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt=null;
ResultSet rs=null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      
      // Statement execution
      stmt=conn.createStatement();
      
      rs=stmt.executeQuery("select * from reg");
      while(rs.next())
      {
    	  System.out.print("Id:"+rs.getInt("id")+" Name: "+ rs.getString("name"));
    	  System.out.println();
      }
      System.out.println("Connected database successfully...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(conn!=null)
            conn.close();
          if(stmt!=null)
        	 stmt.close();
          if(rs!=null)
         	 rs.close();
       
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample