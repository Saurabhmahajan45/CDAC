import java.util.Scanner;

class Salary2 {
     public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
	    System.out.print("Enter salary of company 1: ");
        int s1 = sc.nextInt();
		System.out.print("Enter salary of company 2: ");
        int s2 = sc.nextInt();
		System.out.print("Enter salary of company 3: ");
        int s3 = sc.nextInt();
		if(s1>s2 && s1>s2){
			System.out.println("Company 1 offers highest salary");
		}else if(s2 > s1 && s2> s3){
			System.out.println("Company 2 offers highest salary");
		}else{
			System.out.println("Company 3 offers highest salary");
		}
	 }

}
