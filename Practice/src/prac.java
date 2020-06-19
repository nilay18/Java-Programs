import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Stack;

public class prac {
	
	public static int stringSame(String s)
	{
		if(s == null  || s.length()==0) return 0;
		int count1 =0,count2=0;
		int count=0;
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i)=='L')
			{
				count1++;
			}
			if(s.charAt(i)=='R')
			{
				count2++;
			}
			if(count1 == count2) count++;
		}
		return count;
	}
	public static void  main(String[] args)
	{
		Clock clk = Clock.systemDefaultZone();
		System.out.println(clk);
		System.out.println(clk.millis());
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		System.out.println(LocalDate.now());	
		System.out.println(LocalTime.now());
		System.out.println(10^20);
		Stack<Character> out = new Stack<>();
		out.add('I');
		out.add('O');
		while(!out.isEmpty())
		{
			System.out.print(out.pop()+"-");
		}
		String s = "yo-dude: like, ... []{}this is a string";
	    s = s.replaceAll("[^a-zA-Z0-9]", "");
	    System.out.println(s);
	    Singleton obj = Singleton.getInstance();
	    obj.printSingle();
	    Singleton obj1 = Singleton.getInstance();
	    obj1.printSingle();
	    Singleton obj2 = Singleton.getInstance();
	    obj2.printSingle();
	    System.out.println(prac.stringSame("LLLLRRRRLRL"));
	    
	    int x =1;
	    if(x ==2)
	    {
	    	System.out.println("First if");
	    }
	    if(x < 2)
	    {
	    	System.out.println("Second if");
	    }
	    else
	    {
	    	System.out.println("Else");
	    }
	    char w = '1';
	    System.out.println(w-'0');
	}
}
