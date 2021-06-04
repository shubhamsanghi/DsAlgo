package basics1;
import java.util.*;

public class factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(fact(a));
	}
	static int fact(int n)
	{
		if(n == 0)
			return 1;
		else 
			return n*fact(n-1);
	}
}
