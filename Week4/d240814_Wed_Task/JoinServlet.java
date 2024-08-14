package d240814_Wed_Task;
// W4 D17 

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JoinServlet extends HttpServlet {

	// Field

	// Constructor

	// Method
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException,IOException {
		
		/* HTML 부분 */
		
		// 한글처리
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC-KR");
		
		PrintWriter out = res.getWriter();
		
		String[] items = {"이름", "성별", "생년월일", "달력종류", "최종학력", "직업", "소속", 
				"결혼여부", "자녀수", "연락처", "전화번호", "휴대폰","이동통신사", "거주지주소"};
		
		int gender = (req.getParameter("gender").equals("남"))? 0 : 1;
		String birth = req.getParameter("birthYear")+"/"+req.getParameter("birthMonth")+"/"+req.getParameter("birthDay");
		int marriage = (req.getParameter("marriage").equals("미혼"))? 0 : 1;
		int child = Integer.parseInt(req.getParameter("child"));
		int telPlace = (req.getParameter("telPlace").equals("집"))? 0 : 1;
		String tel = req.getParameter("tel1")+"-"+req.getParameter("tel2")+"-"+req.getParameter("tel3");
		String phone = req.getParameter("phone1")+"-"+req.getParameter("phone2")+"-"+req.getParameter("phone3");
		
		String[] info = {req.getParameter("name"), req.getParameter("gender"), birth, req.getParameter("calendarType"), 
				req.getParameter("edu"), req.getParameter("job"), req.getParameter("dept"), req.getParameter("marriage"), req.getParameter("child"), 
				tel, req.getParameter("telPlace"), phone, req.getParameter("telCompany"), req.getParameter("addr")};
		
//		Member member = new Member(req.getParameter("name"), gender, birth, req.getParameter("calendarType"), 
//				req.getParameter("edu"), req.getParameter("job"), req.getParameter("dept"), marriage, child, 
//				tel, telPlace, phone, req.getParameter("telCompany"), req.getParameter("addr"));
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>  </title>");
		out.println("</head>");
		
		for (int i = 0; i < items.length; i++) {
			out.println("<p>"+items[i]+" : "+info[i]+"</p>");
		}
		
		
		
		
		/* JDBC 부분 */
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rs;
		
		String sql = "INSERT INTO member_test "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			
			for (int i = 0; i < info.length; i++) {
				pstmt.setString(i+1, info[i]);
			}
			
			rs = pstmt.executeUpdate();
			
			if (rs == 1) {
				out.println("<br><br><strong>회원가입에성공하였습니다</strong>");
			}
			
			out.println("</body>");
			out.println("</html>");
			out.flush();
			out.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();}
				
				if (conn != null) {
					conn.close();}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}// method end

}
// class end
