class main10{
	public static void main(String args[]){
		
		int[] arr = {10,70,30,40,50,60};
		
		
		int largest = 0;
		int second = 0;
    for(int i = 0; i < arr.length; i++){
		if(arr[i] > largest){
			second = largest;
			largest = arr[i];
		} else {
			second = arr[i];
		} 
		
	}	
		System.out.print(second);
	}
}