// package b.method.ex05;
// W1 D6 Task4

import java.util.Scanner;

public class  SortUtil
{	
	// Method
	public int[] ascending(int[] inputNumbers) {
		for (int i=0; i<inputNumbers.length-1; i++)
		{
			for (int j=i+1; j<inputNumbers.length; j++)
			{
				int n1 = inputNumbers[i];
				int n2 = inputNumbers[j];

				if (n1>n2)
				{
					inputNumbers[i] = n2;
					inputNumbers[j] = n1;
				}
			}
		}

		return inputNumbers;
	}
	
	// Main Method
	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);
		int max = 1;
		int[] inputNumbers;
		int inputNum = 0;

		System.out.println("[정수형 배열 정렬하기]");
		System.out.print("정렬하고 싶은 배열의 크기(자연수)를 정해주세요(2이상) : ");

		while (true)
		{
			try
			{
				max = keyboard.nextInt();
				if (max>1)
				{
					break;
				}else {
					System.out.print("[!] 2이상의 값을 입력해주세요 : ");
				}
			}
			catch (Exception e)
			{
				System.out.print("[!] 자연수 값을 입력해주세요 : ");
				keyboard.next();
			}
		}
		
		inputNumbers = new int[max];

		// 값 입력받기
		System.out.println();

		for (int a=0; a<max; a++)
		{
			System.out.print("배열의 "+(a+1)+"번째 정수 입력 : ");
			try
			{
				inputNum = keyboard.nextInt();
			}
			catch (Exception e)
			{
				System.out.println("정수값을 입력해주세요.");
				keyboard.next();
			}

			inputNumbers[a] = inputNum;
			
		}

		// 출력 시작		
		System.out.print("\n입력 배열 : int[] inputNumbers = {");

		for (int a=0; a<inputNumbers.length; a++)
		{
			if (a != inputNumbers.length-1)
			{
				System.out.print(inputNumbers[a]+", ");
			}else {
				System.out.println(inputNumbers[a]+"};");
			}
			
		}

		new SortUtil().ascending(inputNumbers);

		System.out.print("리턴값 : {");
		
		for (int c=0; c<inputNumbers.length; c++)
		{
			if (c != inputNumbers.length-1)
			{
				System.out.print(inputNumbers[c]+", ");
			}else {
				System.out.println(inputNumbers[c]+"}");
			}
		}
	
	}// main end
	
}// public class end
