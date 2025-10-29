import java.util.Scanner;

class Eligibility13{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter total classes held: ");
	double classesheld = sc.nextDouble();
	
	System.out.print("Enter classes attented: ");
	double attented = sc.nextDouble();
	
	System.out.print("Medical cause (Y/N): ");
    char medical = sc.next().charAt(0);
	
	double attendance = (attented/classesheld) * 100;
	
	if(attendance>=0.75){
		System.out.println("Student is allowed to sit for the exam.");
	}else if(medical == 'Y' || medical == 'y'){
		System.out.println("Student is allowed to sit for the exam.(Medical Cause)");
	} else{
		System.out.println("Student is Not allowed to sit for the exam.");
	}
	}
	
}