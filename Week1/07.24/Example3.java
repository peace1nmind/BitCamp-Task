// package jb02.test;

public class  Example3
{
	public static void main(String[] args) 
	{	
		// ���� ���̰� ���� ���
		// ������ ��ȯ�Ͽ� ���̰� 0�� ���� �ص� ����
		if (args[0].equals(args[1]))
		{
			System.out.println("�Է°��� �����ϴ� [usage]:: ���� �ٸ� ���� �Է����ּ���.");
		} else{
			// ���� ����
			int s = (Integer.parseInt(args[0])<Integer.parseInt(args[1])) ? Integer.parseInt(args[0]) : Integer.parseInt(args[1]);
			// ������ ����
			int e = (Integer.parseInt(args[0])<Integer.parseInt(args[1])) ? Integer.parseInt(args[1]) : Integer.parseInt(args[0]);
			// �հ�
			int sum = 0;

			for (int i=s; i<=e; i++)
			{
				sum += i;
			}

			System.out.println(s+" ~ "+e+"�� ���� "+sum+"�Դϴ�.");
		}
	}
}
