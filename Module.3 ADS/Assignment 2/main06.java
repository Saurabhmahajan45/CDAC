class main06{
	public static void main(String args[]){
		
		int[] arr = {1,2,3,4,5,6};
		
		int even = 0;
		int odd = 0;
    for(int i = 0; i < arr.length; i++){
	    if(arr[i] % 2 == 0){
			even =  even + 1;
		}else{
		odd = odd + 1;
		}
	}
	System.out.print("Even: " + even + ", Odd: " + odd);
	}
}