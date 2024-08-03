// package d.inheritance.ex02;
// W2 D9 Task1

// 직사각형
public class  Rectangular extends Shape
{	
	// Field
	private double width;
	private double hight;
	
	// Constructor
	public Rectangular() {
	}

	public Rectangular(String name, int width, int hight) {
		super.setName(name);
		this.width = width;
		this.hight = hight;
	}
	
	// Method
	public void calculationArea() {
		super.setArea(width*hight);
	}
	
	// Setter
	public void setWidth(double width) {
		this.width = width;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}
	
	// Getter
	public double getWidth() {
		return width;
	}
	
	public double getHight() {
		return hight;
	}

}// class end
