// package jb01.test;

/*
	3. �μ��� �Է¹ް� �Է¹��� ���� ¦��, Ȧ��, 3�� ����� �Ǵ��ϱ�
	FileName : Test3.java
*/
public class Test3 {

	public static void main(String[] args) {

		// ���࿹> java Test3 10 15
		System.out.println("==========3�� ������ ���==========");
		for (int i=0; i<args.length; i++)
		{
			int n = Integer.parseInt(args[i]);
			String evenOrOdd = (n%2==0) ? "¦���̸� " : "Ȧ���̸� ";
			String multiples = (n%3==0) ? "3�� ����Դϴ�." : "3�� ����� �ƴմϴ�.";
			
			System.out.println("�Է��Ͻ� "+(i+1)+"��° ���ڰ� "+n+"�� "+
				evenOrOdd+multiples);
			
		}

		//case1 : ¦��+3���
		//case2 : ¦��+3���X
		//case3 : Ȧ��+3���
		//case4 : ¦��+3���X
		System.out.println("\n==========switch�� ���==========");

		for (int i=0; i<args.length; i++)
		{
			int n = Integer.parseInt(args[i]);
			int caseNum = (n%2==0) ? ((n%3==0) ? 1 : 2) : ((n%3==0) ? 3 : 4);

			switch (caseNum)
			{
			case 1:
				System.out.println("�Է��Ͻ� "+(i+1)+"��° ���ڰ� "+n+"�� ¦���̸� 3�� ����Դϴ�.");
				break;
			case 2:
				System.out.println("�Է��Ͻ� "+(i+1)+"��° ���ڰ� "+n+"�� ¦���̸� 3�� ����� �ƴմϴ�.");
				break;
			case 3:
				System.out.println("�Է��Ͻ� "+(i+1)+"��° ���ڰ� "+n+"�� Ȧ���̸� 3�� ����Դϴ�.");
				break;
			case 4:
				System.out.println("�Է��Ͻ� "+(i+1)+"��° ���ڰ� "+n+"�� Ȧ���̸� 3�� ����� �ƴմϴ�.");
				break;
			}
		}
		


	}

}
