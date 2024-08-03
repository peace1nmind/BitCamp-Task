// package b.method.ex06;
// W2 D7 Task2

import java.util.Scanner;

public class  FactorialUtil
{	
	int f =1;
	
	// Method
	public int factorial(int n) {
		
		if (n>2)
		{
			f *= n--;
			return factorial(n);
		}else
		{
			return f;
		}

	}
	
	
	// Main Method
	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);
		int num = 0;
		
		System.out.println("1이상의 정수를 입력해주세요");
		while (true)
		{
			try
			{
				num = keyboard.nextInt();
				if (num>0)
				{
					break;
				}
			}
			catch (Exception e)
			{
				keyboard.next();
			}
			System.out.println("\n1이상의 정수를 입력해주세요");
		}
		
		System.out.print("\ninput= "+num+", ");
		System.out.print("Result= "+new FactorialUtil().factorial(num)+"\t(");

		if (num == 1)
		{
			System.out.println("1*1)");
		}else {

			for (int i=num; i>=1; i--)
			{	
				if (i != 1)
				{
					System.out.print(i+"*");
				} else {
					System.out.println(i+")");
				}
			}
		}
		/*
		
		
		*/
	
	}// main end
	
}// public class end
