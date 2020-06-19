import java.util.Stack;

public class Addstrings {
	public static void main(String args[])
	{
		String s1 ="99";
		String s2 ="99";
		//s1 = new StringBuilder(s1).reverse().toString();
		//s2 = new StringBuilder(s2).reverse().toString();	
		int len1 = s1.length();
		int len2 = s2.length();
		int a1 =Integer.parseInt(s1);
		int a2 =Integer.parseInt(s2);
		int min_len = len1>=len2?len2:len1;
		Stack<Integer> stk = new Stack<>();
		for(int i=0;i<min_len;i++)
		{		
			stk.push((a1%10)+(a2%10));
			a1 /=10;
			a2 /=10;
		}
		if(a1==0 && a2>0)stk.push(a2);
		else if(a2==0 && a1>0) stk.push(a1);
		StringBuilder out = new StringBuilder();
		while(!stk.isEmpty())
		{
			out.append(Integer.toString(stk.pop()));
		}
		System.out.println(out);
	}
}
