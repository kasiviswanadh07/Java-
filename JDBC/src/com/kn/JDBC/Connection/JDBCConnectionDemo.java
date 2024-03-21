package com.kn.JDBC.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {

	public static void main(String[] args) {
      String URL ="jdbc:mysql://localhost:3306/university";
      String USER_NAME ="root";
      String PASSWORD ="Kasi@123";
//      String CREATE_STUDENT_QUERY="CREATE TABLE STUDENT6(ID INT, NAME VARCHAR(20),MARKS INT);";
//      String INSERT_STUDENT_QUERY="INSERT INTO STUDENT6 VALUES(1,'KASI',100),(2,'VIJAY',100);";
//      String UPDATE_STUDENT_QUERY="UPDATE  STUDENT6 SET NAME ='VISWANADH' WHERE NAME='KASI';";
    String DELETE_STUDENT_QUERY="DELETE FROM STUDENT6 WHERE ID =2;";
      
      

      try {
//        1.Load & Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
//		FQCN(Fully Qualified Class Name)-Canonical Name
		System.out.println("===> Driver Loaded & Registered ");
		
//		2.Establish the connection with Database
		Connection con=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		System.out.println("Connection Establish sucessful "+con);
		
//		3.Create Statement Object
		Statement smt=con.createStatement();
		
//		4.Send & Execute Query
//		smt.execute(CREATE_STUDENT_QUERY);
		
//	   int res= smt.executeUpdate(INSERT_STUDENT_QUERY);
//	   System.out.println(res+" rows effected");
		
//	   int res= smt.executeUpdate(UPDATE_STUDENT_QUERY);
//	   System.out.println(res+" rows effected");
		
	   int res= smt.executeUpdate(DELETE_STUDENT_QUERY);
	   System.out.println(res+" rows effected");
	    
		
	} catch (ClassNotFoundException e) {
		System.out.println("--------> Driver Not Found");
		e.printStackTrace();
	} catch (SQLException e) {
		System.out.println("-----> Failed to Establish Connection");
		e.printStackTrace();
	}
		
	}

}
