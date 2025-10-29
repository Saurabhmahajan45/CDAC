class TemperatureSensor{
	private int temperature;
	
	public void setTemperature(int t){
		if (t >= 0 && t <= 100){
			this.temperature = t;
		}else{
			System.out.println("Temperature out of range");
		}
	}
	
	public int getTemperature(){
		return temperature;
	}
}

class TemperatureSensor5{
	public static void main(String args[]){
		TemperatureSensor t1 = new TemperatureSensor();
		t1.setTemperature(-5);
		System.out.println("Tempearture = " + t1.getTemperature());
		
		t1.setTemperature(25);
		System.out.println("Tempearture = " + t1.getTemperature());
	}
	}