package problems;
	
public class PageAllocation 
{
	static int allocate(int arr[],int n,int m)
	{
		int max=0;
		if(n<m)
			return -1;
		for(int i=0; i<n;i++)
			max += arr[i];
		
		int s = 0, e = max, ans = 9999999;
		while(s<=e)
		{
			int mid = (s+e)/2;
			if(possible(arr ,n ,m ,mid))
			{
				ans = Math.min(ans,mid);
				e = mid-1;
			}
			else
			{
				s = mid+1;
			}
		}
		return ans;
	}
	
	static boolean possible(int arr[], int n, int m , int min)
	{
		int students = 1, sum = 0;
		for(int i=0; i<n; i++)
		{
			if(arr[i] > min)
				return false;
			if(sum+arr[i] > min)
			{
				students++;
				sum = arr[i];
				
				if(students > m)
					return false;
			}
			else
				sum+=arr[i];
		}
		return true;
	}

	public static void main(String[] args) 
	{
		int[] arr = {12, 34, 67, 90};
		int n = 4;
		int m = 2;
		
		System.out.println(allocate(arr, n, m));

	}

}
