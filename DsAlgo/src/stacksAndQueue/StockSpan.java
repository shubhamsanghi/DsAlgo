package stacksAndQueue;

import java.util.Stack;

public class StockSpan {
	
	public static void Calc(int[] stock)
	{
		Stack<Integer> st = new Stack<Integer>();
		int i = 1;
		st.push(i);
		//System.out.print(i+" ");
		for(i=0;i<stock.length;i++)
		{
			
			while((!st.isEmpty()) && (stock[st.peek()] <= stock[i]))
				st.pop();
			
			if(st.isEmpty())
				System.out.print((i+1)+" ");
			else
				System.out.print(i-st.peek()+" ");
			
			st.push(i);	
		}
		
	}

	public static void main(String[] args) 
	{
		//int stock[] = {100,80,60,70,60,75,85};
		int[] stock = {10, 4, 5, 90, 120, 80};
		Calc(stock);

	}

}
