// package jb01.test;

/*
	2. �μ��� �Է¹ް� �μ��� ���Ͽ� ���ϱ�/���� ����
	FileName : Test2.java
*/
public class Test2 {

	public static void main(String[] args) {
		
		
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		
		// ���࿹>java Test2 2 1
		System.out.print("ù��° �μ�: "+first+", �ι�° �μ�: "+second+", ");
		System.out.print((first>second) ? 
			(+first+" - "+second+" = "+(first-second)) :
			(+second+" + "+first+" = "+(first+second))+"\n");
		
		
	}

}
