package d240805_Mon_Task.d.inheritance.ex03;
// W2 D11 Taks1

public class Prob3 {

	// Main Method
	public static void main(String[] args) {

		CellPhone cellPone = new CellPhone("010-1111-1111", 1000);
		cellPone.call("017-017-017", 10);
		cellPone.call("016-016-016", 10);
		cellPone.calculateTotalFee();
		cellPone.printAll(cellPone);
		cellPone.printHistory();
		System.out.println("==============================");
		
		SmartPhone smartPhone = new SmartPhone("000-0000-0000", 200);
		smartPhone.call("011-011-011", 10);
		smartPhone.call("012-012-012", 10);
		smartPhone.calculateTotalFee();
		smartPhone.printAll(cellPone);
		smartPhone.printHistory();
		System.out.println("==============================");
		
		SmartPhone smartPhone01 = new SmartPhone("111-111-111", 0, true, 3000);
		smartPhone01.call("017-017-017", 10);
		smartPhone01.call("016-016-016", 10);
		smartPhone01.calculateTotalFee();
		smartPhone01.printAll(smartPhone01);
		smartPhone01.printHistory();
		System.out.println("==============================");
		
	}// main end

}
// class end
