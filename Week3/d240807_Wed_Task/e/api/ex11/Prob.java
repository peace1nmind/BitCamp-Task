package d240807_Wed_Task.e.api.ex11;
// W3 D13 Task2
// �ѱ� ���ڵ�

public class Prob {

	// Field

	
	// Constructor
	public Prob() {
	}

	
	// Method
	public String toEncoding(String str) {
		
		byte[] ba = str.getBytes();
		String result = "";

		for (byte b: ba) {

			if (Integer.toHexString(b).length() == 8) {	// �ѱ��� ���
				result += "%"+Integer.toHexString(b).toUpperCase().substring(6);
			}else {	// �ѱ� �ƴ� ��� = ����, ����
				result += (char) b;
			}
			
		}

		return result;
	}
	
	public void printInOut(String str) {
		System.out.println("�Է� : "+str);
		System.out.println("��� : "+new Prob().toEncoding(str));
	}
	
	
	// Main Method
	public static void main(String[] args) {

		Prob p1 = new Prob();
//		String[] strs = {"Korea", "ȫ�浿", "ȫ �� ��", "Hong �� ��", "0319"};
//		
//		for (String str: strs) {
//			p1.printInOut(str);
//		}
		
		System.out.println("�Է� : Korea");
		System.out.println("��� : "+new Prob().toEncoding("Korea"));
		System.out.println("�Է� : ȫ�浿");
		System.out.println("��� : "+new Prob().toEncoding("ȫ�浿"));
		System.out.println("�Է� : ȫ �� ��");
		System.out.println("��� : "+new Prob().toEncoding("ȫ �� ��"));
		System.out.println("�Է� : Hong �� ��");
		System.out.println("��� : "+new Prob().toEncoding("Hong �� ��"));
		System.out.println("�Է� : 0319");
		System.out.println("��� : "+new Prob().toEncoding("0319"));

	}// main end

}
// class end
