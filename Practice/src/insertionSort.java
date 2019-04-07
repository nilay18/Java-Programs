import java.util.Arrays;

public class insertionSort {
	
	public static int[] sort(int[] array)
	{
		int size=array.length;
		for(int i=1;i<size;i++)
		{
			int key=array[i];
			int j=i-1;
			while(j>=0 && array[j]>key)
			{
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
		}
		return array;
	}

	public static void main(String args[]) 
	    { 
	        int arr[] = { 12, 11, 13, 5, 6 }; 
	        System.out.println(Arrays.toString(arr));
	        System.out.println(Arrays.toString(sort(arr)));
	        
	    } 
}
