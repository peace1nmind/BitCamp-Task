package d240806_Tue_Task.f.exception.ex01;
// W D 

public class CellPhoneMain {

	// Main Method
	public static void main(String[] args) throws IllegalArgumentException {

		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge(20);
		myPhone.printBattery();
		
		myPhone.call(300);
		myPhone.printBattery();
		
		myPhone.charge(50);
		myPhone.printBattery();
		
		myPhone.call(40);
		myPhone.printBattery();
		
		myPhone.call(-20);
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		if (myPhone.equals(yourPhone)) {
			System.out.println("���� ���Դϴ�.");
		} else {
			System.out.println("�ٸ� ���Դϴ�.");
		}
		

	}// main end

}
// class end
