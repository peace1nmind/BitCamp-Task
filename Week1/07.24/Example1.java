// package jb01.test;

/* 
	4. 숫자를 입력받아 (1~100) 90이상 수, 80점 이상 우, 70점 이상 미, 60점 이상 양
		그 이하는 가를 출력하기
		(입력한 값이 0~100상이어야한다. 그 이상 그 이하일 경우 어떻게 처리할 것인가)
	FileName : Example1.java
*/
public class Example1 {

	public static void main(String[] args) {
		
		// 실행예>java Example1 95
		int score = Integer.parseInt(args[0]);


		// if문 사용
//		if (score>100 | score<0) {
//			System.out.println("0~100 상의 값을 입력해주세요.");
//		} else if (score>=90) {
//			System.out.println("입력하신 값 "+score+"점은 수입니다.");
//		} else if (score>=80) {
//			System.out.println("입력하신 값 "+score+"점은 우입니다.");
//		} else if (score>=70) {
//			System.out.println("입력하신 값 "+score+"점은 미입니다.");
//		} else if (score>=60) {
//			System.out.println("입력하신 값 "+score+"점은 양입니다.");
//		} else {
//			System.out.println("입력하신 값 "+score+"점은 가입니다.");
//		}
		
		// switch문 사용
		if (score/10.0>10 | score/10.0<0)
		{
			System.out.println("0~100 상의 값을 입력해주세요.");
		}else {
			int caseNum = score/10;
			switch (caseNum)
			{
			case 9:
				System.out.println("입력하신 값 "+score+"점은 수입니다.");
				break;
			case 8:
				System.out.println("입력하신 값 "+score+"점은 우입니다.");
				break;
			case 7:
				System.out.println("입력하신 값 "+score+"점은 미입니다.");
				break;
			case 6:
				System.out.println("입력하신 값 "+score+"점은 양입니다.");
				break;
			default:
				System.out.println("입력하신 값 "+score+"점은 가입니다.");
			}
		}
		
		
		
		
	}

}
