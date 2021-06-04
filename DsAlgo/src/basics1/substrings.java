package basics1;
import java.util.*;


public class substrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(rec(s,e));
	}
	static int rec(int s,int e)
	{
		if (s==e)
			return 1;
		if (s>e)
			return 0;
		int c = 0;
		for(int i=1;i<=6;i++)
		{
			c +=rec(s+i,e);
		}
		return c;
		
		
			
	}

}