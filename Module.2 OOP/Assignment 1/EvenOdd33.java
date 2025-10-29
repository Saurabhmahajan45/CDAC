import java.util.Scanner;

class EvenOdd33{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		String determine = (num %2 == 0) ? "Number is Even" : "Number is Odd";
		System.out.println(determine);
	}
}