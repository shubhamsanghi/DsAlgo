package dynamicProgramming;
import java.util.*;

public class KnapsackRecursive 
{
    static int knapSack(int W, int wt[], int val[], int n)
    {
        if (n == 0 || W == 0)
            return 0;
 
        if (wt[n - 1] > W)
        	return knapSack(W, wt, val, n - 1);
 
        else
            return Math.max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
    }
 
    public static void main(String args[])
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}


/*{
	static int knap(int w[], int v[], int W, int n)
	{
		if(n == 0 || W == 0)
			return 0;
		if(w[n-1] <= W)
			return Math.max(knap(w, v, W, n-1),(v[n-1] + knap(w, v, W-w[n], n-1)));
		else if(w[n-1] > W)
			return knap(w, v, W, n-1);
		
		
	}

	public static void main(String[] args) 
	{
		int w[] = {10, 20, 30 };
		int v[] = {60, 100, 120};
		int W = 50;
		int n = 3;
		System.out.println(knap(w, v, W, n));
	}
}*/
