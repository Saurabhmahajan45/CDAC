class GCD{
	public static void main(String args[]){
		int a = 54;
		int b = 24;
		
		while (b != 0){
			int gcd = b;
			b = a % b;
			a = gcd;
		}
		System.out.println(a);
	}
}