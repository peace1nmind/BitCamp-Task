// package c.modeling.ex02;
// W2 D8 Task1 

public class  TestAccount
{	
	// Main Method
	public static void main(String[] args) 
	{	
		String accNo = null;
		int balance = 0;
		
		Account accObj = new Account("078-3762-293");
		accNo = accObj.getAccNo();
		balance = accObj.getBalance();
		accObj.printBalance();

		accObj.save(100);
		accObj.deposit(30);

	}// main end
	
}// public class end
