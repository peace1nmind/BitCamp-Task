// package jb02.test;

public class  Example2
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);

		if (i>=10 | i<=0)
		{
			System.out.println("1~9까지의 값을 입력해주세요.");
		}else {
			System.out.println(i+" 단을 출력합니다.");

			for (int j=1; j<10; j++)
			{
				System.out.println(j+" * "+i+" = "+j*i);
			}
		}
		
		
	}
}
