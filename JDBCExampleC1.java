/*DELIMITER $$

DROP PROCEDURE IF EXISTS `students`.`getStdName` $$
/*CREATE PROCEDURE `students`.`getStdName` 
   (IN s_id INT, OUT s_first VARCHAR(255))
BEGIN
   SELECT first INTO s_first
   FROM reg
   WHERE s_id=id;
	Insert into reg values (200,"vin","soni",23);
	UPDATE reg set age=23 where first LIKE "h%";
DELETE FROM reg where id=103;

END $$

DELIMITER ;*/


// callable stmt

package jdbc;

//STEP 1. Import required packages
import java.sql.*;

public class JDBCExampleC1 {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/students";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "root";
   
   public static void main(String[] args) {
   Connection conn = null;
   CallableStatement stmt = null;
   try{
      //STEP 2: Register JDBC driver
    //  Class.forName("com.mysql.jdbc.Driver");
	   Driver ob=new com.mysql.jdbc.Driver();
      DriverManager.registerDriver(ob);
      

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      String sql = "{call getStdName (?, ?)}";
      stmt = conn.prepareCall(sql);
      
      //Bind IN parameter first, then bind OUT parameter
      int empID = 200;
      stmt.setInt(1, empID); // This would set ID as 102
      // Because second parameter is OUT so register it
      stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
      
      //Use execute method to run stored procedure.
      System.out.println("Executing stored procedure..." );
      stmt.execute();

      //Retrieve employee name with getXXX method
      String empName = stmt.getString(2);
      System.out.println("Emp Name with ID:" + 
               empID + " is " + empName);
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
}
}
