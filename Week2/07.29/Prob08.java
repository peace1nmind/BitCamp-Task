// package a.base.ex08;
// W1 D6 Task2

import java.util.Scanner;

public class  Prob08
{	
	// Main Method
	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);
		int inputInt = 0;
		int space = 0;

		while (true)
		{
			try
			{
				System.out.println("0보다 큰 홀수를 입력해주세요.");
				inputInt = keyboard.nextInt();

				if (inputInt > 0 && inputInt%2 != 0)
				{
					break;
				} else {
					System.out.println("0보다 큰 홀수만 입력 가능합니다\n");
				}
				
			}
			catch (Exception e)
			{
				System.out.println("잘못된 입력값입니다. 다시 입력해주세요.\n");
				keyboard.next();
			}
		}// while end

		System.out.println();
		
		// i는 별의 개수
		for (int i=1; i<=inputInt; i+=2)
		{	
			// 스페이스바 개수
			space = (inputInt-i)/2;

			for (int j=1; j<=inputInt; j++)
			{
				if (j<=space || (inputInt-space)<j)
				{
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}

			System.out.println();
		}
		
		/*
		
		
		*/
	
	}// main end
	
}// public class end
