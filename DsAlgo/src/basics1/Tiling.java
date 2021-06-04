package basics1;
import java.util.*;
	
public class Tiling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(rec(n));
	}
	static int rec(int n)
	{
		if (n==1)
			return 1;
		if (n==0)
			return 0;
		return rec(n-1)+ rec(n-2);
			
	}

}