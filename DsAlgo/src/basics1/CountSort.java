package basics1;
import java.util.*;

public class CountSort {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int m = 0;
		for(int i=0;i<n;i++)
		{
			m = Math.max(m, arr[i]);
		}
		
		m++;
		int brr[]= new int[m];
		for(int i=0;i<m;i++)
		{
			brr[i] = 0;
		}
		
		for(int i=0;i<n;i++)
		{
			++(brr[arr[i]]);
		}
		
		for(int i=1;i<m;i++)
		{
			brr[i]+=brr[i-1];
		}
		
		int crr[] = new int[n];
		for(int i=n-1;i>=0;i--)
		{
			crr[--(brr[arr[i]])] = arr[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(crr[i]);
		}
	}
}
