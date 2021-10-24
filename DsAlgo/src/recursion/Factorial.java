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
		for(int i=0;i<17;i++)
			System.out.println(print(i));

	}

}