import java.util.*;

public class GenerateParentheses {
		public static List<String> generateParenthesis(int numPairs) {
		  List<String> result = new ArrayList<>();
		  directedGenerateBalancedParentheses(numPairs, numPairs, "", result); // kick off the recursion
		  return result;
		}

		private static void directedGenerateBalancedParentheses(int numLeftParensNeeded , int numRightParensNeeded,
		                                                        String parenStringInProgress, List<String> result) {

		  if (numLeftParensNeeded == 0 && numRightParensNeeded == 0) {
		    result.add(parenStringInProgress);
		    return;
		  }
		  if (numLeftParensNeeded > 0) {
		    directedGenerateBalancedParentheses(numLeftParensNeeded - 1, numRightParensNeeded,
		                                        parenStringInProgress + "(", result);
		  }
		  if (numLeftParensNeeded < numRightParensNeeded) {
		    directedGenerateBalancedParentheses(numLeftParensNeeded, numRightParensNeeded - 1,
		                                          parenStringInProgress + ")", result);
		  }

		}
		
		public static void main(String args[])
		{
			List<String> out = new ArrayList<>();
			out = generateParenthesis(3);
			for(String a: out)
			{
				System.out.println(a);
			}
			System.out.println(out.size());
		}
}

