import java.util.Scanner;

class Determine32{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		String determine = (num > 0) ? "Number is Positive"
		: (num < 0) ? "Number is Negative"
		: "Zero";
		System.out.println(determine);
	}
}