package com.kn.jdbc2;

import java.sql.*;
import java.util.*;

public class JDBC2 {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Kasi@123";
	private static final String INSERT = "INSERT INTO STUDENTS(Name,Gender) VALUES(?,?);";
//	private static final String UPDATE = "UPDATE STUDENTS SET ? = '?' WHERE ID = ?";
	private static final String DELETE = "DELETE FROM STUDENTS WHERE ID = ?;";
	private static final String SELECT = "SELECT * FROM STUDENTS;";
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			int opt = 0;
			while (opt != 5) {
				System.out.println("=========================================");
				System.out.println("Choose any one option");
				System.out.println("1.INSERT");
				System.out.println("2.UPDATE");
				System.out.println("3.DELETE");
				System.out.println("4.SELECT");
				System.out.println("5.TERMINATE (or) EXIT");
				opt = scan.nextInt();

				switch (opt) {
				case 1: {
					System.out.println("Data Before INSERT..");
					selectQuery(con);
					insertQuery(con);
					System.out.println("Data After INSERT..");
					selectQuery(con);
					break;
				}
				case 2: {
					System.out.println("Data Before INSERT..");
					selectQuery(con);
					updateQuery(con);
					System.out.println("Data After INSERT..");
					selectQuery(con);
					break;
				}
				case 3: {
					System.out.println("Data Before INSERT..");
					selectQuery(con);
					deleteQuery(con);
					System.out.println("Data After INSERT..");
					selectQuery(con);
					break;
				}
				case 4: {
					selectQuery(con);
					break;
				}
				case 5: {
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + opt);
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void selectQuery(Connection con) {
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SELECT);
			while(rs.next()) {
				System.out.println("ID : "+rs.getInt(1)+" | Name : "+rs.getString(2)+
						" | Gender : "+rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void deleteQuery(Connection con) {
		try {
			PreparedStatement st = con.prepareStatement(DELETE);
			System.out.println("Enter row id for deletion");
			int id = scan.nextInt();
			st.setInt(1, id);
			int rows = st.executeUpdate();
			System.out.println(rows+" rows affected..");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	private static void updateQuery(Connection con) {
		PreparedStatement st;
		try {
			 
			System.out.println("1.Update Name");
			System.out.println("2.Update Gender");
			int column;
			column = scan.nextInt();
			
			String col = null;
			scan.nextLine();
			if (column == 1) {
				col = "Name";
				System.out.println("Enter value for Name");
			} else if (column == 2) {
				col = "Gender";
				System.out.println("Enter value for Gender");
			} else {
				System.out.println("Enter correct option..");
				return;
			}
			String value = scan.nextLine();
			System.out.println("Enter row id for where you want to be update..");
			int id = scan.nextInt();
			
			String UPDATE = "UPDATE STUDENTS SET "+col+" = '"+value+"' WHERE ID = "+id+";";
			st = con.prepareStatement(UPDATE);
		    int rows = st.executeUpdate();
		    System.out.println(UPDATE);
			System.out.println( rows+" rows affected..");
		}catch(InputMismatchException i) {
			System.out.println("Choose Options");
		}catch(SQLException s) {
			System.out.println("Sql exppppppppppppppppp");
			s.printStackTrace();
		}
				

			

	}

	private static void insertQuery(Connection con) {
//		System.out.println("Enter Id");
//		int id = scan.nextInt();
		System.out.println("Enter Name");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("Enter Gender");
		String gender = scan.nextLine();
		try {
			PreparedStatement st = con.prepareStatement(INSERT);
//			st.setInt(1, id);
			st.setString(1, name);
			st.setString(2, gender);
			System.out.println();
			int rows = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan.close();
	}
}
