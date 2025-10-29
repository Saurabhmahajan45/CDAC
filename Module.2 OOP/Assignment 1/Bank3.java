import java.util.Scanner;
class Bank3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter transaction amount: ");
		int amount = sc.nextInt();
		
		if(amount > 0){
			System.out.println("Deposit withdrawal");
		}else{
			System.out.println("Withdrwal transactions");
		}
	}
}