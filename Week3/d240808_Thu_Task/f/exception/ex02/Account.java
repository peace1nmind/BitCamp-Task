package d240808_Thu_Task.f.exception.ex02;
// W3 D14 Task1 

public class Account {

	// Field
	private String accountNo;
	private boolean creditLine = false;
	private int creditLineLimit = 0;
	int balance = 0;
	
	
	// Constructor
	public Account() {
	}
	
	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = creditLineLimit;
		this.balance = balance;
	}
	
	
	// Method
	public void deposit(int money) {	// �Ա�
		balance += money;
	}
	
	public void withdraw(int money) {	// ���
		balance -= money;
	}
	
	@Override
	public String toString() {
		
		String result = "���¹�ȣ : "+accountNo+",\t�ܰ� : "+balance;
		
		if (creditLine) {
			result += "\t[[ "+creditLineLimit*(-1)+"�� ���̳ʽ����� ]]";
		}
		
		return result;
	}
	
	
	// Getter, Setter
	public boolean isCreditLine() {
		return creditLine;
	}

	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}

	public int getCreditLineLimit() {
		return creditLineLimit;
	}

	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	

}
// class end
