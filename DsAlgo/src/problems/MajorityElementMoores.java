package problems;

public class MajorityElementMoores {
	
	static int majorityElement(int[] arr,int n)
	{
		int c = 1;
		int e = arr[0];
		for(int i=1;i<n;i++)
		{
			if(e == arr[i])
				c++;
			else if(e != arr[i])
				c--;
			if(c == 0)
			{
				c=1;
				e = arr[i];
			}
		}
		return e;
	
		
	}

	public static void main(String[] args)
	{
	    //int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
	   //int n = 7;
		int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		int n = 9;
	 
	    System.out.println(majorityElement(arr, n));
	}

}
