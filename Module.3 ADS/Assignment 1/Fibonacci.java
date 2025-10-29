import java.util.*;
 
class Fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int f0 = 0 , f1 = 1;
		System.out.print(f0 + " " + f1 + " " );
		
		for(int i =2; i <= n; i++){
			int next = f0 + f1;
			System.out.print(next + " ");
			f0 = f1;
			f1 = next;
		}
		
		
	}

}