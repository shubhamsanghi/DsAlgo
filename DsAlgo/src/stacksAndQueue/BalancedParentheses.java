package stacksAndQueue;
import java.util.*;

public class BalancedParentheses {
	public static Boolean Check(String s)
	{
		Stack<Character> s1 = new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[')
				s1.push(ch);
			else if(ch == '}' || ch == ']' || ch == ')')
				s1.pop();
		}
		if(s1.empty())
			return true;
		else 
			return false;
	}
 

	public static void main(String[] args) 
	{
		String s = "({[]})";
		if(Check(s))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
		

	}

}
