class main01{
	
	void bubble(int arr[]){
		int n = arr.length;
		for(int i = 0;i < n -1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}	
	
	void display(int arr[]){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		}
	
	
	public static void main(String args[]){
		main01 b1 = new main01();
		
		int arr[] ={5, 2, 9, 1, 5, 6};
		int arr1[] ={3,2,1};
		int arr2[] ={1,2,3};
		
		System.out.println("Unsorted Array");
		b1.display(arr);
		b1.display(arr1);
		b1.display(arr2);
		b1.bubble(arr);
		b1.bubble(arr1);
		b1.bubble(arr2);
		
		System.out.println("Sorted Array with Bubble Sort");
		b1.display(arr);
		b1.display(arr1);
		b1.display(arr2);
		
		
	}
}