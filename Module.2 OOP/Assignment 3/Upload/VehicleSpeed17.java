class Vehicle{
	public void displaySpeed(){
      System.out.println("Vehicle speed unknown");		
	}
}

class Car extends Vehicle{
	@Override
	public void displaySpeed(){
		System.out.println("Car speed 120 km/h");	
	}
}

class Bike extends Vehicle{
	@Override
	public void displaySpeed(){
		System.out.println("Bike speed 80 km/h");	
	}
}

class VehicleSpeed17{
	public static void main (String args[]){
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		v1.displaySpeed();
		v2.displaySpeed();
	}
}