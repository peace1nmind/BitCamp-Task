// package e.api.ex01;
// W2 D9 Task2s

public class  Prob
{
	// Main Method
	public static void main(String[] args) 
	{	
		String sourceString = "everyday we have is one moer than we deserve";
		String encodedString = "";

		
		encodedString = new Prob1().encoding(sourceString);

		System.out.println("암호화할 문자열 : "+sourceString);
		System.out.println("암호화된 문자열 : "+encodedString);
	
	}// main end
	
}// class end
