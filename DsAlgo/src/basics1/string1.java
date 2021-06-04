package basics1;
import java.util.*;

public class string1 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = "dddddddddddddddddddddddddddddddddd";
		int[] f = new int[26];
		for(int i=0;i<26;i++)
		{
			f[i] = 0;					 
		}
		for(int i=0;i<s.length();i++)
		{
			f[s.charAt(i)-97]++;					 
		}
		char ans = 'a';
		int m = 0;
		for(int i=0;i<26;i++)
		{
			if(f[i]>m)
			{
				m= f[i];
				ans = (char)((int)('a')+i);
			}
		}
		System.out.println(ans +","+ m);
	}
}