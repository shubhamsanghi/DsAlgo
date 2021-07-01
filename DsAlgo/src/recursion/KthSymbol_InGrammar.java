package recursion;

public class KthSymbol_InGrammar 
{
	static int func(int n, int k)
	{
		if(n == 1)
			return 0;
		if(k%2 == 0)
			return func(n-1,k/2)==0 ? 1 : 0 ;
		else 
			return func(n-1,(k+1)/2);

	}

	public static void main(String[] args) 
	{
		int n = 3;
		int k = 3;
		System.out.println(func(n,k));
		


	}

}
