package com.jrout.tutorial.core.jdbc;

import java.awt.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HRDao {
	static Connection con = null;
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	CallableStatement cs = null;
	static ResultSet rs = null;

	static {
		String oracleDriver = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(oracleDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "HR", "HR");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

public static String selectQuery(int empId) {
	String name = null;	
	try {
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employees where employee_id ="+ empId);
			while(rs.next()) {
				name = rs.getString(2);
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
		return name;
	}
}
