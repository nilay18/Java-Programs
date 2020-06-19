import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(reader);

    try {
        double purchasePrice = Double.parseDouble(in.readLine());
        double cash = Double.parseDouble(in.readLine());
        Main.calculateChange(purchasePrice, cash);
    } catch (Exception e) {
        System.out.println(e);
    }
  }
  //Scaling the coin's value to 100 times for simpler calculation
  
  public static void calculateChange(double purchasePrice, double cash) {
    // Access your code here. Feel free to create other classes as required
    //Store register in hashmap with key as coin value and value as text like "One Pence" for printing at last.
    //Input PP and cash
    //If CH == PP print zero
    // if CH > PP coin change method
    // all other cases throw exception "Error"
    if(cash == purchasePrice)
    {
      System.out.print("Zero");
    }
    else if(cash > purchasePrice)
    {
      //change method
    	  HashMap<Integer,String> lookup = new HashMap<Integer,String>();
    	  lookup.put(1,"One Pence");
    	  lookup.put(2,"Two Pence");
    	  lookup.put(5,"Five Pence");
    	  lookup.put(10,"Ten Pence");
    	  lookup.put(20,"Twenty Pence");
    	  lookup.put(50,"Fifty Pence");
    	  lookup.put(100,"One Pound");
    	  lookup.put(200,"Two Pound");
    	  lookup.put(500,"Five Pound");
    	  lookup.put(1000,"Ten Pound");
    	  lookup.put(2000,"Twenty Pound");
    	  lookup.put(5000,"Fifty Pound");
    	  int[] coins = {1,2,5,10,20,50,100,200,500,1000,2000,5000};
    	  double tmp = Math.ceil((cash-purchasePrice)*100);
    	  int temp = (int) tmp;
    	  System.out.println(tmp);
    	  System.out.println(temp);
    	  change(temp, lookup,coins);
    }
    else
    {
      throw new IllegalArgumentException("ERROR");
    }
  }
  
  public static void change(int difference, HashMap<Integer,String> lookup, int[] coins)
  {
    int tm[] = new int[difference+1];
    int tr[] = new int[difference+1];
    tm[0] = 0;
    for(int i =1;i<=difference;i++)
    {
      tm[i] = Integer.MAX_VALUE-1;
      tr[i] = -1;
    }
    for(int j =0;j<coins.length;j++)
    {
      for(int i =1;i<=difference;i++)
      {
        if(i>=coins[j])
        {
          if(tm[i-coins[j]] +1 < tm[i])
          {
            tm[i] = 1 + tm[i-coins[j]];
            tr[i] = j;
          }
        }
      }
    }
    //traverse tr to get different coins
    if(tr[tr.length-1]==-1) throw new IllegalArgumentException("ERROR");
    int point = tr.length -1;
    while(point != 0)
    {
      int tmp = tr[point];
      System.out.print(lookup.get(coins[tmp]));
      point = point - coins[tmp];
      if(point !=0) 
      {
    	  System.out.print(",");
      }
    }     
  }

}