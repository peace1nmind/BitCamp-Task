// package b.mehtod.ex01;
// W1 D6 Task3 

import java.util.Scanner;

public class  Prob09
{	
	public int abs(int a, int b) {
		return ((a<b) ? b-a : a-b);
	}

	// Main Method
	public static void main(String[] args) 
	{	
		
		System.out.println("[�� ���� �Է¹޾� ���� ���ϱ�]");
		System.out.print("ù��° ������ �Է����ּ���. : ");

		Scanner keyboard = new Scanner(System.in);
		int int1st = 0;
		int int2nd = 0;
		
		while (true)
		{
			try
			{
				int1st = keyboard.nextInt();
				break;
			}
			catch (Exception e)
			{
				System.out.print("\n�������� �ƴմϴ�. �ٽ� �Է����ּ���. : ");
				keyboard.next();
			}
		}
		
		System.out.print("\n�ι�° ������ �Է����ּ��� : ");

		while (true)
		{
			try
			{
				int2nd = keyboard.nextInt();
				break;
			}
			catch (Exception e)
			{
				System.out.print("\n�������� �ƴմϴ�. �ٽ� �Է����ּ���. : ");
				keyboard.next();
			}
		}
		
		System.out.println("\n�Է¹��� ���� "+int1st+", "+int2nd+"�Դϴ�");
		System.out.println("�� ���� ���� "+new Prob09().abs(int1st, int2nd));
		
	}// main end
	
}// public class end
