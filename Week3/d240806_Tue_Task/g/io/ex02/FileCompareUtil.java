package d240806_Tue_Task.g.io.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// W2 D12 Task3

public class FileCompareUtil {

	// Field

	// Constructor
	public FileCompareUtil() {
	}

	// Method
	public ArrayList compareFile(String fstFileName, String scdFileName) throws Exception {
		
		
		BufferedReader br1;
		BufferedReader br2;
		BufferedWriter bw;
		String source1 = null;
		String source2 = null;
		int line = 1;
		ArrayList<String> strList = new ArrayList<String>();
		
		try {
			br1 = new BufferedReader(new FileReader(fstFileName));
			br2 = new BufferedReader(new FileReader(scdFileName));
			
			while (((source1=br1.readLine())!=null) && ((source2=br2.readLine())!=null)) {
				if (!source1.equals(source2)) {
					strList.add("Line "+line+": "+source2);
				}
				line++;
			}
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		return strList;
	}
	
	// Main Method
	public static void main(String[] args) throws Exception {
		
		FileCompareUtil util = new FileCompareUtil();
		System.out.println(util.compareFile("./files/fstFile1.txt", "./files/scdFile1.txt"));
		System.out.println("Successfull!!");
		
	}// main end

}
// class end
