import java.util.Scanner;

class Exam7 {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks: ");
		byte marks = sc.nextByte();
		
		if(marks>=35){
			System.out.println("Student has Passed");
		}else{
			System.out.println("Student has Failled");
		}
		
	}
}