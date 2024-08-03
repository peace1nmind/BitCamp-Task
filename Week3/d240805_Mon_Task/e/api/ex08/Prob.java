package d240805_Mon_Task.e.api.ex08;
// W2 D11 Task4

import java.util.Vector;

public class Prob {
	
	private static String[] splitedString;
	
	private static String[] stringSplit(String str, String splitter, int caseNum) {
		
		switch (caseNum) {
			case 1:	// Sting.split() 활용
				splitedString = str.split(splitter);
				
				return splitedString;
			
			case 2:	// 문자열 구분 기준 개수를 세어서 String[]를 만들어 넣기
				int splitterCount = 1;
				
				for (int i = 0; i < str.length(); i++) {
					
					if ((str.charAt(i)+"").equals(splitter)) {
						splitterCount++;
					}// if
				}// for
				
				splitedString = new String[splitterCount];
				String s = "";
				int index = 0;
				
				for (int j = 0; j < str.length(); j++) {
					if ((str.charAt(j)+"").equals(splitter)) {
						splitedString[index] = s;
						index++;
						s= "";
					}else {
						s += str.charAt(j);
					}// if else
				}// for
				
				splitedString[index] = s;

				return splitedString;
			
			case 3:	// Vector로 만든후 String[]로 변환하여 반환 
				Vector<String> strV = new Vector<String>();
				s = "";
				
				for (int k = 0; k < str.length(); k++) {
					if ((str.charAt(k)+"").equals(splitter)) {
						strV.add(s);
						s = "";
					}else {
						s += str.charAt(k);
					}// if else
				}// for
				
				strV.add(s);
				splitedString = new String[strV.size()];
				strV.toArray(splitedString);
				
				return splitedString;
				
			default:
				System.out.println("1~3의 정수를 입력해주세요.");
				
				return null;
				
		}//switch end

	}// method end

	// Main Method
	public static void main(String[] args) {
		
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String a = "	0		1		2	  3		4";
		
		System.out.println("=== 문자열 처리 결과 1 ===");
		String[] strs = stringSplit(str, "#", 1);
		for (String s: strs) {
			System.out.println(s);
		}
		System.out.println("========= end =========\n");
		
		System.out.println("=== 문자열 처리 결과 2 ===");
		strs = stringSplit(str, "#", 2);
		for (String s: strs) {
			System.out.println(s);
		}
		System.out.println("========= end =========\n");
		
		System.out.println("=== 문자열 처리 결과 3 ===");
		strs = stringSplit(str, "#", 3);
		for (String s: strs) {
			System.out.println(s);
		}
		System.out.println("========= end =========\n");

	}// main end

}
// class end
