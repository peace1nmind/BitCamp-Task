// package jb01.test;

/*
	2. 두수를 입력받고 두수를 비교하여 더하기/뺴기 예제
	FileName : Test2.java
*/
public class Test2 {

	public static void main(String[] args) {
		
		
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		
		// 실행예>java Test2 2 1
		System.out.print("첫번째 인수: "+first+", 두번째 인수: "+second+", ");
		System.out.print((first>second) ? 
			(+first+" - "+second+" = "+(first-second)) :
			(+second+" + "+first+" = "+(first+second))+"\n");
		
		
	}

}
