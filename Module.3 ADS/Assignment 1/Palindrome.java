class Palindrome{
	public static void main(String args[]){
		int num = 121;
		
		if(num < 0){
			System.out.println(false);
			return;
		}
		
		int original = num; 
		
		int rev = 0;
		while(num != 0){
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num/10;
		}
		
		boolean isPalindrome = (original == rev);
		System.out.println(isPalindrome);
	}

}