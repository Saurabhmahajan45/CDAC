class main04{
	void mergeSort(int arr[], int start, int end){
		if(start < end){
		int mid = start + (end - start)/2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);
		merge(arr, start, mid, end);
		}
	}
	
	void merge(int arr[], int start, int mid, int end){
		int n1 = mid - start + 1;
		int n2 = end - mid;
		
		int Start[] = new int[n1];
		int End[] = new int[n2];
		
		for(int i = 0; i< n1;i++)
			Start[i] = arr[start + i];
		
		for(int j = 0; j< n2; j++)
			End[j] = arr[mid+1 + j];
		
		int i = 0, j = 0;
		int k = start;
		
		while(i < n1 && j < n2){
			if(Start[i] <= End[j])
			{
				arr[k] = Start[i];
				i++;
			}else{
				arr[k] = End[j];
				j++;
			}
			k++;
		}
		while(i< n1){
			arr[k] = Start[i];
			i++;
			k++;
		}
		while(j < n2){
			arr[k] = End[j];
			j++;
			k++;
		}
	}
	
	
	
	void display(int arr[]){
		int n = arr.length;
		for(int i = 0; i< n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		main04 m1 = new main04();
		
		int arr[] = {38,27,43,3,9,82,10};
		//int arr1[] = {5,4,3,2,1};
		
		System.out.println("Unsorted Array");
		m1.display(arr);
		//m1.display(arr1);
        int n  = arr.length;
		m1.mergeSort(arr,0,n-1);
		//m1.mergeSort(arr1,0,n-1);
		System.out.println("Sorted Array: Merge Sort");
			m1.display(arr);
		//m1.display(arr1);
	}
}