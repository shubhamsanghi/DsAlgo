package problems;
import java.util.*;

public class MaxSumSubarray 
{
	static int maxSubArraySum(int[] a,int n,int k,int x)
	{
		int sum = 0,ans = 0;
		for(int i = 0; i<k; i++)
		{
			sum += a[i];
		}
		if(sum < x)
			ans = sum;
		for(int i=k; i < n; i++)
		{
			sum -= a[i-k];
			sum += a[i];
			if(sum < x)
				ans = Math.max(ans,sum);
		}
		return ans;
	}
	

	public static void main (String[] args)
    {
        int[] a = {7, 5, 4, 6, 8, 9};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a, 6, 3, 20));
    }

}
