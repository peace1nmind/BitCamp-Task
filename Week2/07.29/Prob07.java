// package a.base.ex07;
// W1 D6 Task1 

import java.util.Scanner;

public class  Prob07
{	
	/*
		����
		4�� ��� = ����
		4�� ��� & 100�� ��� = ����X
		100�� ��� & 400�� ��� = ����
	*/

	// Main Method
	public static void main(String[] args) 
	{	
		int year = 2010;
		int maxDate = 28;
		Scanner keyboard = new Scanner(System.in);
		
		///*
		// ���� �ޱ�
		while (true)
		{
			try
			{
				System.out.println("���� ������ �˰� ���� ������ �Է��ϼ���.");
				year = keyboard.nextInt();

				if (year<0)
				{
					System.out.println("������ ���� ���� ���� �Է��ؾ��մϴ�\n");
				} else {
					break;
				}
			}
			catch (Exception e)
			{
				System.out.println("�߸��� �Է°��Դϴ�. �ٽ� �Է����ּ���.\n");
				keyboard.next();
			}
		}// while end

		if ((year%4 == 0 && year%100 != 0) | (year%400==0))		// ������ ���
		{
			maxDate=29;
		}

		System.out.println("\n"+year+"�� 2�� ������ "+maxDate+"�� �Դϴ�.");
		
	}// main end
	
}// public class end
