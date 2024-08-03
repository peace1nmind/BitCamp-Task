// package c.modeling.ex03;
// W2 D8 Task2-2

class Student extends Information
{	
	// Field
	private int id;

	// Constructor
	public Student() {
	}

	public Student(String name, int age) {
		super(name, age);
	}

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	// Method
	public void print() {
		super.print();
		System.out.println("학\t번 : "+id);
	}

	// Setter
	public void setId(int id) {
		this.id = id;
	}

	// Getter
	public int getId() {
		return id;
	}
	
}


class Teacher extends Information
{	
	// Field
	private String subject;

	// Constructor
	public Teacher() {
	}

	public Teacher(String name, int age,String subject) {
		super(name, age);
		this.subject = subject;
	}

	// Method
	public void print() {
		super.print();
		System.out.println("담당과목 : "+subject);
	}

	// Setter
	public void setSubject(String subject) {
		this.subject = subject;
	}

	// Getter
	public String getSubject() {
		return subject;
	}
	
}


class Employee extends Information
{	
	// Field
	private String dept;

	// Constructor
	public Employee() {
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	// Method
	public void print() {
		super.print();
		System.out.println("부\t서 : "+dept);
	}

	// Setter
	public void setDept(String dept) {
		this.dept = dept;
	}

	// Getter
	public String getDept() {
		return dept;
	}
	
}

public class  Prob02
{	
	// Main Method
	public static void main(String[] args) 
	{	
		Student s = new Student("홍길동", 20, 200201);
		Teacher t = new Teacher("이순신", 30, "JAVA");
		Employee e = new Employee("유관순", 40, "교무과");

		s.print();
		t.print();
		e.print();
		
		/*
		
		
		*/
	
	}// main end
	
}// public class end
