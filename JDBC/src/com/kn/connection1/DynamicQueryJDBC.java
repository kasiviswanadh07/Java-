package com.kn.connection1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class DynamicQueryJDBC {

      private static final String URL="jdbc:mysql://localhost:3306/university";
      private static final String USER_NAME="root";
      private static final String PASSWORD="Kasi@123";
      
      private static final String INSERT_EMP_DATA="INSERT INTO EMP VALUES(?,?,?);";
      private static final String SELECT_EMP_DATA="SELECT * FROM EMP;";
      private static final String UPDATE_EMP_DATA="UPDATE EMP SET NAME=? WHERE ID=?;";
      private static final String DELETE_EMP_DATA="DELETE FROM EMP WHERE NAME=?;";
	public static void main(String[] args) {
  
		Scanner scan=new Scanner(System.in);
		
		try {
//			1.LOAD & Register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
//			Establish connection
			Connection con=DriverManager.getConnection(URL, USER_NAME,PASSWORD);

			System.out.println("CHOOSE APPROPRIATE OPTION FROM THE BELOW");
			System.out.println("1.Insert Data");
			System.out.println("2.Read Data");
			System.out.println("3.Update Data");
			System.out.println("4.Delete Data");
			System.out.println("5.Exit The Loop");

			while (true) {
			
			int option=scan.nextInt();
			
			switch (option) {
			
			case 1: {
				
				ReadData(con,scan);
				inserData(con, scan);
				ReadData(con,scan);
				repeat();
	             break;
			}
			case 2: {
				ReadData(con,scan);
				System.out.println();
				repeat();
			
				break;
			}
			case 3: { 
		     		System.out.println();
		     		ReadData(con,scan);
				UpdateData(con,scan);
				System.out.println();
				ReadData(con,scan);
				System.out.println();
				repeat();
				break;
			}
			case 4: {
				ReadData(con,scan);
	     		System.out.println();
				DeleteData(con,scan);
				System.out.println();
				ReadData(con,scan);
				System.out.println();
				repeat();
				break;
			}
			case 5:{
				System.out.println("Execution Completed");
				System.exit(0);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
			
		}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		scan.close();
	}
	public static void repeat() {
	System.out.println("CHOOSE APPROPRIATE OPTION FROM THE BELOW");
	System.out.println("1.Insert Data");
	System.out.println("2.Read Data");
	System.out.println("3.Update Data");
	System.out.println("4.Delete Data");
	System.out.println("5.Exit The Loop");
	}
	private static void DeleteData(Connection con, Scanner scan) {

		
	     
	     try {
			PreparedStatement pmst=con.prepareStatement(DELETE_EMP_DATA);
			System.out.println("ENTER THE NAME NEED'S TO BE DELETE");
		     String name=scan.next();
		    pmst.setString(1, name);
		    pmst.execute();
		    System.out.println("ROW HAD DELETED WHO'S NAME IS "+name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private static void UpdateData(Connection con, Scanner scan) {

		System.out.println("ENTER NAME TO BE UPDATE");
		String name=scan.next();

		try {
			PreparedStatement pmst=con.prepareStatement(UPDATE_EMP_DATA);
			pmst.setString(1, name);
			System.out.println("ENTER ID WHO'S NAME NEEDS TO BE UPDATED");
			int id=scan.nextInt();
			pmst.setString(1, name);
			pmst.setInt(2,id);
			pmst.execute();
			System.out.println("NAME FOR EMPLOYEE WITH ID: "+id+", HAS CHANGED");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	private static void ReadData(Connection con,Scanner scan) {
		
        try {
			PreparedStatement pmst=con.prepareStatement(SELECT_EMP_DATA);
			ResultSet rs=pmst.executeQuery();
			
			while(rs.next()) {
				System.out.println("Id: "+rs.getInt(1)+" Name: "+rs.getString(2)+" SALARY: "+rs.getDouble(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	private static void inserData(Connection con,Scanner scan) {
		
		System.out.println("ENTER ID : ");
		int id=scan.nextInt();
		System.out.println("ENTER NAME : ");
		String name=scan.next();
		System.out.println("ENTER SALARY : ");
		Double salary=scan.nextDouble();
		try {
			PreparedStatement psmt=con.prepareStatement(INSERT_EMP_DATA);
			psmt.setInt(1, id);
			psmt.setString(2, name);
			psmt.setDouble(3, salary);
			psmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
