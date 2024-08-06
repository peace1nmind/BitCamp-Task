package d240807_Wed_Task.e.api.ex12;

import java.util.HashMap;
import java.util.Map;

// W3 D13 Task3
// url 파싱하여 파라미터 값 반환

public class Prob {

	// Field

	
	// Constructor
	public Prob() {
	}

	
	// Method
	private static String getParameter(String url, String paramName) {
		
		String[] params =  url.substring(url.indexOf("?")+1).split("&");
		Map<String, String> map = new HashMap<String, String>();
		
		for (String param: params) {
			map.put(param.split("=")[0], param.split("=")[1]);
		}
		
		return map.get(paramName);
	}
	
	
	// Main Method
	public static void main(String[] args) {

		String url1 = 
				"http://localhost/order?prodId=PROD-001&prodName=갤럭시3&price=980000";
		
		String prodName = getParameter(url1, "prodName");
		System.out.println("제품 이름 : "+prodName);
		
		String url2 = 
				"http://localhost/registUser?userId=USER-001&userName=홍길동&address=서울시 강남구&userAge=26";
		
		String userAddress = getParameter(url2, "address");
		System.out.println("회원 주소 : "+userAddress);

	}// main end

}
// class end
