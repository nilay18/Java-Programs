import java.util.Arrays;

public class selectionSort {
	public static int[] sort(int[] array)
	{
		int n = array.length; 
        for (int i = 0; i < n-1; i++) 
        {  
            int min_idx = i; 
            for (int j = i+1; j < n; j++)
            { 
                if (array[j] < array[min_idx]) 
                {
                    min_idx = j; 
                }
            }
            int temp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = temp; 
        }
        return array;
	}

	public static void main(String args[]) 
    { 
        int arr[] = { 12,11,13,5,6 }; 
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr)));        
    }
}
