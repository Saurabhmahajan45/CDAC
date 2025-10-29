import java.util.Scanner;

class Attendance10{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter total classes held: ");
	int classesheld = sc.nextInt();
	
	System.out.print("Enter classes attented: ");
	int attented = sc.nextInt();
	
	double attendance = (attented/classesheld) * 100;
	
	if(attendance>=0.75){
		System.out.println("Student is allowed to sit for the exam.");
	}else{
		System.out.println("Student is Not allowed to sit for the exam.");
	}
	}
	
}


/* Output:
Enter total classes held: 120
Enter classes attented: 80
Student is Not allowed to sit for the exam. */