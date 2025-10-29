import java.util.Scanner;

class ArithmeticOperations30{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Select Operator (1-Addition, 2-Subtraction, 3-Multiplication, 4-Division): ");
		int operator = sc.nextInt();
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		switch (operator) {
			case 1 :
			System.out.println("Result: " +(num1 + num2));
			break;
			case 2 :
			System.out.println("Result: " +(num1 - num2));
			break;
			case 3 :
			System.out.println("Result: " +(num1 * num2));
			break;
			case 4 :
			if(num2 != 0){
			System.out.println("Result: " +(num1 / num2));
			}else{
				System.out.println("Invalid");
			}
			break;
		}
	}
}