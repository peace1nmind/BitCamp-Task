// package b.mehtod.ex01;
// W1 D6 Task3 

import java.util.Scanner;

public class  Prob09
{	
	public int abs(int a, int b) {
		return ((a<b) ? b-a : a-b);
	}

	// Main Method
	public static void main(String[] args) 
	{	
		
		System.out.println("[두 수를 입력받아 차이 구하기]");
		System.out.print("첫번째 정수를 입력해주세요. : ");

		Scanner keyboard = new Scanner(System.in);
		int int1st = 0;
		int int2nd = 0;
		
		while (true)
		{
			try
			{
				int1st = keyboard.nextInt();
				break;
			}
			catch (Exception e)
			{
				System.out.print("\n정수값이 아닙니다. 다시 입력해주세요. : ");
				keyboard.next();
			}
		}
		
		System.out.print("\n두번째 정수를 입력해주세요 : ");

		while (true)
		{
			try
			{
				int2nd = keyboard.nextInt();
				break;
			}
			catch (Exception e)
			{
				System.out.print("\n정수값이 아닙니다. 다시 입력해주세요. : ");
				keyboard.next();
			}
		}
		
		System.out.println("\n입력받은 값은 "+int1st+", "+int2nd+"입니다");
		System.out.println("두 수의 차는 "+new Prob09().abs(int1st, int2nd));
		
	}// main end
	
}// public class end
