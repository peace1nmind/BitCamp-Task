// package jb02.test;

public class  Example5
{
	public static void main(String[] args) 
	{
		// 9x9 String 행렬 선언
		String[][] text = new String[9][9];

		for (int i=1; i<10; i++)
		{
			System.out.println(i+"단을 출력합니다.");

			for (int j=1; j<10; j++)
			{
				text[i-1][j-1] = i+" * "+j+" = "+(i*j);
				System.out.println("text["+(i-1)+"]["+(j-1)+"] : "+text[i-1][j-1]);
			}
			System.out.println("\n=========================");
		}
	}
}
