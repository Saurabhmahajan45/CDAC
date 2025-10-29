class Example{
	int x;
	int y;
	double z;
	
	Example(){
		System.out.println("CR Elections will be on Monday1!!");
		x=100;
		y=200;
		z=500.45;
	}
	Example(int a, int b){
		this();
		System.out.println("Complete your assignments on time!!");
		this.x=a;
		this.y=b;
	}
	Example(int a1, double b1){
		this(1000,2000);
		System.out.println("Complete your Hackerrank assignments on time!!");
		this.x=a1;
		this.z=b1;
	}
	public static void main(String args[]){
		
		System.out.println("Happy Ganesh Chaturthi!!");
		//Example e1 = new Example();
		Example e1 = new Example(10,20);
		Example e2 = new Example(10,20.45);
		Example e3 = new Example(2000,0.0);
		System.out.println("Be Happy !!");
	}
}