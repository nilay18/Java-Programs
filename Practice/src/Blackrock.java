import java.util.Stack;

public class Blackrock {
	
	public static void  main(String[] args) {
		
	Stack<Character> temp = new Stack<Character>();
    //ignoring charcters except alphanumeric using regular expression.
    String st = "Hip, hip,       hooray!";
    st = st.replaceAll("[^a-zA-Z0-9]","");
    System.out.println(st);
    int i =0;
    while(i<st.length())
    {
      if(st.charAt(i) == ' ') 
      {
        i++;
        continue;
      }
      //convert to lower case
      char t = Character.toLowerCase(st.charAt(i));
      System.out.println(t);
      temp.push(t);
      i++;
    }
    while(!temp.isEmpty())
    {
      System.out.print(temp.pop());
      if(!temp.isEmpty()) System.out.print("-");
    }
}
}
