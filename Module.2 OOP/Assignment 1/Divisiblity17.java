import java.util.Scanner;

class Divisiblity17 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		
			if (num%2 == 0){
				System.out.println("Divisible by 2");
			}else{
				System.out.println("Not Divisible by 2");
			}if (num%3 == 0){
				System.out.println("Divisible by 3");
			}else{
				System.out.println("Not Divisible by 3");
			}if (num%5 == 0){
				System.out.println("Divisible by 5");
			}else{
				System.out.println("Not Divisible by 5");
			}
		}
	}
