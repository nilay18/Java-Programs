import java.util.Arrays;

public class BinarySearch {
	
	public static int binarySearch(int[] array,int l,int r, int target)
	{ 
		if(l<=r)
		{	
			int m = (l+r+1)/2;
			if(array[m] == target)
			{
				return m;
			}
			else if(array[m] > target)
			{
				return binarySearch(array,l,m-1,target);
			}
			else if(array[m] < target)
			{
				return binarySearch(array,m+1,r,target);
			}
		}
		return 15;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {16,44,4565,34,24,78,864,3,45,67};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr,0,9,3));
		
	}
}
