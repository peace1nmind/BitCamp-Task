// package a.base.ex04;
// W1 D5 Task1

import java.util.Scanner;

public class  Prob04
{	
	// Main Method
	public static void main(String[] args) 
	{	
		// 1~1000������ �� �� inputInt�� ����� ������ �� ���� ���
		Scanner keyboard = new Scanner(System.in);
		int inputInt = 0;

		while (true)
		{
			keyboard = new Scanner(System.in);
			inputInt = 0;

			System.out.print("���� ������ �Է��ϼ��� : ");

			try
			{
				inputInt = keyboard.nextInt();
				break;
			}// try end
			catch (Exception e)
			{
				System.out.println("�������� �Է����ּ���.\n");
			}// catch end
		}// while end
		
		// ����� ����
		int multipleCount = 1000/inputInt;
		// ����� ��
		int sum = inputInt*((multipleCount*(multipleCount+1))/2);

		System.out.println("\n"+inputInt+"�� ��� ���� = "+multipleCount);
		System.out.println(inputInt+"�� ��� �� = "+sum);
	}// main end	
}// class end
