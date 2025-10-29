class main02{
	void insertion(int arr[]){
		int n = arr.length;
		for(int i = 1;i < n;i++){
			int curr = arr[i];
			int prev = i - 1;
			
			while(prev >= 0 && arr[prev] >= curr){
				 arr[prev+1] = arr[prev];
				 prev = prev-1;
			}
			arr[prev+1] = curr;
		}
	}
	
	void display(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		main02 i1 = new main02();
		int arr[] = {12,11,13,5,6};
		int arr1[] = {4,3,2,10,12};
		
		System.out.println("Unsorted array");
		i1.display(arr);
		i1.display(arr1);
		
		i1.insertion(arr);
		i1.insertion(arr1);
		System.out.println("Sorted Array: Insertion Sort");
		i1.display(arr);
		i1.display(arr1);
		
	}

}