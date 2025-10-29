class Movie{
	String name;
	String ticketType;
	
	static int totalTicketSold;
	
	Movie(String name){
		this.name = name;
		this.ticketType = "Normal";
		totalTicketSold++;
	}
	
	Movie(String name, String ticketType){
		this.name = name;
		this.ticketType = ticketType;
		totalTicketSold++;
	}
	
	public void showDetails(int customerNum){
		System.out.println("Customer" + customerNum + ": Name: " + name + ", Ticket: " + ticketType);
	}
	
	public static void showTotalTicketBooked(){
		System.out.println("Total Ticket Sold: " +totalTicketSold);
	}

}
class Movie7{
	public static void main (String args[]){
		Movie C1 = new Movie("Rahul");
		Movie C2 = new Movie("Pooja" , "Premium");
		Movie C3 = new Movie("Amit");
		
		C1.showDetails(1);
		C2.showDetails(2);
		C3.showDetails(3);
		Movie.showTotalTicketBooked();
	}
}