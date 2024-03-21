package com.kn.connection1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class practiceJdbcSession {

	private static final String URL="jdbc:mysql://localhost:3306/university";
	private static final String username="root";
	private static final String password="Kasi@123";
	private static final String UPDATE_QUERY="UPDATE EMP SET SALARY=SALARY+(SALARY*01) WHERE ID=?;";
	private static final String SELECT_QUERY="SELECT * FROM EMP;";

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
       try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Load successful");
		
		 Connection con=DriverManager.getConnection(URL,username,password);
		 System.out.println("connection established");
		 
//		 Statement smt=con.createStatement();
		 
		update(con,scan);
		select(con,scan);
		 
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}  
		
	}

	private static void select(Connection con, Scanner scan) {
          PreparedStatement pmst;
	
          try {
			ResultSet rs=pmst.executeQuery();
			System.out.println("Id: "+rs.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	private static void update(Connection con, Scanner scan) {
       System.out.println("Enter the employee id");
       int id=scan.nextInt();
       
       try {
		PreparedStatement pmst=con.prepareStatement(UPDATE_QUERY);
		pmst.setInt(1, id);
		
		
		int rows = pmst.executeUpdate();
		if(rows==0) {
			System.out.println("Id not found");
		}else {
			System.out.println("Salary incremented successfully");
		}
		
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	}
}
