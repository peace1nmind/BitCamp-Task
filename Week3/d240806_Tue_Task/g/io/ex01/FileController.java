package d240806_Tue_Task.g.io.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

// W3 D12 Task2

public class FileController {

	// Field
	
	
	// Constructor
	public FileController() {
	}

	
	// Method
	public void reverseLine(String inputFileName, String outputFileName) {
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader(inputFileName));
			bw = new BufferedWriter(new FileWriter(outputFileName, false));
			List<String> strList = new Vector<String>();
			String source=null;
			
			while ((source=br.readLine())!=null) {
				System.out.println("readLine()= "+source);
				strList.add(0, source);
			}
			
			for (String str: strList) {
				System.out.println("str= "+str);
				bw.write(str);
				bw.newLine();
			}
			
			bw.flush();
			
		} catch (FileNotFoundException e1) {
			System.out.println("e1");
			e1.printStackTrace();
		} catch (IOException e2) {
			System.out.println("e2");
			e2.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e3) {
				System.out.println("e3");
				e3.printStackTrace();
			}
		}	
	}
	
	
	// Main Method
	public static void main(String[] args) {
		
		FileController c = new FileController();
		String oldf = "files/oldf.txt";
		String newf = "files/newf.txt";
		c.reverseLine(oldf, newf);
		

	}// main end

}
// class end
