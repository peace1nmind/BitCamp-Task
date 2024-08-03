// package d.inheritance.ex02;
// W2 D9 Task1

public class  Circle extends Shape
{	
	// Field
	private double radius;
	
	// Constructor
	public Circle() {
	}

	public Circle(String name, int radius) {
		super.setName(name);
		this.radius = radius;
	}
	
	// Method
	public void calculationArea() {
		super.setArea(Math.pow(radius, 2)*Math.PI);
	}
	
	// Setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Getter
	public double getRadius() {
		return radius;
	}
	
}// class end
