package basics1;
import java.util.*;


public class TowerOFHannoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		rec(n,'a','b','c',c);

		
	}
	static void rec(int n, char s ,char d , char h,int c)
	{
		if (n==0)
			return;
		rec(n-1,s,h,d,c++);
		System.out.println(s+ "to"+ d);
		rec(n-1,h,d,s,c++);
		
			
	}

}
