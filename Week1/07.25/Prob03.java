 // package a.base.ex03;

import java.util.Scanner;

public class  Prob03
{
	public static void main(String[] args) 
	{	
		int inputInt;
		while (true)
		{
			Scanner keyboard = new Scanner(System.in);
			inputInt=0;

			System.out.println("1���� ũ�� 10���� ���� ������ �Է��ϼ���.(2~9)");
			
			// try-chatch ������ ������ �ƴ� Ÿ���� ������ �� ���� �ذ�
			try
			{
				inputInt = keyboard.nextInt();
				break;
			}// try end
			catch (Exception e)
			{
				System.out.println("���� ���·� ���� �Է����ּ���");

			}// catch end
		}

		System.out.println();

		if (1<inputInt && inputInt<10)
		{
			for (int num=1; num<=inputInt; num++)
			{
				int factorial = 1;

				// ���丮�� ���
				for (int i = 1; i<=num; i++)
				{
					factorial *= i;
				}// inner for end

				System.out.println(num+"! = "+factorial);

			}// outer for end
		}// if end
		else
		{
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}
	}
}
