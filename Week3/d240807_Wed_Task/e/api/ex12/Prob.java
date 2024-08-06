package d240807_Wed_Task.e.api.ex12;

import java.util.HashMap;
import java.util.Map;

// W3 D13 Task3
// url �Ľ��Ͽ� �Ķ���� �� ��ȯ

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
				"http://localhost/order?prodId=PROD-001&prodName=������3&price=980000";
		
		String prodName = getParameter(url1, "prodName");
		System.out.println("��ǰ �̸� : "+prodName);
		
		String url2 = 
				"http://localhost/registUser?userId=USER-001&userName=ȫ�浿&address=����� ������&userAge=26";
		
		String userAddress = getParameter(url2, "address");
		System.out.println("ȸ�� �ּ� : "+userAddress);

	}// main end

}
// class end
