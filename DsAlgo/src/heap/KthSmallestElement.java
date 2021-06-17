package heap;
import java.util.*;

public class KthSmallestElement 
{
	static int func(int arr[], int n, int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i < n;i++) 
		{
			if(pq.size() < k)
				pq.add(arr[i]);
			else 
				pq.remove();
		}
		return pq.peek();
	
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int arr[] = {7, 10 , 4, 3, 20, 15};
		int n = 6;
		System.out.println("kth smallest element is: " + func(arr,n,k));
		

	}

}
