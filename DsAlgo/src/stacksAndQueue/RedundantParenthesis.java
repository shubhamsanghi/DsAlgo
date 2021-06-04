package stacksAndQueue;
import java.util.*;

public class RedundantParenthesis {
	public static Boolean Check(String s)
	{
		Stack<Character> s1 = new Stack<Character>();
		int flag = 0; 
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[' || ch == '+' || ch == '-' || ch == '*' || ch == '/')
				s1.push(ch);
			else if(ch == '}' || ch == ']' || ch == ')') 
			{
				if(s1.peek() == '(' || s1.peek() == '{' || s1.peek() == '[')
					flag = 1;
				else
				{
				while(s1.peek() == '+' || s1.peek() == '-' || s1.peek() == '*' || s1.peek() == '/')
					s1.pop();
				}
			}
		}
		if(flag == 0)
			return true;
		else 
			return false;
	}
 

	public static void main(String[] args) 
	{
		String s = "((a+b))";
		if(Check(s))
			System.out.println(" not redundant");
		else
			System.out.println(" redundant");
		

	}

}
