class Book{
	private String title;
	private String author;
	private boolean issued;
	
	private static int totalIssuedBooks;
	
	Book(String title, String author, boolean issued){
		this.title = title;
		this.author = author;
		this.issued = issued;
		if(issued){
			totalIssuedBooks++;
		}
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public boolean getIssued(){
		return issued;
	}
	
	public static int getTotalIssuedBooks(){
		return totalIssuedBooks;
	}
	
	public void setTitle(){
		this.title = title;
	}
	
	public void setAuthor(){
		this.author = author;
	}
	
	public void setIssued(boolean issued){
		if(this.issued != issued){
			if(issued){
				totalIssuedBooks++;
			}else{
				totalIssuedBooks--;
			}
		}
		this.issued = issued;
	}
	
	public static void TotalIssued(){
		System.out.println("Total books issued: " +totalIssuedBooks);
	}
	
	}
	
class Book3{
	public static void main(String args[]){
		Book B1 = new Book("Harry Potter" ,"J.K.Rowling", true);
		Book B2 = new Book("Five Point Someone" ,"Chetan Bhagat", false);
		Book B3 = new Book("Do Epic Shit" ,"Ankur Warikoo", true);
		
		System.out.println("Book1 issued? " + B1.getIssued());
		System.out.println("Book2 issued? " + B2.getIssued());
		System.out.println("Book3 issued? " + B3.getIssued());
		
		Book.TotalIssued();
		
	}
}