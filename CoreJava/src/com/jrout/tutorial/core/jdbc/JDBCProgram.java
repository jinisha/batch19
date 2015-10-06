package com.jrout.tutorial.core.jdbc;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCProgram {

	public static void main(String[] args) {
		String oracleDriver = "oracle.jdbc.driver.OracleDriver";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(oracleDriver);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/*Driver myDriver = new oracle.jdbc.driver.OracleDriver(); 	
		DriverManager.registerDriver( myDriver );*/
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","HR","HR");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employees");
			
			List empList = null;
			while(rs.next()) {
				System.out.println(rs.getString(2) +" " + rs.getString("last_name") +" " + rs.getString("JOB_title"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
