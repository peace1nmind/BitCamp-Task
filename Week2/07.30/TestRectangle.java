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
		String[] fields	= {"색깔", "가로", "세로"};

		Rectangle rec1 = new Rectangle();
		System.out.println("첫번째 직사각형의 "+fields[0]);
		rec1.setColor(keyboard.next());

		System.out.println("첫번째 직사각형의 "+fields[1]);
		rec1.setWidth(keyboard.nextInt());

		System.out.println("첫번째 직사각형의 "+fields[2]);
		rec1.setLength(keyboard.nextInt());

		Rectangle rec2 = new Rectangle();
		System.out.println("\n두번째 직사각형의 "+fields[0]);
		rec2.setColor(keyboard.next());

		System.out.println("두번째 직사각형의 "+fields[1]);
		rec2.setWidth(keyboard.nextInt());

		System.out.println("두번째 직사각형의 "+fields[2]);
		rec2.setLength(keyboard.nextInt());

		System.out.println("\n"+rec1.getColor()+" 직사각형의 넓이는 "+rec1.area()+
									"이고 둘레는 "+rec1.perimiter()+"입니다");

		System.out.println(rec2.getColor()+" 직사각형의 넓이는 "+rec2.area()+
									"이고 둘레는 "+rec2.perimiter()+"입니다");
		
	}// main end
	
}// public class end
