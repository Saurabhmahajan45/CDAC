import java.util.Scanner;

class Grade11 {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter percentage marks: ");
		float marks = sc.nextFloat();
		
		if (marks >= 90){
			System.out.println("Grade: A+");
		}else if(marks > 75){
			System.out.println("Grade: A");
		}else if(marks > 65){
			System.out.println("Grade: B+");
		}else if(marks > 50){
			System.out.println("Grade: B");
		}else if(marks > 35){
			System.out.println("Grade: C");
		}else if(marks < 36){
			System.out.println("Failed");
		}
	}
}


/* Output:
Enter percentage marks: 5
Failed

Enter percentage marks: 93
Grade: A+

Enter percentage marks: 85
Grade: A

Enter percentage marks: 75
Grade: B+ */