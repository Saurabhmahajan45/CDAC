class Book17{
	private int bookId;
	private String title;
	private String author;
	
	Book17(int bookId, String title, String author){
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	public int getBookId(){
		return bookId;
	}
		public String getTitle(){
		return title;
	}
		public String getAuthor(){
		return author;
	}
	public void setBookId(){
		this.bookId = bookId;
	}
	public void setTitle(){
		this.title = title;
	}
	public void setAuthor(){
		this.author = author;
	}
	public void displayBook(){
		System.out.println("BookID: " +getBookId() + ",Title: " + getTitle()+ ", Author: " +getAuthor());
	}
}
class Library17{
	String libraryName;
	static int totalBooks =0;
	
	Library17(String libraryName){
		this.libraryName = libraryName;
	}	
	
	public void addBook(Book17 B){
		totalBooks++;	
		B.displayBook();
	}
	
	 public void displayTotalBooks() {
        System.out.println("Total Books in " + libraryName + " = " + totalBooks);
    }
}

class BookMain17{
	public static void main(String args[]){
	Library17 l1 = new Library17("CDAC Library");

    Book17 B1 = new Book17(101, "Do Epic Shit", "Ankur Warikoo");
	Book17 B2 = new Book17(102, "The Psychology of Money", "Morgan Housel");
	
	
	l1.addBook(B1);
	l1.addBook(B2);
	
	l1.displayTotalBooks();
	}
}