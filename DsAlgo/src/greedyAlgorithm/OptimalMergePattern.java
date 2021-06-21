package greedyAlgorithm;

import java.util.PriorityQueue;

public class OptimalMergePattern 
{
	static int minCost(int arr[], int n)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0;i < n;i++) 
		{
			pq.add(arr[i]);
		}
		
		int sum = 0;
		while(pq.size() > 1)
		{
			int f = pq.poll();
			int s = pq.poll();
			pq.add(s+f);			
			sum += f + s;
		}
		return sum;
	
	}

	public static void main(String args[])
    {
        int len[] = { 5, 2, 4, 7 };
        int size = len.length;
        System.out.println("Minimum cost: " + minCost(len, size));
    }

}

