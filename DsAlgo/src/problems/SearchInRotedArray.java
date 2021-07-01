package problems;

public class SearchInRotedArray 
{
		static int search(int[] arr,int key,int l, int r)
		{
			if(l>r)
				return -1;
			
			int mid = (l+r)/2;	
			if(arr[mid] == key)
				return mid;
			
			if(arr[l] <= arr[mid])
			{
				if(key >= arr[l] && key < arr[mid])
					return search(arr, key, l, mid-1);
				else
					return search(arr, key, mid+1, r);
			}
			if(key >= arr[mid] && key < arr[r])
				return search(arr, key, mid+1, r);
			else 
				return search(arr, key, l, mid-1);

			
		}

	public static void main(String[] args) 
	{
		int[] arr = {6 ,7, 8, 9, 10, 1, 2, 5};
		int key = 20;
		int n = 8;
		
		int k = search(arr, key, 0, n-1);
		if(k == -1)
			System.out.println("not found");
		else 
			System.out.println("found");

		

	}

}
