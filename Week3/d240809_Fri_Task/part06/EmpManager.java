package d240809_Fri_Task.part06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// W3 D16 06-3

public class EmpManager {

	// Field
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	// Constructor
	public EmpManager() {
	}

	
	// Method
	public void printEmployee(String city, int lo, int hi) throws SQLException {
		
		// DB Conn, PreparedStatement Open
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";

		String sql = "SELECT "
				+ "e.first_name||' '||e.last_name name, d.department_name "
				+ "FROM employees e, departments d, locations l "
				+ "WHERE e.department_id = d.department_id "
				+ "AND d.location_id = l.location_id "
				+ "AND l.city IN (?) "
				+ "AND e.salary BETWEEN ? AND ?";

		Connection con = DriverManager.getConnection(url, "hr", "hr");
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, city);
		pstmt.setInt(2, lo);
		pstmt.setInt(3, hi);

		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			
			System.out.println(String.format("%-20s\t%s", rs.getString(1), rs.getString(2)));
		}

		// DB Conn, PreparedStatement Close
		if (rs != null) {
			rs.close();}
		
		if (pstmt != null) {
			pstmt.close();}
		
		if (con != null) {
			con.close();}

	}
	
	
	// Main Method
	public static void main(String[] args) throws SQLException {

		new EmpManager().printEmployee("South San Francisco", 7000, 10000);

	}// main end
	

}
// class end
