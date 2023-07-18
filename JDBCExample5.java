package jdbc;

//insert record

//STEP 1. Import required packages
import java.sql.*;

public class JDBCExample5 {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/SMIT";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "root";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO registration " +
                   "VALUES (17, 'smit', 'patel', 23)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO registration " +
                   "VALUES (18, 'sagar', 'patel', 25)";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");
      
      sql="select * from registration";
      	ResultSet rs=stmt.executeQuery(sql);
      	while(rs.next())
      	{
      		int id=rs.getInt("id");
      		String first=rs.getString("first");
      		String last=rs.getString("last");
      		int age=rs.getInt("age");
      		System.out.print("id:"+id);
      		System.out.print(", first:"+first);
      		System.out.print(", last:"+last);
      		System.out.println(", age"+age);
      		
      	}
      	rs.close();
      
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample