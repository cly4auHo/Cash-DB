package ua.itea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBWorker {
//	private final static String GET_USER = "SELECT name,address FROM users where id=";
//	private final static String CREATE_USER = "INSERT INTO users (name,age,address) VALUES (";
	private final static String CREATE_DOG = "INSERT INTO dog (name,age,owner) VALUES (";
	
	public static void createDog(String name, int age, String owner) {
		Statement stmt = getStatement();

		try {
			stmt.execute(CREATE_DOG + "'" + name + "'," + age + ",'" + owner + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
//	public static void getUser(int id) {
//		Statement stmt = getStatement();
//		ResultSet rs = null;
//		try {
//			rs = stmt.executeQuery(GET_USER + id); // we wait for the result;
//			while (rs.next()) {
//				System.out.println(rs.getString("name") + " , " + rs.getString("address"));
//			}
//		} catch (SQLException ex) {
//			ex.printStackTrace();
//			System.out.println("SQLException: " + ex.getMessage());
//			System.out.println("SQLState: " + ex.getSQLState());
//			System.out.println("VendorError: " + ex.getErrorCode());
//		} finally {
//			try {
//				if (rs != null) {
//					rs.close();
//				}
//				if (stmt != null) {
//					stmt.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	public static void createUser(String name, int age, String address) {
//		Statement stmt = getStatement();
//
//		try {
//			stmt.execute(CREATE_USER + "'" + name + "'," + age + ",'" + address + "')");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (stmt != null) {
//					stmt.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}

	private static Statement getStatement() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/itea2?" + "user=root&password=");
			// Do something with the Connection
			stmt = conn.createStatement();
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			
		}
		return stmt;
	}
}
