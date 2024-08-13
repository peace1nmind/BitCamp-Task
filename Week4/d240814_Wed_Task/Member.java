package d240814_Wed_Task;
// W4 D17 Task2

public class Member {

	// Field
	private String name;
	private int gender;
	private String birth;
	private int calendarType = 0;
	private String calendarType_str = "";
	private String edu;
	private String job;
	private String dept;
	private int marriage;
	private int child;
	private String tel;
	private int telPlace;
	private String phone;
	private String telCompany;
	private String addr;
	

	// Constructor
	public Member() {
	}

	public Member(String name, int gender, String birth, String calendarType_str, String edu, String job, String dept,
			int marriage, int child, String tel, int telPlace, String phone, String telCompany, String addr) {
		super();
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.calendarType_str = calendarType_str;
		
		if (calendarType_str.equals("양력")) {
			calendarType = 0;
		} else if (calendarType_str.equals("양력")) {
			calendarType = 1;
		} else {
			calendarType = 2;
		}
		
		this.edu = edu;
		this.job = job;
		this.dept = dept;
		this.marriage = marriage;
		this.child = child;
		this.tel = tel;
		this.telPlace = telPlace;
		this.phone = phone;
		this.telCompany = telCompany;
		this.addr = addr;
	}
	
	
	// Getter
	public String getName() {
		return name;
	}

	public int getGender() {
		return gender;
	}

	public String getBirth() {
		return birth;
	}

	public int getCalendarType() {
		return calendarType;
	}
	
	public String getCalendarType_str() {
		return calendarType_str;
	}

	public String getEdu() {
		return edu;
	}

	public String getJob() {
		return job;
	}

	public String getDept() {
		return dept;
	}

	public int getMarriage() {
		return marriage;
	}

	public int getChild() {
		return child;
	}

	public String getTel() {
		return tel;
	}

	public int getTelPlace() {
		return telPlace;
	}

	public String getPhone() {
		return phone;
	}

	public String getTelCompany() {
		return telCompany;
	}

	public String getAddr() {
		return addr;
	}

}
// class end
