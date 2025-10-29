class VehicleReg{
	private String portalName;
	static {
		System.out.println("Welcome to CDAC Vehicle Regristration Portal");
	}
	private int regNo;
	private String ownerName;
	private String vehicleType;
	
	private static int vehicleCount = 1001;
	
	VehicleReg(String ownerName, String vehicleType){
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
class VehicleReg19{
	public static void main(String args[]){
		VehicleReg v1 = new VehicleReg("Anil Sharama", "2 Wheeler");
		VehicleReg v2 = new VehicleReg("Vilas Shah", "4 Wheeler");
		
		v1.displaydetails();
		v2.displaydetails();
		
	}
}

