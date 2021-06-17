package problems;

public class PeakElement 
{
	
	static int findPeak(int arr[],int n, int s,int e)
	{
		if(s >= e)
			return -1;
		int mid = (s+e)/2;
		if((mid == 0 ||arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid+1] <= arr[mid]))
			return mid;
		else if(mid > 0 && arr[mid-1] > arr[mid])
			return findPeak(arr, n, s, mid-1);
		else 
			return findPeak(arr, n, mid+1, e);
					
	}

	public static void main(String[] args)
    {
		int arr[] = {5, 10, 20, 15};
        //int arr[] = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        System.out.println(
            "Index of a peak point is " + findPeak(arr, n,0 , n-1));
    }

}
