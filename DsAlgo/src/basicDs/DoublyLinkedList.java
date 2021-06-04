package basicDs;
import java.util.*;

public class DoublyLinkedList 
{
	public Node head;
	
	static class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int d)
		{
			data = d;
			next = null;
			prev = null;
		}
	}
	
	void InsertAtTail(Node head, int val)
	{
		if(head == null)
		{
			InsertAtHead(head, val);
			return;		
		}
		
		Node n = new Node(val); 	
		Node temp = head;
		
		while(temp.next != null)
			temp = temp.next;
		
		temp.next = n;
		n.prev = temp; 
		
	}
	void InsertAtHead(Node head, int val)
	{
		Node N = new Node(val);
		N.next = head;
		if(head != null)
			head.prev = N;
		 
		head = N;
		
	}
	void Display(Node head) 
	{
		Node temp = head;
		while(head != null) 
		{
			System.out.println(head.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) 
	{
		Node head = null;
		DoublyLinkedList l = new DoublyLinkedList();
		l.InsertAtTail(head, 21);	
		l.InsertAtTail(head, 32);		
		l.InsertAtTail(head, 23);		
		l.InsertAtTail(head, 98);		
		l.InsertAtTail(head, 218);
		
		l.Display(head);
		
		l.InsertAtHead(head, 23);		
		l.InsertAtHead(head, 98);		
		l.InsertAtHead(head, 218);
		
		l.Display(head);
		


	}

}











