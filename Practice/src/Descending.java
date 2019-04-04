import java.util.*;
public class Descending {
	public static int descending(int input)
	{
		int [] count = new int[10];
		String inn = Integer.toString(input);
		for(int i=0;i<inn.length();i++) 
		{
			count[inn.charAt(i)-'0']++;
		}
		int output = 0,multiple=1;
		for(int i= 0; i<=9;i++)
		{
			while(count[i]>0)
			{
				output = output +(i*multiple);
				multiple = multiple*10;
				count[i]--;
			}
		}
		return output;
	}
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = inp.nextInt();
		System.out.println(descending(input));
	}
}