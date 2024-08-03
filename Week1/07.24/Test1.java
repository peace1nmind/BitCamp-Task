// package jb01.test;

/* 
	1. 이름과 전화번호를 입력받고 출력하는 예제
	FileName : Test1.java
*/
public class Test1 {

	public static void main(String[] args) {
		
		// 실행예> java Test1 홍길동 011-111-1111
		System.out.println("나의 이름은 \""+args[0]+"\"입니다.");
		System.out.println("\""+args[0]+"\"씨의 [hp]는 \""+args[1]+"\"입니다.");
		

		String name = args[0];
		String phone = args[1];

		System.out.println("\n나의 이름은 \""+name+"\"입니다.");
		System.out.println("\""+name+"\"씨의 [hp]는 \""+phone+"\"입니다.");
		
	}

}
