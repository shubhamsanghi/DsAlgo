package problems;
import java.util.*;	

public class SubarrayWithPalindromicConcatenation 
{
	
    public static boolean palindrome(int[] a, int i, int j)
    {
         while(i<j)
         {
             if(a[i] != a[j])
                 return false;
              
             i++;
             j--;
         }
         return true;
     }
   
    static int findSubArray(int []arr, int k)
    {
        int n= arr.length;
        
        for(int i=0; i<=n-k; i++)
        {
             if(palindrome(arr, i, i+k-1))
                 return i;
        }
       
        return -1;
    }
 
    public static void main (String[] args)
    {
        int []arr = { 2, 3, 5, 1, 3, 1 };
        int k = 3;
  
        int ans = findSubArray(arr, k);
  
        if (ans == -1)
            System.out.print(-1 + "\n");
  
        else
        {
            for(int i = ans; i < ans + k; i++)
                System.out.print(arr[i] + " ");
              
            System.out.print("\n");
        }
    }
}