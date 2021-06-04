package stacksAndQueue;
import java.util.*;

public class QueueUsingStack 
{
	static class Queue
	{
		static Stack<Integer> s1 = new Stack<integer>();
		static Stack<Integer> s2 = new Stack<integer>();

		static void Enqueue(int n)
		{
			while (s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			s1.push(n);
		
			while (s2.isEmpty())
			{
				s1.push(s2.pop());
			}
		}
		static int Dequeue()
		{
			if (s1.isEmpty()) 
	        { 
	            System.out.println("Q is Empty"); 
	            System.exit(0); 
	        }
			
			return (s1.pop());
		}
	};

	public static void main(String[] args) 
	{
		Queue q = new Queue(); 
	    q.Enqueue(1); 
	    q.Enqueue(2); 
	    q.Enqueue(3); 
	  
	    System.out.println(q.Dequeue()); 
	    System.out.println(q.Dequeue());
	    System.out.println(q.Dequeue());
	}

}
