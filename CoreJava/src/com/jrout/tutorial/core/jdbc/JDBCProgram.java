package com.jrout.tutorial.core.jdbc;

import java.awt.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Types;

public class JDBCProgram {
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
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","HR","HR");
		} catch (SQLException e) {
			e.printStackTrace();
		}
}
	public static void main(String[] args) {
		
//		selectQuery(101);
//		preparedStatement(106);
		JDBCProgram prog = new JDBCProgram();
//		prog.addBatch();
//		prog.savePoint();
		prog.callProcedure();
	}
	
	public static void selectQuery(int empId) {
		
		
		/*Driver myDriver = new oracle.jdbc.driver.OracleDriver(); 	
		DriverManager.registerDriver( myDriver );*/
		try {
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employees where employee_id ="+ empId);
			
			List empList = null;
			while(rs.next()) {
				System.out.println(rs.getString(2));
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
	
	public static void preparedStatement(int empid) {
        try {
            pstmt = con
                    .prepareStatement("select * from employees where employee_id = ?");
            pstmt.setInt(1, empid);
            //pstmt.setString(2, name);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("first_name") + " "
                        + rs.getString("last_name") + " " + rs.getString(1));
            }
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    /**
     *
     */
    public void addBatch() {
        try {
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();

            String SQL = "INSERT INTO H2KTable " + "VALUES (117, 'Rita')";
            stmt.addBatch(SQL);

            String SQL2 = "INSERT INTO H2KTable " + "VALUES (115, 'Rita')";
            stmt.addBatch(SQL2);

            String SQL3 = "update H2KTable set name ='RAJA' where id = 105";
            stmt.addBatch(SQL3);

            int[] intArray = stmt.executeBatch();
            for(int in : intArray) {
            	System.out.println(in);
            }
            con.commit();
            System.out.println("success");
        } catch (SQLException se) {
            try {
                con.rollback();

            } catch (Exception exp) {
                exp.printStackTrace();
            }
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    /**
     *
     */
    public void savePoint() {
        Savepoint savepoint1 = null;
        Savepoint savepoint2 = null;

        try {
            con.setAutoCommit(false);
            Statement stmt = con.createStatement(); // set a Savepoint

            savepoint1 = con.setSavepoint("Savepoint1");
            String SQL = "INSERT INTO H2KTable VALUES (120, 'Rita2')";

            stmt.executeUpdate(SQL); // Submit a malformed SQL statement that
            // breaks String SQL =
            // "INSERTED IN Employees " +
            // "VALUES (107, 22, 'Sita', 'Tez')";
            // stmt.executeUpdate(SQL); // If there
            // is no error, commit the changes.
            // conn.commit();

            savepoint2 = con.setSavepoint("Savepoint2");
            String SQL2 = "INSERT INTO H2KTable " + "VALUES (121, 'Rita3')";

            stmt.executeUpdate(SQL2);

            int i = 4 / 0;
        } catch (Exception se) { // If there is any error.
            try {
                con.rollback(savepoint2);
                // con.rollback();
            } catch (Exception exp) {
                exp.printStackTrace();
            }
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    public void insertRowInDBAndRollBack(int id, String name) {
        try {
            con.setAutoCommit(false);

            pstmt = con.prepareStatement("insert into H2KTable values(?,?)");

            pstmt.setInt(1, id);
            pstmt.setString(2, name);

            // pstmt.setInt(1, Integer.parseInt(id+"a"));
            // pstmt.setString(2, name+"1");

            int intValue = pstmt.executeUpdate();
            System.out.println("JDBCProgram.insertRowInDBAndRollBack()"
                    + intValue);

            int i = 4 / 0;

            con.commit();
        } catch (Exception exp) {
            exp.printStackTrace();
            try {
                con.rollback();
            } catch (Exception exp1) {
                exp1.printStackTrace();
            }
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    public void insertRowInDB(int id, String name) {
        try {
            pstmt = con.prepareStatement("insert into myExcel values(?,?)");
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            int intValue = 0;
            intValue = pstmt.executeUpdate();
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    /**
     * execute() true if the first result is a ResultSet object; 
     * false if it is an update count or there are no results
     */
    public void createTable() {
        try {
            stmt = con.createStatement();
            boolean hasResults = stmt.execute("CREATE TABLE H2KTable(id number(4) , name VARCHAR2(20))");
            System.out.println("Has ResultsSet ..." + hasResults);
            
            System.out.println("Table got created...");
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            closeConnections(rs, stmt, con);
        }
    }

    /**
     * API to close all open connections.
     */
    private static void closeConnections(ResultSet rs, Statement stmt, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

    /**
     * create or replace PROCEDURE SHOW_EMPLOYEES ( EID_IN IN NUMBER , EMP_NAME OUT VARCHAR2) AS BEGIN SELECT EMP.FIRST_NAME INTO EMP_NAME FROM EMPLOYEES EMP WHERE EMP.EMPLOYEE_ID = EID_IN; END;
     * API for invoking procedure
     */
    public void callProcedure() {
        try {
            cs = con.prepareCall("{call SHOW_EMPLOYEES(?,?)}");

            cs.setInt(1, 102);
            cs.registerOutParameter(2, Types.VARCHAR);

            cs.executeQuery();

            String empName = cs.getString(2);

            System.out.println("JDBCProgram.callProcedure()" + empName);
        } catch (Exception exp) {
            exp.printStackTrace();
        } finally {
            closeConnections(rs, stmt, con);
        }
    }
}
