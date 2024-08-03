package d240805_Mon_Task.e.api.ex05;
// W2 D11 Task3

public class StringUtil {

	// Field
	

	// Constructor
	public StringUtil() {
	}
	
	// Method
	public static String replaceString(String[] arr) {
		
		int maxIndex = 0;
		int maxCount = 0;
		int charCount = 0;
		
		String str = "";
		
		for (int i = 0; i < arr.length; i++) {
			str = arr[i];
			for (int j = 0; j < str.length(); j++) {
				charCount = 0;
				
				if('a'==str.charAt(j)) {
					charCount++;
				}
				
				if (charCount>maxCount) {
					maxCount = charCount;
					maxIndex = i;
				}
			}
		}
		
		if (maxCount!=0) {
			String result = arr[maxIndex].replace('a', 'A');
			return result;
		} else {
			System.out.println("a�� ���� ���� ���ڿ��� �����ϴ�");
			return null;
		}
		
	}
	
	public static String replaceString(String[] arr, String target) {
		
		int maxIndex = 0;
		int maxCount = 0;
		int charCount = 0;
		
		String str = "";
		
		for (int i = 0; i < arr.length; i++) {
			str = arr[i];
			for (int j = 0; j < str.length(); j++) {
				charCount = 0;
				
				if(target.equals(str.charAt(j)+"")) {
					charCount++;
				}
				
				if (charCount>maxCount) {
					maxCount = charCount;
					maxIndex = i;
				}
			}
		}
		
		if (maxCount!=0) {
			String result = arr[maxIndex].replaceAll(target, target.toUpperCase());
			return result;
		}else {
			System.out.println(target+"�� ���� ���� ���ڿ��� �����ϴ�.");
			return null;
		}
		
		
	}
	
	
	// Main Method
	public static void main(String[] args) {

		String[] arr = {"java program", "array", "java program area", "append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("����� ���ڿ� : "+result);
		
		result = StringUtil.replaceString(arr, "b");
		System.out.println("����� ���ڿ� : "+result);

	}// main end

}
// class end
