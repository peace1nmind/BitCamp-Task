// package c.modeling.ex01.ans;
// W2 D7 Task3

public class  Rectangle
{	
	// Field
	private int width;
	private int length;
	private String color;

	// Constructor
	public Rectangle() {
	}
	
	/*
	public Rectangle(String[] strArray) {
		color = strArray[0];
		width = Integer.parseInt(strArray[1]);
		length = Integer.parseInt(strArray[2]);
	}
	*/

	// Method
	public int area() {
		return width*length;
	}

	public int perimiter() {
		return 2*(width+length);
	}

	// Setter
	public void setWidth(int width) {
		this.width = width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Getter
	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	public String getColor() {
		return color;
	}
	
}// public class end
