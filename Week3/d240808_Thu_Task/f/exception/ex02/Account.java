package d240808_Thu_Task.f.exception.ex02;
// W3 D14 Task1-1

public class Account {

	// Field
	private String accountNo;
	private boolean creditLine = false;
	private int creditLineLimit = 0;
	int balance = 0;
	int num = 0;
	
	
	// Constructor
	public Account() {
		this.accountNo = null;
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
		num++;
	}
	
	public void withdraw(int money) throws Exception {	// ���
		balance -= money;
		
		if ((creditLine && (balance<-creditLineLimit)) || (!creditLine && (balance<0))) {
			throw new Exception("�ܰ���� ��ݺҰ� �մϴ�.");
		}
		num++;
	}
	
	@Override
	public String toString() {
		
		String result = "���¹�ȣ : "+accountNo+",\t�ܰ� : "+balance;
		
		if (creditLine) {
			result += "\t[[ -"+creditLineLimit+"�� ���̳ʽ����� ]]";
		}
		
		return result;
	}
	
	public void printStatus(Account account) {
		System.out.println(num+". ���� ���� ����");
		System.out.println("[��������] "+account);
		num++;
	}
	
	public void printStatus(Account account, int money, boolean isDeposit) throws Exception {
		
		String inOrOut = (isDeposit) ? "�Ա�" : "���";
		
		System.out.println(String.format("\n%d. %s ���� %d %s��û", num, account.getAccountNo(), money, inOrOut));
		
		if (isDeposit) {
			account.deposit(money);
		}else {
			account.withdraw(money);
		}
		
		System.out.println("[��������] "+account);
		num++;
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
