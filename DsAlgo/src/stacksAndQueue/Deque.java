package stacksAndQueue;
import java.util.*;

public class Deque {

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> ad= new ArrayDeque<>();
		
		ad.addFirst(298);
		ad.addFirst(13);
		ad.addFirst(64);
		ad.addFirst(63);
		
		ad.pop();
		System.out.println(ad.peek());
		
		ad.push(1297);
		ad.push(932);
		ad.pop();
		System.out.println(ad.pop());	

		

		


	}

}
