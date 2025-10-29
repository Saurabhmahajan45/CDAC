class Book {
	private int copiesAvailable;
	
	public void addCopies(int n){
		copiesAvailable = copiesAvailable + n;
	}
	public void removeCopies(int n){
	    copiesAvailable = copiesAvailable - n;
	}
	
	public int getCopiesAvailable(){
		return copiesAvailable;
	}
}
class Book4{
	public static void main(String args[]){
		Book b1 = new Book();
		b1.addCopies(5);
		b1.removeCopies(1);
		System.out.println("Copies Available = " + b1.getCopiesAvailable());
	}

}