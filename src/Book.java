
public class Book {
	
	String title;
	
	boolean borrowed;
	
	// Creates a new Book
	public Book(String bookTitle) {
	// Implement this method
		this.title = bookTitle;
		this.borrowed = false;
		
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	// Marks the book as rented
	public void borrowed() {
	// Implement this method
		this.borrowed = true;
	}
	
	// Marks the book as not rented
	public void returned() {
	// Implement this method
		this.borrowed = false;
	}
	
	// Returns true if the book is rented, false otherwise
	public boolean isBorrowed() {
	// Implement this method
		if (this.borrowed == true){
			return true;
		}else {return false;}
	}
	
	// Returns the title of the book
	public String getTitle() {
	// Implement this method
		return this.title;
	} 
	
	public static void main(String[] arguments) {
	
		// Small test of the Book class
	Book example = new Book("The Da Vinci Code");
	System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
	System.out.println("Borrowed? (should be false): " + example.isBorrowed());
	example.borrowed();
	System.out.println("Borrowed? (should be true): " + example.isBorrowed());
	example.returned();
	System.out.println("Borrowed? (should be false): " + example.isBorrowed());
	}
	

}
