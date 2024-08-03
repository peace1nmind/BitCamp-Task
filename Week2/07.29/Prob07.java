// package a.base.ex07;
// W1 D6 Task1 

import java.util.Scanner;

public class  Prob07
{	
	/*
		조건
		4의 배수 = 윤년
		4의 배수 & 100의 배수 = 윤년X
		100의 배수 & 400의 배수 = 윤년
	*/

	// Main Method
	public static void main(String[] args) 
	{	
		int year = 2010;
		int maxDate = 28;
		Scanner keyboard = new Scanner(System.in);
		
		///*
		// 연도 받기
		while (true)
		{
			try
			{
				System.out.println("윤년 유무를 알고 싶은 연도를 입력하세요.");
				year = keyboard.nextInt();

				if (year<0)
				{
					System.out.println("연도는 양의 정수 값을 입력해야합니다\n");
				} else {
					break;
				}
			}
			catch (Exception e)
			{
				System.out.println("잘못된 입력값입니다. 다시 입력해주세요.\n");
				keyboard.next();
			}
		}// while end

		if ((year%4 == 0 && year%100 != 0) | (year%400==0))		// 윤년인 경우
		{
			maxDate=29;
		}

		System.out.println("\n"+year+"년 2월 말일은 "+maxDate+"일 입니다.");
		
	}// main end
	
}// public class end
