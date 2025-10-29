class MergeSort{
	void mergesort(int arr[], int start, int end){
		if(start < end){
			int mid = start + (end - start)/2;
			mergesort(arr, start, mid);
			mergesort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}
	void merge(int arr[], int start, int mid, int end){
		int n1 = mid - start + 1;
		int n2 = end - mid;
		
		int Start[] = new int[n1];
		int End[] = new int[n2];
		
		for(int i = 0; i < n1; i++)
			Start[i] = arr[start + i];
		for(int j = 0; j < n2; j++)
			End[j] = arr[mid + 1 + j];
		
		int i=0,j=0;
		int k = start;
		
		while(i < n1 && j < n2){
			if(Start[i] < End[j]){
				arr[k] = Start[i];
				i++;
			}else{
				arr[k] = End[j];
				j++;
			}
			k++;
		}
		while (i < n1){
			arr[k] = Start[i];
			i++;
			k++;
		}
		while (j < n2){
			arr[k] = Start[j];
			j++;
			k++;
		}
	}
	
	int display(int arr[]){
		int x = arr.length;
		for(int i = 0; i < x; i++){
			System.out.print(arr[i] + " ");
		}
		return x;
	}
	
	public static void main(String args[]){
		MergeSort m1 = new MergeSort();
		
		int arr[] = {12,23,98,65,45,11};
		int x = arr.length;
		
		System.out.print("Unsorted Array: ");
		m1.display(arr);
		System.out.println();
		
		System.out.print("Sorted Array with Merge Sort : ");
		m1.mergesort(arr, 0, x-1);
		
		m1.display(arr);
		System.out.println();
	}
}