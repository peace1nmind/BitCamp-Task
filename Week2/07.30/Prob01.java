// package b. method.ex04;
// W2 D7 Task1

public class  Prob01
{	
	// Method
	public final void printSeason(int month) {

		String season;

		switch (month)
		{
		case 12:
		case 1:
		case 2: 
			season =  "�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;
		default:
			System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
			season = null;
			break;
		}
		
		if (season != null)
		{
			System.out.println(season+"�� �¾�̳׿�.");
		}
		

	}// printSeason end
	
	
	// Main Method
	public static void main(String[] args) 
	{	
		int month = Integer.parseInt(args[0]);

		new Prob01().printSeason(month);
	
	}// main end
	
}// public class end
