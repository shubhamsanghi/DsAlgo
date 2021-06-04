package stacksAndQueue;
import java.util.*;

import java.util.Stack;

public class RectArea 
{
	static int getMaxArea(int hist[], int n)
	{
		Stack<Integer> s = new Stack<>();
		int m=0,t,a;
		int i = 0;
		
		while(i<n) 
		{
			if(s.empty() || hist[i]>=hist[s.peek()])
				s.push(i++);
			else
			{
				t = s.peek();
				s.pop();
				
				a = hist[t] * (s.empty()?i : i - s.peek() - 1);
				m=Math.max(m,a);
			}	
		}
		
		while (s.empty() == false)
        {
            t = s.peek();
            s.pop();
            a = hist[t] * (s.empty() ? i : i - s.peek() - 1);
       
			m=Math.max(m,a);
        }
        return m;
    }

	public static void main(String[] args) 
	{
		/*int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println("Maximum area is " + getMaxArea(hist, hist.length));*/
        int hist[] = { 2, 1, 2, 3, 1 };
        System.out.println("Maximum area is " + getMaxArea(hist, hist.length));
	}

}
