// package jb02.test;

public class  Example3
{
	public static void main(String[] args) 
	{	
		// 둘의 차이가 없을 경우
		// 정수로 변환하여 차이가 0일 때로 해도 가능
		if (args[0].equals(args[1]))
		{
			System.out.println("입력값이 같습니다 [usage]:: 서로 다른 값을 입력해주세요.");
		} else{
			// 시작 숫자
			int s = (Integer.parseInt(args[0])<Integer.parseInt(args[1])) ? Integer.parseInt(args[0]) : Integer.parseInt(args[1]);
			// 마지막 숫자
			int e = (Integer.parseInt(args[0])<Integer.parseInt(args[1])) ? Integer.parseInt(args[1]) : Integer.parseInt(args[0]);
			// 합계
			int sum = 0;

			for (int i=s; i<=e; i++)
			{
				sum += i;
			}

			System.out.println(s+" ~ "+e+"의 합은 "+sum+"입니다.");
		}
	}
}
