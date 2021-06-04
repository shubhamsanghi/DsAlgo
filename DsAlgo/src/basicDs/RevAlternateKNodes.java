package basicDs;
import java.util.*;

/*{
	static Node head;
	Node temp;
	
	static class Node
	{
		int data;
		Node next;
	
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public void push(int d)
	{
		Node NN = new Node(d);
		NN.next = head;
		head = NN;
	}
	
	public void print(Node head)
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public int len(Node head)
	{
		Node temp = head;
		int c = 0;
		while(temp != null)
		{
			c++;
			temp = temp.next;
		}
		return c;
	}
	public void Reverse(Node head, int k)
	{
		int c = -1;
		Node temp = head;
		while(temp != null)
		{
			c++;
			if(c%2 == 0)
				temp = JustAdd(temp, k);
			else 
				temp = RevAdd(temp, k);
		}
	}
	public Node JustAdd(Node temp1, int k1)
	{
		int k = k1;
		Node temp = temp;
		for(int i = 0;i<k;i++)
		{
			temp = temp.next;
		}
		return temp	;
	}
	public Node RevAdd(Node temp1, int k1)
	{
		int k = k1;
		Node prev = null;
        Node current = temp1;
        Node next = null;
        
		for(int i = 0;i<k;i++)
		{
			next = current.next;
            current.next = prev;
            prev = current;
            current = next;
		}
		current = prev;
		return current;  
	}
	public static void main(String[] args) 
	{
		RevAlternateKNodes l = new RevAlternateKNodes();
		l.push(11);
		l.push(10);
		l.push(9);
		l.push(8);
		l.push(7);
		l.push(6);
		l.push(5);
		l.push(4);
		l.push(3);
		l.push(2);
		l.push(1);
		l.push(0);
		
		l.print(head);
		
		l.Reverse(head,3);
		
		l.print(head);
	}
}*/
public class RevAlternateKNodes 
{
    static Node head;
 
    class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    Node kAltReverse(Node head, int k) {
        return _kAltReverse(head, k, true);
    }
 
    Node _kAltReverse(Node node, int k, boolean b) {
        if (node == null) {
            return null;
        }
 
        int count = 1;
        Node prev = null;
        Node current = node;
        Node next = null;
 
            next = current.next;
 
            if (b == true) {
                current.next = prev;
            }
 
            prev = current;
            current = next;
            count++;
        }
 
        
        if (b == true) {
            node.next = _kAltReverse(current, k, !b);
            return prev;
        } 
        else {
            prev.next = _kAltReverse(current, k, !b);
            return node;
        }
    }
 
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    void push(int newdata) {
        Node mynode = new Node(newdata);
        mynode.next = head;
        head = mynode;
    }
 
    public static void main(String[] args) {
    	RevAlternateKNodes list = new RevAlternateKNodes();
 
        for (int i = 20; i > 0; i--) {
            list.push(i);
        }
        System.out.println("Given Linked List :");
        list.printList(head);
        head = list.kAltReverse(head, 3);
        System.out.println("");
        System.out.println("Modified Linked List :");
        list.printList(head);
    }
}

























