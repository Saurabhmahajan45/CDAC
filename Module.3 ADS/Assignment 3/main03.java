class main03{
	
	void selection(int arr[]){
		int n = arr.length;
		for(int i=0; i < n-1;i++){
			int min = i;
			for(int j = i+1;j<n; j++){
				if(arr[j] < arr[min])
				min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	void display(int arr[]){
		int n = arr.length;
		for(int i = 0;i<n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		main03 s1 = new main03();
		
		int arr[] = {64,25,12,22,11};
		int arr1[] = {29,10,14,37,13};
		
		System.out.println("Unsorted Array");
		s1.display(arr);
		s1.display(arr1);
		
		s1.selection(arr);
		s1.selection(arr1);
		System.out.println("Sorted Array with Selection Sort");
		s1.display(arr);
		s1.display(arr1);
		
	}
}