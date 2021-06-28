package dynamicProgramming;
import java.util.*;

public class KnapsackMemoizaton 
{
    static int knapSack(int W, int wt[], int val[], int n, int mat[][])
    {
        if (n == 0 || W == 0)
            return 0;
        
        if(mat[n][W] != -1)
        	return mat[n][W];
        	
 
        if (wt[n - 1] > W)
        	return mat[n][W] = knapSack(W, wt, val, n - 1,mat);
 
        else
            return mat[n][W] = Math.max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1,mat), knapSack(W, wt, val, n - 1,mat));
    }
 
    public static void main(String args[])
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
    	int mat[][] = new int[n+1][W+1];
    	for(int i=0;i<=n;i++) 
    	{
        	for(int j=0;j<=W;j++)
        		mat[i][j] = -1;
    	}


        System.out.println(knapSack(W, wt, val, n,mat));
    }
}