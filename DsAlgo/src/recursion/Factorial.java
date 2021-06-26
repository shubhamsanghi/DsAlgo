package recursion;

public class Factorial
{
	static int print(int n)
	{
		if(n == 0)
			return 1;
		
		return n * print(n-1);
	}

	public static void main(String[] args) 
	{
		int n = 7;
		System.out.println(print(n));

	}

}