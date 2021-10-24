package miscellaneous;
import java.util.*;

public class Crypto1 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String s = sc.nextLine();
		String s1 = "";
		for(int i=0;i< s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch >= 120 && ch != 32)
				ch = (char)((int)ch-23);
			else if(ch != 32)
				ch = (char)((int)ch + 3);
			s1 = s1 + ch;
		}
	System.out.println(s1);
	}

}
