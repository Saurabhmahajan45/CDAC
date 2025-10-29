class main07{
	static int arrayCheck(int arr[], int key){
		for(int i = 0; i < arr.length; i++){
	    if(arr[i] == key){
			//System.out.print("Element found at index " + i);
			return i;
		}
		
	}	
	return -1;
	}
	
	public static void main(String args[]){
		
		int[] arr = {10,20,30,40,50,60};
		
		int key = 30;
		int result = arrayCheck(arr, key);
        if(result == -1){
			System.out.print("Element nor found");
		}else{
			System.out.print("Element found at index " + result);
		}

	}
}