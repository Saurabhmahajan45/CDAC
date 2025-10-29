import java.util.Scanner;

class BonusTernary39 {
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Salary: ");
	double salary = sc.nextDouble();
	
	System.out.print("Enter years: ");
	int years = sc.nextInt();
	
	double bonus = (years>=5) ? (salary * 0.05) : 0; 
		System.out.println(bonus);
	}
	
}
