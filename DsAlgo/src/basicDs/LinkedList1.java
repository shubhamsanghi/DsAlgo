package basicDs;
import java.util.*;

public class LinkedList1 
{
	
	Node head;
	
	void add(int data)
	{
		Node toAdd = new Node(data);
		
		if(head == null)
		{
			head = toAdd;
			return;
		}
		
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next =toAdd;
			
	}
	
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			next = null;
			
		}
	}

	public static void main(String[] args) 
	{
		
		LinkedList myll = new LinkedList();
		myll.add(157);
		
		
		/*List<Integer> ll = new LinkedList<>();
		ll.add(12);
		ll.add(13);
		ll.add(3083);
		
		ll.toArray();
		ll.set(1, 3822);
		
		System.out.println(ll);*/
	}
}






