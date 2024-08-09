package d240809_Fri_Task.part04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// W3 D16 04-3

public class EmpManager {

	// Field
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Constructor
	public EmpManager() {
	}

	// Method
	public void printEmployee(String[] jobs) throws SQLException {
		
		// DB Conn, PreparedStatement Open
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String args = "";
		
		for (int i = 0; i < jobs.length; i++) {
			args = (i!=jobs.length-1) ? args+"'"+jobs[i]+"', " : args+"'"+jobs[i]+"'";
		}
		

		String sql = "SELECT "
				+ "e.employee_id e_id, e.first_name name, e.salary salary "
				+ "FROM employees e, jobs j "
				+ "WHERE e.job_id = j.job_id "
				+ "AND j.job_title IN ("+args+")";

		Connection con = DriverManager.getConnection(url, "hr", "hr");
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			System.out.println(String.format("%d\t%-15s\t%d", 
					rs.getInt("e_id"), rs.getString("name"), rs.getInt("salary")));
		}

		// DB Conn, PreparedStatement Close
		if (rs!=null) rs.close();
		if (stmt != null)
			stmt.close();
		if (con != null)
			con.close();

		
	}
	
	
	// Main Method
	public static void main(String[] args) throws SQLException {

		String[] jobs = {"Accountant", "Stock Clerk"};
		new EmpManager().printEmployee(jobs);

	}// main end

}
// class end
