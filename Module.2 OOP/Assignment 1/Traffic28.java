import java.util.Scanner;

class Traffic28{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter traffic colour: ");
	String colour = sc.next();
	
	if (colour.equalsIgnoreCase("Green")){
		System.out.println("Go");
	}else if(colour.equalsIgnoreCase("Red")){
				System.out.println("Stop");
	}else if (colour.equalsIgnoreCase("Yellow")){
				System.out.println("Look");
	}else{
		System.out.println("Invalid colour");
	}
	}
}