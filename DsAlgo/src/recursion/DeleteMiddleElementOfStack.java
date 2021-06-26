package recursion;
import java.util.*;

public class DeleteMiddleElementOfStack 
{
	static void del(Stack<Integer> stack, int n, int c)
	{
		if(stack.size()==0)
			return;
		int x = stack.pop();
		del(stack, n, c+1);
		if(c != n/2)
			stack.push(x);
		
			
	}

	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<>();
		stack.add(13);
		stack.add(65);
		stack.add(85);
		stack.add(1);
		stack.add(23);
		int n = 5;
		
		del(stack, n, 0);
		
		while (!stack.empty())
        {
            int p=stack.pop();
            System.out.print(p + " ");
        }
		
	
	}

}
