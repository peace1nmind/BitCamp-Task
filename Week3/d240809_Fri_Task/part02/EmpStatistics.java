package d240809_Fri_Task.part02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

// W3 D15 Task02-3

public class EmpStatistics {

	// Field
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private String user = "hr";
	private String password = "hr";
	
	
	// Constructor
	public EmpStatistics() {
	}
	
	
	// Method
	public void printSatistics(int maxSalary) throws SQLException {
		
		Connection conn = null;
		Statement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driverName);
			
			conn = DriverManager.getConnection(url, user, password);
			
			if (conn != null) {
				System.out.println("DB conn Success");
			}
			
			String sql = "SELECT j.job_title job_title, AVG(NVL(e.salary, 0)) avgSalary "
					+ "FROM employees e, jobs j "
					+ "WHERE e.job_id = j.job_id "
					+ "AND e.salary >= "+maxSalary+" "
					+ "GROUP BY j.job_title "
					+ "ORDER BY avgSalary DESC" ;
			
			pstmt = conn.createStatement();
			rs = pstmt.executeQuery(sql);
			
			System.out.println("==============================");
			System.out.println("Max Salary : "+maxSalary);
			System.out.println("==============================");
			
			while (rs.next()) {
				
				String job_title = rs.getString("job_title");
				int avgSalary = rs.getInt("avgSalary");
				
				System.out.println("["+job_title+"] "+avgSalary);
				
			}
			
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.println("Class Not Found");
			System.out.println("DB conn Fail");
			
		} catch (SQLException e2) {
			e2.printStackTrace();
			System.out.print("SQL Exception");
			
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
				if (pstmt != null) {
					pstmt.close();
				}
				
				if (conn != null) {
					conn.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		
	}// method end
	
	
	// Main Method
	public static void main(String[] args) throws SQLException {

		new EmpStatistics().printSatistics(10000);

	}// main end

}
// class end
