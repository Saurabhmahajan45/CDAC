import java.util.Scanner;

class DiscountTernary40 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double discountpercent = 10;
		
		System.out.print("Enter total purchase amount: ");
		double amount = sc.nextDouble();
		
		double discount = (amount >= 1000)? (amount-(amount * 0.1)): amount;
			System.out.println(discount);
	}
}