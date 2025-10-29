class Passenger{
	String name;
	int age;
	String seatType;
	
	static int totalTicketBooked = 0;
	
	Passenger(String name, int age){
		this.name = name;
		this.age = age;
		this.seatType = "General";
		totalTicketBooked++;
	}
	
	Passenger(String name, int age, String seatType){
		this.name = name;
		this.age = age;
		this.seatType = seatType;
		totalTicketBooked++;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getSeatType(){
		return seatType;
	}
	public static void showTotalTicket(){
		System.out.println("Total Passengers Booked: " +totalTicketBooked);
	}
	
}
class Passenger6{
	public static void main(String args[]){
		Passenger P1 = new Passenger("Ravi",25);
		Passenger P2 = new Passenger("Anita" ,30, "AC Sleeper");
		Passenger P3 = new Passenger("Suresh", 40);
		
		System.out.println("Passenger1: Name: " +P1.getName() + ", Age: " +P1.getAge() + ", Seat: " +P1.getSeatType());
		System.out.println("Passenger2: Name: " +P2.getName() + ", Age: " +P2.getAge() + ", Seat: " +P2.getSeatType());
		System.out.println("Passenger3: Name: " +P3.getName() + ", Age: " +P3.getAge() + ", Seat: " +P3.getSeatType());
		
		Passenger.showTotalTicket();
	}
}	