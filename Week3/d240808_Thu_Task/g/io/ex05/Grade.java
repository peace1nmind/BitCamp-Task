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
			
				System.out.println(String.format("%s�� ������ %s�� �Դϴ�.", line.split(",")[0], line.split(",")[1]));
			}
			
			System.out.println("����� ������ "+sumAll+"�� �Դϴ�.");
			System.out.println("����� ����� "+(sumAll/lineCount)+"�� �Դϴ�.");
			
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
			new FileNotFoundException(String.format("\"%d\"�� ã�� ���߽��ϴ�.", fileName));
		} catch (NumberFormatException e2) {
			e2.printStackTrace();
			new NumberFormatException(line.split(",")[1]+"�� ���� ���°� �ƴմϴ�.");
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
