// package c.modeling.ex01;
// W2 D7 Task3

import java.util.Scanner;
//import c.modeling.ex01.ans.Rectangle;

public class  TestRectangle
{	
	
	// Main Method
	public static void main(String[] args) 
	{	
		
		Scanner keyboard = new Scanner(System.in);
		
		//String[] fieldValue = new String[3];
		String[] fields	= {"����", "����", "����"};

		Rectangle rec1 = new Rectangle();
		System.out.println("ù��° ���簢���� "+fields[0]);
		rec1.setColor(keyboard.next());

		System.out.println("ù��° ���簢���� "+fields[1]);
		rec1.setWidth(keyboard.nextInt());

		System.out.println("ù��° ���簢���� "+fields[2]);
		rec1.setLength(keyboard.nextInt());

		Rectangle rec2 = new Rectangle();
		System.out.println("\n�ι�° ���簢���� "+fields[0]);
		rec2.setColor(keyboard.next());

		System.out.println("�ι�° ���簢���� "+fields[1]);
		rec2.setWidth(keyboard.nextInt());

		System.out.println("�ι�° ���簢���� "+fields[2]);
		rec2.setLength(keyboard.nextInt());

		System.out.println("\n"+rec1.getColor()+" ���簢���� ���̴� "+rec1.area()+
									"�̰� �ѷ��� "+rec1.perimiter()+"�Դϴ�");

		System.out.println(rec2.getColor()+" ���簢���� ���̴� "+rec2.area()+
									"�̰� �ѷ��� "+rec2.perimiter()+"�Դϴ�");
		
	}// main end
	
}// public class end
