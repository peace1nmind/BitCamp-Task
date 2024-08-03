// package a.base.ex01;
// 수정필요
import java.util.Scanner;

public class  Prob01
{
	public static void main(String[] args) 
	{	
		int inputInt;
		while (true)
		{	
			Scanner keyboard = new Scanner(System.in);
			inputInt=0;

			System.out.println("1보다 크고 10보다 작은 정수를 입력하세요.(2~9)");
			
			// try-chatch 문으로 정수가 아닌 타입이 들어왔을 때 문제 해결
			try
			{
				inputInt = keyboard.nextInt();
				break;
			}// try end
			catch (Exception e)
			{
				System.out.println("정수 형태로 값을 입력해주세요");
			}// catch end

		}// while end

			System.out.println();
		if (inputInt>1 && inputInt<10)
		{
			for (int i = 1; i<10; i++)
			{
				System.out.println(inputInt+" * "+i+" = "+(inputInt*i));
			}// for end
		}else
		{
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}// if - else end
		
	}// main end

}// Prob01 end
