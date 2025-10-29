import java.util.Scanner;

class Garden5{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		int length = sc.nextInt();
		
		System.out.print("Enter Breadth: ");
		int breadth = sc.nextInt();
		
		if(length == breadth){
			System.out.println("Square Garden");
		}else{
			System.out.println("Rectangle Garden");
		}
		
	}
}