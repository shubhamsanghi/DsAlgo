package problems;

public class MinimumSubarraySize 
{
	static int minSubArraySum(int[] arr,int n, int x)
	{
		int sum = 0,ans = n+1;
		int b=0,e=0;
		
		while(e<n || b<e)
		{
			if(sum > x)
				ans = Math.min(ans, e-b);
			if(sum <= x && e < n)
				sum += arr[e++];
			if(sum > x && b < n)
				sum -= arr[b++];
		}
		return ans;
	}
	
	public static void main (String[] args)
    {
		int[] arr = {1, 4, 45, 6, 10, 19};
		int a = minSubArraySum(arr, 6, 51);
	    System.out.println("Minimum contiguous sum is " + a);
	}
}