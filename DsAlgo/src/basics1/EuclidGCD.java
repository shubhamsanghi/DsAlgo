package basics1;
import java.util.*;

public class EuclidGCD 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(b!=0)
		{
			int t = a%b;
			a= b;
			b =t;	
		}
		System.out.println(a);
		
	}
}