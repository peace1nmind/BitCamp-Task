// package jb01.test;

/* 
	1. �̸��� ��ȭ��ȣ�� �Է¹ް� ����ϴ� ����
	FileName : Test1.java
*/
public class Test1 {

	public static void main(String[] args) {
		
		// ���࿹> java Test1 ȫ�浿 011-111-1111
		System.out.println("���� �̸��� \""+args[0]+"\"�Դϴ�.");
		System.out.println("\""+args[0]+"\"���� [hp]�� \""+args[1]+"\"�Դϴ�.");
		

		String name = args[0];
		String phone = args[1];

		System.out.println("\n���� �̸��� \""+name+"\"�Դϴ�.");
		System.out.println("\""+name+"\"���� [hp]�� \""+phone+"\"�Դϴ�.");
		
	}

}
