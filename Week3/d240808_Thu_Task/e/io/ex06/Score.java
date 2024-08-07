package d240808_Thu_Task.e.io.ex06;
// W3 D14 Task3-1

public class Score {

	// Field
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	
	
	// Constructor
	public Score(String name, int kor, int eng, int math, int sum) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
	}
	
	
	// Method
	public void printScore() {
		System.out.println(this.getName()+" : "
				+this.getKor()+" "+this.getEng()+" "
				+this.getMath()+" "+this.getSum());
	}

	
	// Getter, Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
// class end
