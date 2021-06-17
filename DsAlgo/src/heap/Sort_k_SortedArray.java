package heap;
import java.util.*;

public class Sort_k_SortedArray 
{
	static void func(int arr[], int n, int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i < k;i++) 
		{
			pq.add(arr[i]);
		}
		System.out.println(pq.poll());
		
		for(int i=k;i < n;i++) 
		{
			pq.add(arr[i]);
			if(pq.size() >= k)
				System.out.println(pq.poll());
		}
		
		for(int i=0;i < pq.size();i++) 
		{
			System.out.println(pq.poll());
		}
	
	}

	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		int k = 4;
		int arr[] = {6, 5, 3, 2, 8, 10, 9};
		int n = 7;
		func(arr,n,k);
		

	}

}
