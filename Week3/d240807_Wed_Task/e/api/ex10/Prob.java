package d240807_Wed_Task.e.api.ex10;

import java.util.List;
import java.util.Vector;

// W3 D13 Task1 
// 글자반대로 반환

public class Prob {

	// Field
	
	
	// Constructor
	public Prob() {
	}
	
	
	// Method
	public List<String> dataChange(String[] strData) {
		
		List<String> strList = new Vector<String>();
		StringBuffer sb = new StringBuffer();
		
		for (String str: strData) {
			
			for (int i = 0; i < str.length(); i++) {
				 sb = sb.insert(0, str.charAt(i));
			}
			strList.add(0, sb.toString());
			sb = new StringBuffer();
		}
		
		return strList;
		
//		List<String> strList = new Vector<String>();
//		String s = "";
//		
//		for (String str: strData) {
//			for (int i = 0; i < str.length(); i++) {
//				 s = str.charAt(i) + s;
//			}
//			strList.add(0, s);
//			s = "";
//		}
//		
//		return strList;
	}
	
	
	// Main Method
	public static void main(String[] args) {

		Prob st = new Prob();
		String[] strData = {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet"};
		Vector<String> v = (Vector<String>) st.dataChange(strData);
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.elementAt(i));
		}

	}// main end

}
// class end
