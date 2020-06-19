//Divide and Conquer 
//Time O(nlogn)
//Space O(n) using temporary array to store l and r array
public class MergeSort {
	static int[] arr;
	
	public static void mergeSort(int left,int right)
	{
		if(left<right)
		{
			int mid = left + (right-left)/2;
			mergeSort(left,mid);
			mergeSort(mid+1,right);
			merge(left,right,mid);
		}
		
	}
	
	public static void merge(int left,int right,int mid)
	{
		int l1 = mid-left+1; //length of left subarray
		int l2 = right - mid; //length of right subarray
		//taking temporary left and right subarray so that we can start putting numbers from low to high
		int[] l = new int[l1];
		int[] r = new int[l2];
		for(int i=0;i<l1;i++)
		{
			l[i] = arr[left+i];
		}
		for(int i=0;i<l2;i++)
		{
			r[i] = arr[mid+i+1];
		}
		//start merging according to the values in l and r array
		int i =0,j=0;
		int k = left; //index of arr
		while(i<l1 && j<l2)
		{
			if(l[i]<r[j])
			{
				arr[k] = l[i];
				i++;
			}
			else
			{
				arr[k] = r[j];
				j++;
			}
			k++;
		}
		//add the remaining elements of l and r since length can be different
		while(i<l1)
		{
			arr[k] = l[i];
			i++;
			k++;
		}
		while(j<l2)
		{
			arr[k] = r[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args)
	{
		arr = new int[] {1,4,73,7,84,3467,33,883,7359,362,574,0,1,4};
		mergeSort(0,arr.length-1);
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}
}
