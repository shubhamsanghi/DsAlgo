package basics1;
import java.util.*;

public class SeiveOfEratosthenes 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] prime = new int[100];
		for(int i=0;i<100;i++) 
		{
			prime[i] = 0;
		}
		for(int i=2;i<=n;i++) 
		{
			if(prime[i] == 0)
			{
				for(int j=i*i;j<=n;j+=i)
					prime[j] = 1;
			}
		}
		for(int i=2;i<=n;i++) 
		{
			if(prime[i] == 0)
				System.out.println(i);
		}
		
		

	}

}
