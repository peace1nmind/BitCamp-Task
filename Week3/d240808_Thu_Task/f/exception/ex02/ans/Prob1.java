package d240808_Thu_Task.f.exception.ex02.ans;

import d240808_Thu_Task.f.exception.ex02.Account;

// W3 D14 Task1-2

public class Prob1 {

	// Field

	// Constructor

	// Method
	
	// Main Method
	public static void main(String[] args) {

		Account account01 = new Account("111-111-111", true, 1000000, 100000);
		
		try {
			System.out.println("0.���� ���� ����");
			System.out.println("[��������] "+account01);
			
			System.out.println("\n1. "+account01.getAccountNo()+"���� 200000 ��ݿ�û");
			account01.withdraw(200000);
			System.out.println("[��������] "+account01);
			
			System.out.println("\n2. "+account01.getAccountNo()+"���� 100000 �Աݿ�û");
			account01.deposit(100000);
			System.out.println("[��������] "+account01);
			
			System.out.println("\n3. "+account01.getAccountNo()+"���� 500000 ��ݿ�û");
			account01.withdraw(500000);
			System.out.println("[��������] "+account01);
			
			System.out.println("\n4. "+account01.getAccountNo()+"���� 600000 ��ݿ�û");
			account01.withdraw(600000);
			System.out.println("[��������] "+account01);
			
		} catch (Exception e) {
			System.out.println(">>> ���ܹ߻� : "+account01.getAccountNo()+" : "+e.getMessage());
		}
		
		System.out.println("\n===================================\n");
		
		Account account02 = new Account();
		
//		try {
//			account02.setAccountNo("222-222-222");
//			
//			System.out.println("0.���� ���� ����");
//			System.out.println("[��������] "+account02);
//			
//			System.out.println("\n1. "+account02.getAccountNo()+"���� 100000 �Աݿ�û");
//			account02.deposit(100000);
//			System.out.println("[��������] "+account02);
//			
//			System.out.println("\n2. "+account02.getAccountNo()+"���� 50000 ��ݿ�û");
//			account02.withdraw(50000);
//			System.out.println("[��������] "+account02);
//			
//			System.out.println("\n3. "+account02.getAccountNo()+"���� 60000 ��ݿ�û");
//			account02.withdraw(60000);
//			System.out.println("[��������] "+account02);
//			
//		} catch (Exception e) {
//			System.out.println(">>> ���ܹ߻� : "+account02.getAccountNo()+" : "+e.getMessage());
//		}
		
		try {
			account02.setAccountNo("222-222-222");
			
			account02.printStatus(account02);
			account02.printStatus(account02, 100000, true);
			account02.printStatus(account02, 50000, false);
			account02.printStatus(account02, 60000, false);
			
		} catch (Exception e) {
			System.out.println(">>> ���ܹ߻� : "+account02.getAccountNo()+" : "+e.getMessage());
		}

	}// main end

}
// class end
