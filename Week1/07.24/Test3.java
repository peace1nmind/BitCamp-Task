// package jb01.test;

/*
	3. 두수를 입력받고 입력받은 수가 짝수, 홀수, 3의 배수를 판단하기
	FileName : Test3.java
*/
public class Test3 {

	public static void main(String[] args) {

		// 실행예> java Test3 10 15
		System.out.println("==========3항 연산자 사용==========");
		for (int i=0; i<args.length; i++)
		{
			int n = Integer.parseInt(args[i]);
			String evenOrOdd = (n%2==0) ? "짝수이며 " : "홀수이며 ";
			String multiples = (n%3==0) ? "3의 배수입니다." : "3의 배수가 아닙니다.";
			
			System.out.println("입력하신 "+(i+1)+"번째 인자값 "+n+"은 "+
				evenOrOdd+multiples);
			
		}

		//case1 : 짝수+3배수
		//case2 : 짝수+3배수X
		//case3 : 홀수+3배수
		//case4 : 짝수+3배수X
		System.out.println("\n==========switch문 사용==========");

		for (int i=0; i<args.length; i++)
		{
			int n = Integer.parseInt(args[i]);
			int caseNum = (n%2==0) ? ((n%3==0) ? 1 : 2) : ((n%3==0) ? 3 : 4);

			switch (caseNum)
			{
			case 1:
				System.out.println("입력하신 "+(i+1)+"번째 인자값 "+n+"은 짝수이며 3의 배수입니다.");
				break;
			case 2:
				System.out.println("입력하신 "+(i+1)+"번째 인자값 "+n+"은 짝수이며 3의 배수가 아닙니다.");
				break;
			case 3:
				System.out.println("입력하신 "+(i+1)+"번째 인자값 "+n+"은 홀수이며 3의 배수입니다.");
				break;
			case 4:
				System.out.println("입력하신 "+(i+1)+"번째 인자값 "+n+"은 홀수이며 3의 배수가 아닙니다.");
				break;
			}
		}
		


	}

}
