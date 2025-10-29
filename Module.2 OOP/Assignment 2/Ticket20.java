class Ticket{
	String passenegerName;
	int ticketNo;
	static int ticketCount = 5000;
	
	Ticket(String passenegerName){
		this.passenegerName = passenegerName;
		ticketCount++;
		this.ticketNo = ticketCount;
	}
	
	void displayTicket(){
		System.out.println("Ticket No: " + ticketNo + ", Passenger: " + passenegerName);
	}

}

class Ticket20{
	public static void main(String args[]){
		Ticket t1 = new Ticket("Rahul");
		Ticket t2 = new Ticket("Priya");
		Ticket t3 = new Ticket("Amit");
		
		t1.displayTicket();
		t2.displayTicket();
		t3.displayTicket();
		}
}
