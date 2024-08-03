package c.modeling.ex04;

class BookMgr {

	// Field
	private Book[] booklist;
	
	// Constructor
	public BookMgr() {
	}
	
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}

	// Method
	public void printBooklist() {
		System.out.println("=== 책 목록 ===");
		
		for (int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	
	public void printTotalPrice() {
		int sum = 0;
		
		for (int i = 0; i < booklist.length; i++) {
			sum += booklist[i].getPrice();
		}
		
		System.out.println("=== 책 가격의 총합 ===");
		System.out.println("전체 책 가격의 합 : "+sum);

	}


}
// class end