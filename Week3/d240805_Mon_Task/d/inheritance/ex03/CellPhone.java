package d240805_Mon_Task.d.inheritance.ex03;
//W2 D11 Task1 

import java.util.List;
import java.util.Vector;

public class CellPhone {

	// Field
	private String phoneNumber;
	private int totalCallTime = 0;
	private int totalFee = 0;
	private int feePerCallTime;
	private Vector<CallHistory> callHistory = new Vector<CallHistory>();

	
	// Constructor
	protected CellPhone() {
		this.phoneNumber = "";
	}
	
	
	public CellPhone(String phoneNumber, int feePerCallTime) {
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}

	
	// Method
	public void call(String phoneNumber, int callTime) {
		getCallHistory().add(new CallHistory(phoneNumber, callTime));
		totalCallTime += callTime;
		totalFee += feePerCallTime*callTime;
		System.out.println(phoneNumber+" 번호로 "+callTime+" 통화함");
	}
	
	public void calculateTotalFee() {
		totalFee = totalCallTime*feePerCallTime;
	}
	
	public void printAll(CellPhone cellPhone) {
		System.out.println(cellPhone.getPhoneNumber()+" 의 통화시간은 "+
							cellPhone.getTotalCallTime()+" 이며\n"+
							"단가 "+cellPhone.getFeePerCallTime()+
							" 총 요금은 "+cellPhone.getTotalFee()+"원 입니다.");
	}
	
	public void printHistory() {
		System.out.println("====== 통화 기록 ======");
		int i = 1;
		for (CallHistory history: getCallHistory()) {
			System.out.println(i+". "+history.phoneNumber+" 와 통화 "+history.callTime);
			i++;
		}
	}
		
	
	// Getter, Setter
	public int getTotalCallTime() {
		return totalCallTime;
	}

	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	public int getFeePerCallTime() {
		return feePerCallTime;
	}

	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<CallHistory> getCallHistory() {
		return callHistory;
	}

}
// class end
