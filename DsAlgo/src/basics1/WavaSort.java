package basics1;
import java.util.*;

public class WavaSort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=1;i<n;i+=2)
		{
			if(arr[i-1] < arr[i]) 
			{
				int t = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = t;
			}
			if (arr[i] > arr[i+1] && i<=n-2)
			{
				int t = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = t;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}