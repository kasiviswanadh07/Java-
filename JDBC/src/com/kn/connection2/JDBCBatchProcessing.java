package com.kn.connection2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBatchProcessing {


	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Kasi@123";

	private static final String Query1= "UPDATE TRAINER SET GENDER='MALE' WHERE ID!=4;";
	private static final String  Query2= "UPDATE TRAINER SET NAME='PRIYA MAM' WHERE ID=4;";
	
	public static void main(String[] args) {
       Connection con=null;

		try {
//			Load & Register
			Class.forName("com.mysql.cj.jdbc.Driver");
//			Establish the connection
			con=DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			
			Statement smt=con.createStatement();
			
//			set auto commit false
			con.setAutoCommit(false);
			
//			Add task to batch
			smt.addBatch(Query1);
			smt.addBatch(Query2);
			
//			Get the count of records
			int[] countBatch=smt.executeBatch();
			for(int count:countBatch) {
				System.out.println(count+" Rows Affected");
			}
//			commit
			con.commit();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				
			}
		}
	}

}
