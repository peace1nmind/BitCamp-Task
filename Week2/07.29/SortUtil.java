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

		System.out.println("[������ �迭 �����ϱ�]");
		System.out.print("�����ϰ� ���� �迭�� ũ��(�ڿ���)�� �����ּ���(2�̻�) : ");

		while (true)
		{
			try
			{
				max = keyboard.nextInt();
				if (max>1)
				{
					break;
				}else {
					System.out.print("[!] 2�̻��� ���� �Է����ּ��� : ");
				}
			}
			catch (Exception e)
			{
				System.out.print("[!] �ڿ��� ���� �Է����ּ��� : ");
				keyboard.next();
			}
		}
		
		inputNumbers = new int[max];

		// �� �Է¹ޱ�
		System.out.println();

		for (int a=0; a<max; a++)
		{
			System.out.print("�迭�� "+(a+1)+"��° ���� �Է� : ");
			try
			{
				inputNum = keyboard.nextInt();
			}
			catch (Exception e)
			{
				System.out.println("�������� �Է����ּ���.");
				keyboard.next();
			}

			inputNumbers[a] = inputNum;
			
		}

		// ��� ����		
		System.out.print("\n�Է� �迭 : int[] inputNumbers = {");

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

		System.out.print("���ϰ� : {");
		
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
