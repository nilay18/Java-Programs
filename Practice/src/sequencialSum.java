//prefix sum
public class sequencialSum {
	
	public static int seqsum(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			arr[i] +=arr[i-1];
		}
		int i =1;
		int start = 0, end =0;
		int sum = arr[0];
		while(start+i<arr.length)
		{
			start = start + i;
			end = start+i;
			System.out.println(start + " " +end);
			if(end>=arr.length)
			{
				end = arr.length-1;
			}
			sum += arr[end]-arr[start];
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		int[] arrs = new int[] {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println(seqsum(arrs));
	}
}
