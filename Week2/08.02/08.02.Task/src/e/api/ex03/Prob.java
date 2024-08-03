package e.api.ex03;

public class Prob {

	// Field

	// Constructor
	public Prob() {
	}

	// Method
	public String leftPad(String str, int size, char padChar) {
		
		if (size > str.length()) {
			String padString = "";
			
			for (int i = 0; i < size - str.length(); i++) {
				padString += padChar;
			}
			
			return padString+" "+str;
		} else {
			return str;
		}
		
	}
	
	// Main Method
	public static void main(String[] args) {

		Prob prob3 = new Prob();
		
		System.out.println(prob3.leftPad("Abc", 6, '#'));
		System.out.println(prob3.leftPad("ABC", 5, '$'));
		System.out.println(prob3.leftPad("ABC", 2, '&'));

	}// main end

}
// class end