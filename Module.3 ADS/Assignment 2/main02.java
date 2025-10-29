class main02{
	public static void main(String args[]){
		//int[] arr = {10, 25, 47, 3, 19};
		int[] arr = {15, 8, 22, 5, 19};
		
		int min = 1000;
    for (int i =0; i < arr.length; i++){
		if (arr[i] < min){
			min = arr[i];
		}
	}	
	System.out.println(min);
	}
}