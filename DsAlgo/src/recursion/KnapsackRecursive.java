package recursion;
import java.util.*;

public class KnapsackRecursive 
{
	static double knap(int w[], int v[], int W, int n)
	{
		if(n == 0 || W == 0)
			return 0.0;
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

}
