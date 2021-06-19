package greedyAlgorithm;

public class IndianCoinChange 
{

	public static void main(String[] args) 
	{
		int n = 93	;
		n+=1;
		int[] den = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
		while(n != 0)
		{
			for(int i=9; i>=0;i--)
			{
				if(n>den[i])
				{
					System.out.println(den[i]);
					n= n-den[i];
					break;
				}
				
			}

		}
		System.out.println(n);

	}

}
