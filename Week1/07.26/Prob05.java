// package a.base.ex05;
// W1 D5 Task2

import java.util.Scanner;

public class  Prob05
{	
	public static int cube(int i){
		return i*i*i;
	}

	// Main Method
	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);
		int inputInt = 0;
		
		while (true)
		{
			keyboard = new Scanner(System.in);
			inputInt = 0;

			System.out.print("자연수 값을 입력해주세요 : ");

			try
			{
				inputInt = keyboard.nextInt();
				break;
			}// try end
			catch (Exception e)
			{
				System.out.println("Data Type Error: 자연수가 아닌 값을 입력했습니다. 다시 입력해주세요.\n");
			}// catch end
		}
		
		System.out.println(inputInt);

		int dif = 0;
		int sum = 0;
		int difSum=0;
		
		// An 횟수 n값 1~입력값까지
		for (int a=1; a<=inputInt; a++)
		{	
			dif = a;

			for (int b=a; b<inputInt; b++)
			{
				difSum += dif;
			}
		}
		sum = inputInt + difSum;
		System.out.println("\n"+inputInt+"번째까지의 합 : "+sum);
		
		// 수학식
		int result = (cube(inputInt)+5*inputInt)/6;
		System.out.println("\n"+inputInt+"번째까지의 합 : "+result);

	}
}
