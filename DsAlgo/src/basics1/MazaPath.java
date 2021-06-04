package basics1;
import java.util.*;


public class MazaPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(rec(n,0,0));
	}
	static int rec(int n,int i,int j)
	{
		if (i==n-1 && j==n-1)
			return 1;
		if (i>=n || j>=n)
			return 0;
		return rec(n,i+1,j)+ rec(n,i,j+1);
			
	}

}
