import java.util.Scanner;

class Leapyear37{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
		String result = (year%4==0) ? "Leap year" : "Not Leap Year";
			System.out.println(result);
		
	}
}