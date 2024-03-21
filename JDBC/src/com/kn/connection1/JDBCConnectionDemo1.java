package com.kn.connection1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCConnectionDemo1 {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Kasi@123";

//	private static final String CREATE_TRAINER_QUERY="CREATE TABLE TRAINER(ID INT,NAME VARCHAR(20));";
	private static final String INSERT_DATA_QUERY = "INSERT INTO TRAINER VALUES(?,?);";
	private static final String SELECT_ALL_TRAINER_QUERY = "SELECT * FROM TRAINER;";
	private static final String UPDATE_TRAINER_QUERY = "UPDATE TRAINER SET NAME='YASH' WHERE ID=01;";
	private static final String DELETE_TRAINER_QUERY = "DELETE FROM TRAINER WHERE ID=01;";

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Connection con = null;
		try {
//			1.Load & Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Load sucessfuly");

//			2.Establish the connection
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection establish successful");

//			3.Create statement object
			Statement smt = con.createStatement();
			System.out.println("Statement created");
			
			System.out.println("choose the option form the following");
			System.out.println("1.Insert Data");
			System.out.println("2.Select Query");
			System.out.println("3.Update Data");
			System.out.println("4.Delete Data");
     
			System.out.println("Enter a number");
			int option=scan.nextInt();
			switch (option) {
			case 1: {
//				To Insert Data
			    createData(con, INSERT_DATA_QUERY);
			    break;
			}case 2:{
//				Read Data
				readData(smt,SELECT_ALL_TRAINER_QUERY);
				ResultSet rs = smt.executeQuery(SELECT_ALL_TRAINER_QUERY);
				while (rs.next()) {
					System.out.println("ID = " + rs.getInt(1) + ", NAME = " + rs.getString(2));
				}
				break;
			}
			case 3:{
//				Update Data
			updateData(smt, UPDATE_TRAINER_QUERY);
			break;
			}case 4:{

//				Delete Data
     		deleteData(smt, DELETE_TRAINER_QUERY);
     		break;
			}
	
			default:
				throw new IllegalArgumentException("Unexpected value: " +option );

//			4.Send & Execute the Query
//				smt.execute(CREATE_TRAINER_QUERY);

//			smt.executeUpdate(INSERT_DATA_QUERY);
//			System.out.println("Data inserted successfuly");

//			smt.executeUpdate(UPDATE_TRAINER_QUERY);
//			System.out.println("Data upadate successfuly");

//			smt.executeUpdate(DELETE_TRAINER_QUERY);
//			System.out.println("Data inserted successfuly");
			}
			
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			5.Close the connection
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void deleteData(Statement smt, String deleteTrainerQuery) {

		try {
			smt.execute(DELETE_TRAINER_QUERY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void updateData(Statement smt, String updateTrainerQuery) {

		try {
			smt.execute(UPDATE_TRAINER_QUERY);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static ResultSet readData(Statement smt, String selectAllTrainerQuery) {

		try {
			return smt.executeQuery(selectAllTrainerQuery);	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

//     Insert
	private static void createData( Connection con, String insertDataQuery) {
		Scanner scan=new Scanner(System.in);
		try {
//			int rows_Affected = smt.executeUpdate(insertDataQuery);
//			System.out.println("rows_Affected " + rows_Affected);
			System.out.print("Enter the value for Id:");
			int id=scan.nextInt();
			System.out.print("Enter the value for Name:");
			String name=scan.next();
			PreparedStatement prep=con.prepareStatement(insertDataQuery);
			prep.setInt(1, id);
			prep.setString(2, name);
			prep.execute();
			System.out.println("Rows Affected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		scan.close();
	}
	

}
