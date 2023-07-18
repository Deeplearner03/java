package demo;
import java.sql.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Registration extends JFrame implements ActionListener 
  { 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField tf1, tf2, tf5, tf6, tf7;
    JButton btn1, btn2;
    JPasswordField p1, p2;
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/students";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";
    Connection conn = null;
	   Statement stmt = null;
	   String s1,s2,s5,s6,s7,s8,s9;
	   int phone1;
	
 
    Registration()
    {
    	 super("");
    	
       setVisible(true);
        setSize(1000, 1000);
        setLayout(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registration Form in Java");
 
        l1 = new JLabel("Registration Form in Windows Form:");
        l1.setForeground(Color.blue);
       
 
        l2 = new JLabel("Name:");
        l3 = new JLabel("Email-ID:");
        l4 = new JLabel("Create Passowrd:");
        l5 = new JLabel("Confirm Password:");
        l6 = new JLabel("Country:");
        l7 = new JLabel("State:");
        l8 = new JLabel("Phone No:"); 
        tf1 = new JTextField();
        tf2 = new JTextField();
        p1 = new JPasswordField();
        p2 = new JPasswordField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
 
        btn1 = new JButton("Submit");
        btn2 = new JButton("Clear");
 
        btn1.addActionListener(this);
        btn2.addActionListener(this);
 
        l1.setBounds(100, 30, 400, 50);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        l6.setBounds(80, 230, 200, 30);
        l7.setBounds(80, 270, 200, 30);
        l8.setBounds(80, 310, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        p1.setBounds(300, 150, 200, 30);
        p2.setBounds(300, 190, 200, 30);
        tf5.setBounds(300, 230, 200, 30);
        tf6.setBounds(300, 270, 200, 30);
        tf7.setBounds(300, 310, 200, 30);
        btn1.setBounds(50, 350, 100, 30);
        btn2.setBounds(170, 350, 100, 30);
 
        add(l1);
        add(l2);
        add(tf1);
        add(l3);
        add(tf2);
        add(l4);
        add(p1);
        add(l5);
        add(p2);
        add(l6);
        add(tf5);
        add(l7);
        add(tf6);
        add(l8);
        add(tf7);
        add(btn1);
        add(btn2);
  	 
  
   }
 
    public void actionPerformed(ActionEvent e)
     {
    	String s=e.getActionCommand().toString();
    	if(s.equals("Submit"))
        //if (e.getSource() == btn1)
         {
        	
              	
            s1 = tf1.getText();
            
            s2 = tf2.getText();
 
            char[] s3 = p1.getPassword();
            char[] s4 = p2.getPassword(); 
            s8 = new String(s3);
            s9 = new String(s4);
 
             s5 = tf5.getText();
             s6 = tf6.getText();
             s7 = tf7.getText();
             phone1= Integer.parseInt(s7);
             
             System.out.println("uname:"+s1);
             System.out.println("Email"+s2);
             System.out.println("Pass:"+s8);
             System.out.println("RePass:"+s9);
             System.out.println("country:"+s5);
             System.out.println("state:"+s6);
             System.out.println("Phone:"+s7);
            if (s8.equals(s9))
           {           
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
       	
            	String sql = "INSERT INTO Form " +
            	"(Uname,Email,pass,repass,country,state,phone)"+
                "VALUES (?,?,?,?,?,?,?)";
            	PreparedStatement ps = conn.prepareStatement(sql);
            	 ps.setString(1, s1);
                 ps.setString(2, s2);
                 ps.setString(3, s8);
                 ps.setString(4, s9);
                 ps.setString(5, s5);
                 ps.setString(6, s6);
                 ps.setString(7, s7);
            	int n=ps.executeUpdate();
					
					System.out.println("Rows effected:"+n);
            	 JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");
            	}
            	catch(Exception e1)
            	{
            		e1.printStackTrace();
            	}
           }
            
          else
           {
                JOptionPane.showMessageDialog(btn1, "Password Does Not Match");
            } 
        } 
     else
       {
            tf1.setText("");
            tf2.setText("");
            p1.setText("");
            p2.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
        }
   
   
           try {
        	   if(conn!=null)
        	   {
        		   conn.close();
        	   }
        	   if(stmt!=null)
        	   {
        		   stmt.close();
        	   }
        	  } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  
    } 
    public static void main(String args[]) throws Exception
   {
        new Registration();
    }
}