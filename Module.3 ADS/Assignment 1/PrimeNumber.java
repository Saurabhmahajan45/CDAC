import java.util.*;

class PrimeNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int prime = 0;
		
		for(int i = 1; i <= num; i++){
			if(num % i == 0){
			prime++;
			}
		}
		boolean isPrime = (prime == 2);
		System.out.println(isPrime);
	}

}