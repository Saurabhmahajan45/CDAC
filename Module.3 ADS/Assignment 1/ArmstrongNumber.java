import java.util.*;

class ArmstrongNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int original = num;
		int sum = 0;
		while(num > 0){
			int digit = num % 10;
			sum += digit * digit * digit;
			num /= 10;
		}
		boolean armstrong = sum == original;
		System.out.println(armstrong);
	}

}