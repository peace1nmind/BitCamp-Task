// package a.base.ex04;
// W1 D5 Task1

import java.util.Scanner;

public class  Prob04
{	
	// Main Method
	public static void main(String[] args) 
	{	
		// 1~1000까지의 수 중 inputInt의 배수의 개수와 그 합을 계산
		Scanner keyboard = new Scanner(System.in);
		int inputInt = 0;

		while (true)
		{
			keyboard = new Scanner(System.in);
			inputInt = 0;

			System.out.print("양의 정수를 입력하세요 : ");

			try
			{
				inputInt = keyboard.nextInt();
				break;
			}// try end
			catch (Exception e)
			{
				System.out.println("정수값을 입력해주세요.\n");
			}// catch end
		}// while end
		
		// 배수의 개수
		int multipleCount = 1000/inputInt;
		// 배수의 합
		int sum = inputInt*((multipleCount*(multipleCount+1))/2);

		System.out.println("\n"+inputInt+"의 배수 개수 = "+multipleCount);
		System.out.println(inputInt+"의 배수 합 = "+sum);
	}// main end	
}// class end
