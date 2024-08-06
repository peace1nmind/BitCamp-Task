package d240807_Wed_Task.e.api.ex11;
// W3 D13 Task2
// 한글 인코딩

public class Prob {

	// Field

	
	// Constructor
	public Prob() {
	}

	
	// Method
	public String toEncoding(String str) {
		
		byte[] ba = str.getBytes();
		String result = "";

		for (byte b: ba) {

			if (Integer.toHexString(b).length() == 8) {	// 한글인 경우
				result += "%"+Integer.toHexString(b).toUpperCase().substring(6);
			}else {	// 한글 아닌 경우 = 영어, 숫자
				result += (char) b;
			}
			
		}

		return result;
	}
	
	public void printInOut(String str) {
		System.out.println("입력 : "+str);
		System.out.println("출력 : "+new Prob().toEncoding(str));
	}
	
	
	// Main Method
	public static void main(String[] args) {

		Prob p1 = new Prob();
//		String[] strs = {"Korea", "홍길동", "홍 길 동", "Hong 길 동", "0319"};
//		
//		for (String str: strs) {
//			p1.printInOut(str);
//		}
		
		System.out.println("입력 : Korea");
		System.out.println("출력 : "+new Prob().toEncoding("Korea"));
		System.out.println("입력 : 홍길동");
		System.out.println("출력 : "+new Prob().toEncoding("홍길동"));
		System.out.println("입력 : 홍 길 동");
		System.out.println("출력 : "+new Prob().toEncoding("홍 길 동"));
		System.out.println("입력 : Hong 길 동");
		System.out.println("출력 : "+new Prob().toEncoding("Hong 길 동"));
		System.out.println("입력 : 0319");
		System.out.println("출력 : "+new Prob().toEncoding("0319"));

	}// main end

}
// class end
