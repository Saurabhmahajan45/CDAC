class Vehicle {
	String brand;
	int speed;
	public void Type(String brand, int speed){
		this.brand = brand;
		this.speed = speed;
	}
}

class Car extends Vehicle{
	String modelType;
	public void displayVehicle(String modelType){
		this.modelType = modelType;
	}
	public void get(){
		System.out.println("Car = " + brand + " " + modelType + ", Speed = " + speed);
	}
}

class Bike extends Vehicle{
	String modelType;
	public void displayVehicle(String modelType){
		this.modelType = modelType;
	}
	public void get(){
		System.out.println("Bike = " + brand + " " + modelType + ", Speed = " + speed);
	}
}

class Vehicle8{
	public static void main (String args[]){
		Car c1 = new Car();
		c1.Type("Honda", 180);
		c1.displayVehicle("Civic");
		c1.get();
		Bike b1 = new Bike();
		b1.Type("Yahama", 120);
		b1.displayVehicle("R15");
		b1.get();
	}
}