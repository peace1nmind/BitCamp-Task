package b.mehtod.ex12;

public class Prob {

	// Field

	// Method
	public static void printGugudan(int no) {
		if (no>0 && no<10) {
			for (int i = 1; i < 10; i++) {
				for (int j = 1; j <= no; j++) {
					if (j!=no) {
						System.out.print(j+"*"+i+"="+j*i+"\t");
					} else {
						System.out.println(j+"*"+i+"="+j*i);
					}
				}
			}
		} else {
			System.out.println("1 이상 9 이하의 값을 입력하셔야 합니다.");
		}
	}

	// Constructor
	public Prob() {
	}
	
	// Main Method
	public static void main(String[] args) {
		
		System.out.println("주어진 숫자까지의 구구단을 찍습니다.");
		System.out.println("------------ Sample 1 ------------");
		printGugudan(4);
		
		System.out.println("------------ Sample 1 ------------");
		printGugudan(9);
		
		System.out.println("------------ Sample 1 ------------");
		printGugudan(-1);
		
		System.out.println("------------ Sample 1 ------------");
		printGugudan(10);

	}// main end

}
// class end