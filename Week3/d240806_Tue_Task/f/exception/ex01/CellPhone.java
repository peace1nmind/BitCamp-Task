package d240806_Tue_Task.f.exception.ex01;
// W3 D12 Task1

class IllegalArgumentException extends Exception {

	public IllegalArgumentException(String message) {
		super(message);
		System.out.println(message);
		System.out.println(new CellPhone().getBattery());
	}
	
}

public class CellPhone {

	// Field
	private String model ="";
	private double battery = 0;
	
	
	// Constructor
	public CellPhone() {
	}
	
	public CellPhone(String model) {
		this.model = model;
	}
	
	
	// Method
	public void call(int time) throws IllegalArgumentException {
		
		if (time < 0) {
			throw new IllegalArgumentException("통화시간 입력오류");
		} else {
			System.out.println("통화시간 : "+time);
			
			battery -= time*0.5;
			
			if (battery <= 0) {
				battery = 0;
			}
		}
	}
	
	public void charge(int time) throws IllegalArgumentException {
		
		if (time < 0) {
			throw new IllegalArgumentException("충전시간 입력오류");
		} else {
			System.out.println("충전시간 : "+time);
			
			battery += time*3;
			
			if (battery >= 100) {
				battery = 100;
			}
		}
	}
	
	public void printBattery() {
		System.out.println("남은 배터리양 : "+battery);
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if (otherObject instanceof CellPhone) {
//			System.out.println("CellPone 타입입니다");
			return (((CellPhone) otherObject).getModel() == model);
		}else {
			return false;
		}
	}
	
	
	// Getter, Setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}
	
	

}
// class end
