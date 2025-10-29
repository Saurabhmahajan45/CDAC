class Vehicle{
	private int regNo;
	private String ownerName;
	private String vehicleType;
	
	private static int vehicleCount = 8663;
	
	Vehicle(String ownerName, String vehicleType){
		this.regNo = vehicleCount;
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		vehicleCount++;
	}
	
	public int getRegNo(){
		return regNo;
	}
	public String getOwnerName(){
		return ownerName;
	}
	public String getVehicleType(){
		return vehicleType;
	}
	
	public void displaydetails(){
		System.out.println("RegNo. MH-25-AB-" + getRegNo() + ", Owner Name: " +getOwnerName()+ ", Vehicle Type: " +getVehicleType());
	}

}
class Vehicle18{
	public static void main(String args[]){
		Vehicle v1 = new Vehicle("Anil Sharama", "2 Wheeler");
		Vehicle v2 = new Vehicle("Vilas Shah", "4 Wheeler");
		
		v1.displaydetails();
		v2.displaydetails();
		
	}
}