package basics1;
import java.util.*;

public class longestsubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		int t1,t2,m = 0,c= 1;
		
		for(int i=1;i<n-1;i++)
		{
			t1 = arr[i-1] - arr[i];
			t2 = arr[i] - arr[i+1];
			if(t1 == t2)
				c++;
			else 
				c = 1;
			if(c>m)
				m = c;
		}
		System.out.println(m+1);

	}

}
