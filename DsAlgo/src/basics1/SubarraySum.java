package basics1;
import java.util.*;

public class SubarraySum {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();					 
		}
		int i=0,j=0,sum=0,st=-1,en=-1;
		while(j<i && sum+arr[j]<=s)
		{
			sum += arr[j];
			j++;
		}
		if(sum == s)
		{
			System.out.println(i+1 +" "+ j);
			System.exit(0);
		}
		while(j<n)
		{
			sum += arr[j];
			while(sum>s)
			{
				sum -=arr[i];
				i++;
			}
			if(sum == s)
			{
				st = i+1;
				en = j+1;
				break;
			}
			j++;	
		}
		System.out.println(st +"."+ en);
	}
	

}
