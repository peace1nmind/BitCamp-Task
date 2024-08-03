package c.modeling.ex04;

public class Prob {

	// Field

	// Method
	
	// Constructor
	
	// Main Method
	public static void main(String[] args) {
		
		Book book1 = new Book("Java program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book("EJB Program", 34000);
		
		Book[] booklist = {book1, book2, book3, book4, book5};
		
		BookMgr mgr = new BookMgr(booklist);
		
		mgr.printBooklist();
		System.out.println();
		
		mgr.printTotalPrice();
		System.out.println();

	}// main end

}
// class end