package basicDs;
import java.util.*;

public class FlyodsOrHareAndTortisAlgoForCycle {
	static Node head;
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
	 
	 Node slow;
	 Node fast;
	 void DetectLoop()
	 {
		 slow = head;
		 fast = head;
		 int flag = 0;
		 
		 while(slow != null && fast != null && fast.next != null)
		 {
			 slow = slow.next;
			 fast = fast.next.next;
			 
			 if (slow == fast)
			 {
				 flag = 1;
				 break;
			 } 
		 }
		 
		 if(flag == 1)
			 System.out.println("LOOP");
		 else
			 System.out.println("NO LOOP");
	 }
	 
	 void RemoveCycle()
	 {
		 slow = head;
		 while(slow != null && fast != null && fast.next != null)
		 {
			 slow = slow.next;
			 fast = fast.next;
			 
			 if (fast.next == slow.next )
			 {
				 fast.next = null;
			 }
				 
		 }
	 }

	public static void main(String[] args) 
	{
		FlyodsOrHareAndTortisAlgoForCycle l = new FlyodsOrHareAndTortisAlgoForCycle();
		l.push(271);
		l.push(32);
		l.push(32);
		l.push(448);
		l.push(37);
		l.push(2130);
		l.push(723);
		
		l.DetectLoop();
		
		l.head.next.next.next.next = l.head;
		
		l.DetectLoop();
		
		l.RemoveCycle();
		
		l.DetectLoop();


	}

}















