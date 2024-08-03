// package d.inheritance.ex02;
// W2 D9 Task1

abstract class  Shape
{	
	// Field
	protected double area;
	private String name;
	
	// Constructor
	public Shape() {
	}
	
	public Shape(String name) {
	}
	
	// Method
	public abstract void calculationArea();
	
	public void print() {
		System.out.println(name+"의 면적은 "+area);
	}

	// Setter
	public void setArea(double area) {
		this.area = area;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Getter
	public double getArea() {
		return area;
	}

	public String getName() {
		return name;
	}
	
}// class end
