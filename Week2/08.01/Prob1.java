// package e.api.ex01;
// W2 D9 Task2 

public class  Prob1
{	
	// Field
	
	
	// Constructor
	public Prob1() {
	}
	
	// Method
	// " "ÀÇ ASCII code= 32
	public static String encoding(String sourceString) {

			int ascii = 0;
			char splitedString = 'a';
			String encodedString = "";
		
			char[] encodedCharArray = new char[sourceString.length()];

			for (int i=0; i<sourceString.length(); i++)
			{	
				
				ascii = (int) sourceString.charAt(i);

				if (ascii != 32)
				{
					ascii +=3;
					splitedString = (char) ascii;
					encodedCharArray[i] = splitedString;
				}else {
					splitedString = (char) ascii;
					encodedCharArray[i] = splitedString;
				}
			}

			for (char c : encodedCharArray)
			{
				encodedString+=c;
			}

		return encodedString;
	}
	
}// class end
