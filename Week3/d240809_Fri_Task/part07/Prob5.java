package d240809_Fri_Task.part07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// W3 D16 07-p3-3 END

public class Prob5 {

	// Field

	// Constructor
	public Prob5() {
	}

	
	// Method
	private static void printEmployeeList(String cityName, String deptName) throws Exception {
		
		// DB Conn, PreparedStatement Open
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";

		Class.forName(driver);

		String sql = "SELECT * "
				+ "FROM "
				+ "	(SELECT "
				+ "	l.city city, d.department_name dept_name, "
				+ "	e.first_name name, e.salary salalry "
				+ "	FROM employees e, departments d, locations l "
				+ "	WHERE e.department_id = d.department_id "
				+ "	AND d.location_id = l.location_id) "
				+ "WHERE LOWER(city) LIKE ? "
				+ "AND LOWER(dept_name) LIKE ?";

		Connection con = DriverManager.getConnection(url, "hr", "hr");
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, '%'+cityName+'%');
		pstmt.setString(2, '%'+deptName+'%');
		
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			
			System.out.println(String.format("%s\t%s\t%-15s\t%d", 
					rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
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
	public static void main(String[] args) throws Exception {

		Prob5.printEmployeeList("south", "it");
//		Prob5.printEmployeeList("lon", "resource");

	}// main end

}
// class end
