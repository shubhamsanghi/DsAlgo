package heap;
import java.util.*;

public class Heap1 
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		pq.add(973);
		pq.add(12);
		pq.add(8);
		pq.add(793);
		
		System.out.println("head value using peek: " + pq.peek());
		System.out.println();

		
		Iterator<Integer> itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		pq.poll();
		
		Iterator<Integer> itr2 = pq.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println();
		
		pq.remove(12);
		Iterator<Integer> itr3 = pq.iterator();
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
		System.out.println();
		
        System.out.println("Priority queue contains 20 " + "or not?: " + pq.contains(20));

		
	}
	

}
