// package a.base.ex06;
// W1 D5 Task3
// array의 내용 인수로 받아서도 가능하게 수정 필요

import java.util.Scanner;

public class  Prob06
{	
	// Method
	public int[] ascending(int[] inputNums)
	{
		for (int i=0; i<inputNums.length-1; i++)
		{
			for (int j=i+1; j<inputNums.length; j++)
			{
				int num1= inputNums[i];
				int num2= inputNums[j];
				if (num1>num2)
				{
					inputNums[i] = num2;
					inputNums[j] = num1;
				}
			}
		}
		
		return inputNums;
	}


	// Main Method
	public static void main(String[] args) 
	{	
		int[] array = {3, 24, 1, 55, 17, 43, 5};

		Prob06 prob = new Prob06();
		Scanner keyboard = new Scanner(System.in);

		/*
		String StringInputNums = keyboard.nextLine();
		*/

		// 배열 정렬 이전 내용 출력문
		System.out.print("[배열의 내용]\n");
		for (int before=0; before<array.length; before++)
		{
			System.out.print((before == array.length-1) ? array[before] : (array[before]+", "));
		}

		array = prob.ascending(array);
		
		// 배열 정렬 이후 내용 출력문
		System.out.print("\n[클래스 실행결과]\n");
		for (int after=0; after<array.length; after++)
		{
			System.out.print((after == array.length-1) ? (array[after]+"\n") : (array[after]+", "));
		}
	}


}
