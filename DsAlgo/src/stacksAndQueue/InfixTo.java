package stacksAndQueue;
import java.util.*;

public class InfixTo 
{
	public static String Check(String s)
	{
		Stack<Character> s1 = new Stack<Character>();
		String res = "";
		for(int i=0;i<s.length();i++)
			{
				char ch = s.charAt(i);
				if(Character.isLetterOrDigit(ch))
					res += ch;
				else if(ch == '(')
					s1.push(ch);
				else if(ch == ')')
				{
					while(s1.empty() && s1.peek() != '(')
					{
						res = res + s1.peek();
						s1.pop();
					}
					if(!s1.empty())
						s1.pop();
				}
				else
				{
					while(s1.empty() && prec(s1.peek()) >= prec(ch))
					{
						res = res + s1.peek();
						s1.pop();
					}
					s1.push(ch);
				}
			}
		while(!s1.empty())
		{
			res = res + s1.peek();
			s1.pop();
		}
		return res;
	}	
	public static int prec(char ch)
	{
		if(ch == '*' || ch == '/')
			return 2;
		else 
			return 1;
	}
	public static void main(String[] args) 
	{
		String s = "(a-b/c)*(a/k-l)";
		String a = Check(s);
		System.out.println(a);	
	}
}












