// package a.base.ex02;

public class  Prob02
{
	public static void main(String[] args) 
	{	

		// ���1
		System.out.println("===== ��� 1 =====");

		for (int num=2; num<=50; num++)
		{
			int divisorCount = 0;

			for (int div=1; div<=num; div++)
			{
				if (num%div==0)
				{
					divisorCount++;
				}// if end

				if (divisorCount>2)
				{
					break;
				}

			}
			if (divisorCount==2)
			{
				System.out.println(num);
			}
		}

		// ���2
		System.out.println("\n===== ��� 2 =====");
		int limit=50;
		boolean prime;

		for (int num=2; num<=limit; num++)
		{	
			prime=true;

			for (int div=2; div<num; div++)
			{
				if (num%div==0)
				{
					prime=false;
					continue;
				}
			}

			if (prime)
			{
				System.out.println(num);
			}
		}
	}
}
