package basics1;
import java.util.*;

public class Kadanes 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int cs = 0,m= 0;
		for(int i=0;i<n;i++)
		{
			cs = cs+arr[i];
			if(cs<0) 
				cs = 0;
			m = Math.max(m, cs);
		}
		System.out.println(m);
		
	}
}