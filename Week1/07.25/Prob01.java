// package a.base.ex01;
// �����ʿ�
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
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}// if - else end
		
	}// main end

}// Prob01 end
