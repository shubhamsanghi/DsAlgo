package hashmaps;
import java.util.*;

public class TopKMostFrequentElements 
{
	static void print_N_mostFrequentNumber(int[] arr, int n,int k)
	{
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) 
		{
			mp.put(arr[i],mp.getOrDefault(arr[i], 0) + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>( (a, b) -> a.getValue().equals(b.getValue()) ? Integer.compare(b.getKey(), a.getKey()) : Integer.compare(b.getValue(), a.getValue()));

		for (Map.Entry<Integer, Integer> entry :
			mp.entrySet())
			queue.offer(entry);

		for (int i = 0; i < k; i++)
		{
			System.out.println(queue.poll().getKey());
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 3, 1, 4, 4, 5, 2, 6, 1 };
		int n = arr.length;
		int k = 2;
	
		print_N_mostFrequentNumber(arr, n, k);
	}
}


