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

			System.out.print("�ڿ��� ���� �Է����ּ��� : ");

			try
			{
				inputInt = keyboard.nextInt();
				break;
			}// try end
			catch (Exception e)
			{
				System.out.println("Data Type Error: �ڿ����� �ƴ� ���� �Է��߽��ϴ�. �ٽ� �Է����ּ���.\n");
			}// catch end
		}
		
		System.out.println(inputInt);

		int dif = 0;
		int sum = 0;
		int difSum=0;
		
		// An Ƚ�� n�� 1~�Է°�����
		for (int a=1; a<=inputInt; a++)
		{	
			dif = a;

			for (int b=a; b<inputInt; b++)
			{
				difSum += dif;
			}
		}
		sum = inputInt + difSum;
		System.out.println("\n"+inputInt+"��°������ �� : "+sum);
		
		// ���н�
		int result = (cube(inputInt)+5*inputInt)/6;
		System.out.println("\n"+inputInt+"��°������ �� : "+result);

	}
}
