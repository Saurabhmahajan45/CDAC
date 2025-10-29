class main01{
	public static void main(String args[]){
		//int[] arr = {10, 25, 47, 3, 19};
		int[] arr = {-5, -10, -3, -20, -7};
		
		int max = -100;
    for (int i =0; i < arr.length; i++){
		if (arr[i] > max){
			max = arr[i];
		}
	}	
	System.out.println(max);
		
		
	}
}