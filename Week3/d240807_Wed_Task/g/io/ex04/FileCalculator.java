package d240807_Wed_Task.g.io.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

// W3 D13 Task4

public class FileCalculator {

	// Field

	
	// Constructor
	public FileCalculator() {
	}

	
	// Method
	public void addCalculateResult(String inputFileName) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		String source = "";
		int sum = 0;
		int mul = 1;
		boolean isLn = false;
		
		while ((source=br.readLine())!=null) {
			sum += Integer.parseInt(source);
			mul *= Integer.parseInt(source);
			isLn = source.length()==0;
		}
		
		br.close();
		
		PrintWriter pw = new PrintWriter(new FileWriter(inputFileName, true));
		
		if (isLn) {
			pw.println(sum);
			pw.println(mul);
		} else {
			pw.println();
			pw.println(sum);
			pw.println(mul);
		}
		
		pw.flush();
		pw.close();
		
	}
	
	
	// Main Method
	public static void main(String[] args) throws Exception {

		FileCalculator fc = new FileCalculator();
//		fc.addCalculateResult("D:\\test.dat");
		fc.addCalculateResult("F:\\BitCamp\\workspace\\BitCamp_Task\\Week3\\d240807_Wed_Task\\g\\io\\ex04\\test.dat");

	}// main end

}
// class end
