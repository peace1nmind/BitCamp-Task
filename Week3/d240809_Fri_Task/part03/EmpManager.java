package d240809_Fri_Task.part03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// W3 D15 Task03-3

public class EmpManager {

	// Field
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
			
		}
	}
	
	
	// Constructor
	public EmpManager() {
	}

	
	// Method
	public void printEmployee(String name, int salary) throws SQLException {
		
		String sql = "SELECT "
				+ "employee_id 사번, first_name 이름, salary 연봉 "
				+ "FROM employees "
				+ "WHERE LOWER(first_name) Like ? "
				+ "AND salary >= ?";
		
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		System.out.println("DB Conn Success");
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, "%"+name+"%");
		pstmt.setInt(2, salary);
		
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			String result = String.format("%d\t%-12s\t%d", rs.getInt("사번"), rs.getString("이름"), rs.getInt("연봉"));
			System.out.println(result);
		}
		
		if (rs != null) {
			rs.close();
		}
		
		if (pstmt != null) {
			pstmt.close();
		}
		
		if (conn != null) {
			conn.close();
		}

	}// method end
	
	
	// Main Method
	public static void main(String[] args) throws SQLException {

		new EmpManager().printEmployee("al", 4000);

	}// main end

}
// class end
