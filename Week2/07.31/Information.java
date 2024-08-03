// package c.modeling.ex03;
// W2 D8 Task2 

public class  Information
	{	
	// Field
	private String name;
	private int age;

	// Constructor
	public Information() {
	}

	public Information(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Method
	public void print() {
		System.out.print("이\t름 : "+name+"\t나 이 : "+age+"\t");
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public Information getInstance() {
		return this;
	}
	
}// public class end
