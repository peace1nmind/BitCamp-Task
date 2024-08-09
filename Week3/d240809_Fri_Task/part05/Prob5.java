package d240809_Fri_Task.part05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

// W3 D16 05-3

public class Prob5 {

	// Field

	// Constructor

	// Method
	public void printEmpInfo(String dept_id) {
		
		// DB Conn, PreparedStatement Open
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			
			// SQL 수정 필요
			String sql = "SELECT "
					+ "e.employee_id employee_id, ed.department_name department_name, "
					+ "e.salary salary, ed.avg avg_salary "
					+ "FROM employees e, "
					+ "(SELECT "
					+ "d.department_id, d.department_name, ROUND(AVG(NVL(e.salary,0)), 0) avg "
					+ "FROM employees e, departments d "
					+ "WHERE e.department_id = d.department_id "
					+ "GROUP BY d.department_id, d.department_name) ed "
					+ "WHERE e.department_id = ed.department_id "
					+ "AND e.department_id = ?";
			
			conn = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, Integer.parseInt(dept_id));
//			pstmt.setString(1, dept_id);
			
			rs = pstmt.executeQuery();
			
			ResultSetMetaData rsm = null;
			
			while (rs.next()) {
				System.out.println(String.format("%d\t%-15s\t%d\t%d",
						rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
			}
			
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				// DB Conn, PreparedStatement Close
				if (rs!=null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}// method end
	
	
	// Main Method
	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("부서의 아이디를 입력하세요...");
			System.exit(0);
		}
		
		String dept_id = args[0];
		
		new Prob5().printEmpInfo(dept_id);

	}// main end

}
// class end
