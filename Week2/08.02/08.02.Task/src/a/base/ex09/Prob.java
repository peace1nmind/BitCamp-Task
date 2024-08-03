package a.base.ex09;

public class Prob {

	// Field
	
	// Method
	public static void printAster(int lineCount) {
		// 최종 별의 개수 = lineCount*2 - 1 = (lineCount-1)*2 + 1
		
		for (int line = 1; line <= lineCount; line++) {

			for (int column = 1; column <= lineCount*2-1; column++) {
				
				if (column < lineCount-line+1 || column > lineCount+line-1) {
					System.out.print(" ");
				}else if (column > lineCount-line && column < lineCount+line) {
					System.out.print("*");
				}else if (column == lineCount*2-1) {
					if (line!=lineCount) {
						System.out.println(" ");
						System.out.println();
					}else {
						System.out.println("*");
					}
				}
			}// inner for end
			System.out.println();
		}// outer for end
		
	}// method end

	// Constructor
	public Prob() {
	}

	public static void main(String[] args) {
		
		int lineCount = 0;
		
		try {
			lineCount = Integer.parseInt(args[0]);
			
			if (lineCount<1) {
				System.out.println("1이상의 홀수를 입력해주세요.");
			} else if(lineCount%2==0) {
				System.out.println("홀수 값을 입력해주세요.");
			}
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
			System.out.println("인자 값을 숫자형태로 넣어주세요.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("오류가 발생했습니다.");
		}
		
		Prob.printAster(lineCount);
		
	}

}// class end
