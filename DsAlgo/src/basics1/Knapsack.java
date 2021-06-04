package basics1;
import java.util.*;
	
public class Knapsack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] w = {10,20,30};
		int[] v = {100,50,150};
		int W = 50; 
 		System.out.println(rec(v,w,3,W));
	}
	static int rec(int[] v,int[] w,int n,int W)
	{
		if (n==0 || W==0)
			return 0;
		if (w[n-1]>W)
			return rec(v,w,n-1,W);
		return Math.max((rec(v,w,n-1,W-w[n-1])+v[n-1]),rec(v,w,n-1,W));
			
	}

}