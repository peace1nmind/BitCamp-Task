package d240808_Thu_Task.g.io.ex05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// W3 D14 Task2

public class Grade {

	// Field

	
	// Constructor
	public Grade() {
	}

	
	// Method
	public void printGrade(String fileName) {
		
		BufferedReader br = null;
		String line = "";
		int sumAll = 0;
		int lineCount = 1;
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			
			while ((line=br.readLine())!=null) {
				sumAll += Integer.parseInt(line.split(",")[1].trim());
				lineCount++;
			
				System.out.println(String.format("%s의 점수는 %s점 입니다.", line.split(",")[0], line.split(",")[1]));
			}
			
			System.out.println("모두의 총점은 "+sumAll+"점 입니다.");
			System.out.println("모두의 평균은 "+(sumAll/lineCount)+"점 입니다.");
			
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
			new FileNotFoundException(String.format("\"%d\"을 찾지 못했습니다.", fileName));
		} catch (NumberFormatException e2) {
			e2.printStackTrace();
			new NumberFormatException(line.split(",")[1]+"은 숫자 형태가 아닙니다.");
		} catch (IOException e3) {
			e3.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (Exception e4) {
				e4.printStackTrace();
			}
		}
	}
	
	
	// Main Method
	public static void main(String[] args) {
		
		String path = "./Week3/d240808_Thu_Task/g/io/ex05/";
		new Grade().printGrade(path+"score.txt");

	}// main end

}
// class end
