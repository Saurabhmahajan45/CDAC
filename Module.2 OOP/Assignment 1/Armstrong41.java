import java.util.Scanner;
class Armstrong41{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter 3 digit number: ");
	int num = sc.nextInt();
	
	int original = num;
	int sum = 0;
	
	while(num>0){
	   int digit = num % 10;
       sum += digit * digit * digit;	 
       num /=10;	   
	}
	if (sum == original){
		System.out.println(original + " is an armstrong number");
	} else{
		System.out.println(original + " is not an armstrong number");
	}
	}
}