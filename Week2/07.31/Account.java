// package c.modeling.ex02;
// W2 D8 Task1

public class  Account
{	
	// Field
	private String accNo;
	private int balance;
	
	// Constructor
	/*
	public Account() {
		balance = 0;
	}
	*/

	public Account(String accNo) {
		this.accNo = accNo;
		balance = 0;
		System.out.println(accNo + " ���°� ���� �Ǿ����ϴ�.");
	}
	
	// Method
	public void save(int money) {
		balance += money;
		System.out.println(accNo+" ���¿� "+money+"������ �ԱݵǾ����ϴ�.");
		printBalance();
	}

	public void deposit(int money) {
		balance -= money;
		System.out.println(accNo+" ���¿� "+money+"������ ��ݵǾ����ϴ�.");
		printBalance();
	}

	public void printBalance() {
		System.out.println(accNo+" ������ �ܰ�� "+balance+"���� �Դϴ�.");
	}
	
	// Getter
	public int getBalance() {
		return balance;
	}

	public String getAccNo() {
		return accNo;
	}
	
}// public class end
