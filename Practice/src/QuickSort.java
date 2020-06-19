
public class QuickSort {
	
	public int partition(int arr[], int low, int high)
	{
		int i = low-1;
		int pivot = arr[high];
		for(int j =low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		//swap pivot
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;		
		return i+1;
	}
	
	public void quickSort(int arr[], int low,int high)
	{
		if(low<high)
		{
			int part = partition(arr,low,high);
			quickSort(arr,low,part-1);
			quickSort(arr,part+1,high);
		}
	}

	public void printArray(int arr[])
	{
		for(int i = 0; i <arr.length ; i++)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	//merge sorted arrays
	public int[] mergeSortedArray(int[] arr,int[] arr1)
	{
		int [] merged = new int[arr.length+arr1.length];
		int i=0,j=0,k=0;
		while(i<arr.length && j<arr1.length)
		{
			if(arr[i]<=arr1[j])
			{
				merged[k++] = arr[i++];
			}
			else
			{
				merged[k++] = arr1[j++];
			}
		}
		while(i<arr.length)
		{
			merged[k++] = arr[i++];
		}
		while(j<arr1.length)
		{
			merged[k++] = arr1[j++];
		}
		return merged;
	}
	
	public static void main(String args[])
	{
		int arr[] = {12,13,56,2,1,34,89,5};
		int arr1[] = {56,878,90,4,56,78,98};
		QuickSort temp = new QuickSort();
		temp.quickSort(arr, 0,arr.length-1);
		temp.quickSort(arr1,0,arr1.length-1);
		temp.printArray(temp.mergeSortedArray(arr,arr1));
	}
}
