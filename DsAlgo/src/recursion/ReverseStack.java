package recursion;
import java.util.*;

public class ReverseStack 
{
	static void reverse(Stack<Integer> stack)
	{
		if(stack.size() > 0)
		{
			int x = stack.pop();
			reverse(stack);
			insert(stack, x);
		}
	}
	static void insert(Stack<Integer> stack,int x)
	{
		if(stack.isEmpty())
			stack.push(x);
		else
		{
			int a = stack.pop();
			insert(stack,x);
			stack.push(a)	;	
		}
	}

	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<>();
		stack.add(13);
		stack.add(65);
		stack.add(85);
		stack.add(1);
		stack.add(23);
		
		reverse(stack);
		
		while (!stack.empty())
        {
            int p=stack.pop();
            System.out.print(p + " ");
        }
		
	
	}

}
