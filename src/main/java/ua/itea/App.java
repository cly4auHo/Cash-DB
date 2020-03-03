package ua.itea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
//		DBWorker.getUser(2);
//		DBWorker.createUser("vasilii", 29, "Lviv");
		
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//
//		Connection conn = null;
//
//		try {
//			conn = DriverManager.getConnection("jdbc:mysql://localhost/itea2?" + "user=root&password=");
//			// Do something with the Connection
//		} catch (SQLException ex) {
//			// handle any errors
//			System.out.println("SQLException: " + ex.getMessage());
//			System.out.println("SQLState: " + ex.getSQLState());
//			System.out.println("VendorError: " + ex.getErrorCode());
//		}
//
//		System.out.println("connected to database!");
//
//		Statement stmt = null;
//		ResultSet rs = null;
//
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery("SELECT * FROM users where age > 30"); //we wait for the result;
//			
//			while (rs.next()) {
//				System.out.println(rs.getString("id")+ " : "+ rs.getString("name")+" , "+rs.getString("age")+" , "+rs.getString("address"));
//			}
//			
//
//		} catch (SQLException ex) {
//			System.out.println("SQLException: " + ex.getMessage());
//			System.out.println("SQLState: " + ex.getSQLState());
//			System.out.println("VendorError: " + ex.getErrorCode());
//		}

	}
}
