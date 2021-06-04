package basics1;
import java.util.*;

public class getBit 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println((5 & (1<<2))!=0);
		System.out.println((5 | (1<<1))!=0);
		boolean isPowerOfTwo(int x)
		{
		     return x && (!(x & (x - 1)));
		}
		System.out.println(isPowerofTwo(16));

	}

}
