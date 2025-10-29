import java.util.Scanner;

class Discount8 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double discountpercent = 10;
		
		System.out.print("Enter total purchase amount: ");
		double amount = sc.nextDouble();
		
		if(amount>=1000){
			double discountamount = amount * (discountpercent/100.00);
			double finalamount = amount - discountamount;
			System.out.println("Final cost after discount: " +finalamount);
		}else{
			System.out.println("No discount and finalamount is " +amount);
		}
		
	}
}