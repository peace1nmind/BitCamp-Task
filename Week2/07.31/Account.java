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
		System.out.println(accNo + " 계좌가 개설 되었습니다.");
	}
	
	// Method
	public void save(int money) {
		balance += money;
		System.out.println(accNo+" 계좌에 "+money+"만원이 입금되었습니다.");
		printBalance();
	}

	public void deposit(int money) {
		balance -= money;
		System.out.println(accNo+" 계좌에 "+money+"만원이 출금되었습니다.");
		printBalance();
	}

	public void printBalance() {
		System.out.println(accNo+" 계좌의 잔고는 "+balance+"만원 입니다.");
	}
	
	// Getter
	public int getBalance() {
		return balance;
	}

	public String getAccNo() {
		return accNo;
	}
	
}// public class end
