// package jb01.test;

/* 
	4. ���ڸ� �Է¹޾� (1~100) 90�̻� ��, 80�� �̻� ��, 70�� �̻� ��, 60�� �̻� ��
		�� ���ϴ� ���� ����ϱ�
		(�Է��� ���� 0~100���̾���Ѵ�. �� �̻� �� ������ ��� ��� ó���� ���ΰ�)
	FileName : Example1.java
*/
public class Example1 {

	public static void main(String[] args) {
		
		// ���࿹>java Example1 95
		int score = Integer.parseInt(args[0]);


		// if�� ���
//		if (score>100 | score<0) {
//			System.out.println("0~100 ���� ���� �Է����ּ���.");
//		} else if (score>=90) {
//			System.out.println("�Է��Ͻ� �� "+score+"���� ���Դϴ�.");
//		} else if (score>=80) {
//			System.out.println("�Է��Ͻ� �� "+score+"���� ���Դϴ�.");
//		} else if (score>=70) {
//			System.out.println("�Է��Ͻ� �� "+score+"���� ���Դϴ�.");
//		} else if (score>=60) {
//			System.out.println("�Է��Ͻ� �� "+score+"���� ���Դϴ�.");
//		} else {
//			System.out.println("�Է��Ͻ� �� "+score+"���� ���Դϴ�.");
//		}
		
		// switch�� ���
		if (score/10.0>10 | score/10.0<0)
		{
			System.out.println("0~100 ���� ���� �Է����ּ���.");
		}else {
			int caseNum = score/10;
			switch (caseNum)
			{
			case 9:
				System.out.println("�Է��Ͻ� �� "+score+"���� ���Դϴ�.");
				break;
			case 8:
				System.out.println("�Է��Ͻ� �� "+score+"���� ���Դϴ�.");
				break;
			case 7:
				System.out.println("�Է��Ͻ� �� "+score+"���� ���Դϴ�.");
				break;
			case 6:
				System.out.println("�Է��Ͻ� �� "+score+"���� ���Դϴ�.");
				break;
			default:
				System.out.println("�Է��Ͻ� �� "+score+"���� ���Դϴ�.");
			}
		}
		
		
		
		
	}

}
