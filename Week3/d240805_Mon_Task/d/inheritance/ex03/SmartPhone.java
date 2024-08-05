package d240805_Mon_Task.d.inheritance.ex03;
// W2 D11 Task1

public class SmartPhone extends CellPhone {

	// Field
	private boolean isMonthlyFixedRate;
	private int monthlyFixedFee;

	// Constructor
	protected SmartPhone() {
	}
	
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
	}

	public SmartPhone(String phoneNumber, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}


	// Method
	@Override
	public void calculateTotalFee() {
		if (isMonthlyFixedRate) {
			setTotalFee(getTotalFee()+monthlyFixedFee);
			
		} else {
			super.calculateTotalFee();
		}
	}
	
	
	// Getter, Setter
	public boolean isMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}

	public void setMonthlyFixedRate(boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}

	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}

	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
}
// class end
