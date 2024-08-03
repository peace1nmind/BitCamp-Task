// package c.modeling.ex03;
// W2 D8 Task2-1

class Student
{	
	// Field
	private String name;
	private int age;
	private int id;

	// Constructor
	public Student() {
	}

	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	// Method
	public void print() {
		System.out.print("이\t름 : "+name+"\t나 이 : "+age+"\t");
		System.out.println("학\t번 : "+id);
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}
	
}


class Teacher
{	
	// Field
	private String name;
	private int age;
	private String subject;

	// Constructor
	public Teacher() {
	}

	public Teacher(String name, int age,String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	// Method
	public void print() {
		System.out.print("이\t름 : "+name+"\t나 이 : "+age+"\t");
		System.out.println("담당과목 : "+subject);
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	// Getter
	public String getSubject() {
		return subject;
	}
	
}


class Employee
{	
	// Field
	private String name;
	private int age;
	private String dept;

	// Constructor
	public Employee() {
	}

	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	// Method
	public void print() {
		System.out.print("이\t름 : "+name+"\t나 이 : "+age+"\t");
		System.out.println("부\t서 : "+dept);
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	// Getter
	public String getDept() {
		return dept;
	}
	
}

public class  Prob01
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
