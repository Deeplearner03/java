package jdbc;
// prepared stmt

//STEP 1. Import required packages
import java.sql.*;

public class JDBCExampleP2 {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/students";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "root";
   
   public static void main(String[] args) {
   Connection conn = null;
   PreparedStatement stmt = null;
try{   
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      String sql = "INSERT INTO reg "
    	          + "VALUES (?,?,?,?)";
      stmt = conn.prepareStatement(sql);
      
      //Bind values into the parameters.
    
      stmt.setInt(1, 104);  // This would set age
      stmt.setString(2,"sagar"); // This would set ID
      stmt.setString(3,"patel");
      stmt.setInt(4,23);
      int row= stmt.executeUpdate(); 
      System.out.println("no of rows impact:"+row);
      
      stmt.setInt(1, 105);  // This would set age
      stmt.setString(2,"hinal"); // This would set ID
      stmt.setString(3, "makwana");
      stmt.setInt(4,22);
      row= stmt.executeUpdate(); 
      System.out.println("no of rows impact:"+row);
      
      
      // Let us update age of the record with ID = 102;
       
      

      // Let us select all the records and display them.
      sql = "SELECT id, first, last, age FROM reg where id=100";
      stmt = conn.prepareStatement(sql);
      ResultSet rs = stmt.executeQuery();

      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt(1);
         int age = rs.getInt(4);
         String first = rs.getString(2);
         String last = rs.getString(3);

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }
      //STEP 6: Clean-up environment
      rs.close();
      stmt.close();
      conn.close();
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
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
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