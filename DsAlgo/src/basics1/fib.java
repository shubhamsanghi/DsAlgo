package basics1;
import java.util.*;

public class fib {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(rec(a));
	}
	static int rec(int n)
	{
		if(n == 0 || n==1)
			return n;
		else 
			return rec(n-1) + rec(n-2);
	}
}