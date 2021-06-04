package basics1;
import java.util.*;

public class RecReverse 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		RecReverse obj = new RecReverse();
		obj.reverse(s);
		//System.out.println(reverse(s));
	}
	static void reverse(String s)
	{
		if((s == null) || (s.length() <= 1))
			System.out.print(s);
		else 
		{
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1));

		}
		
	}
}
