package d240808_Thu_Task.e.io.ex06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

// W3 D14 Task3-2

public class Prob {

	// Field

	// Constructor

	// Method
	public void printScore(Score score) {
		System.out.println(score.getName()+" : "
				+score.getKor()+" "+score.getEng()+" "
				+score.getMath()+" "+score.getSum());
	}
	
	public List<Score> getScore(String fileName) {
		
		Vector<Score> scores = new Vector<Score>();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			String line = "";
			
			while ((line=br.readLine())!=null) {
				String[] info = line.split("/");
				
				for (int i = 0; i < info.length; i++) {
					info[i] = info[i].trim();
				}
				
				String name = info[0];
				int kor = Integer.parseInt(info[1]);
				int eng = Integer.parseInt(info[2]);
				int math = Integer.parseInt(info[3]);
				int sum = kor+eng+math;
			
				if (info.length!=4) {
					throw new Exception("과목수가 맞지 않습니다.");
				}else {
					scores.add(new Score(name, kor, eng, math, sum));
				}
			}
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			
		} catch (IOException e2) {
			e2.printStackTrace();
			
		} catch (Exception e3) {
			e3.printStackTrace();
			System.out.println(e3.getMessage());
			
		} finally {
			try {
				br.close();
			} catch (Exception e4) {
				e4.printStackTrace();
			}
		}
		
		return scores;
	}
	
	// Main Method
	public static void main(String[] args) throws Exception {
		
		String path = "./Week3/d240808_Thu_Task/e/io/ex06/";
		Vector<Score> scores = (Vector<Score>) new Prob().getScore(path+"data.txt");
		
		for (Score score: scores) {
			score.printScore();
		}
		

	}// main end

}
// class end
