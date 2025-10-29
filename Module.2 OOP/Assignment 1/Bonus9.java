import java.util.Scanner;

class Bonus9 {
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Salary: ");
	double salary = sc.nextDouble();
	
	System.out.print("Enter years: ");
	int years = sc.nextInt();
	
	if(years>=5){
		double bonusamount = salary * (5/100.0);
		System.out.println("Bonus amount: "+bonusamount);
	}else{
		System.out.println("No bonus amount");
	}
	}
	
}


/* Output:
Enter Salary: 75000
Enter years: 7
Bonus amount: 3750.0 */