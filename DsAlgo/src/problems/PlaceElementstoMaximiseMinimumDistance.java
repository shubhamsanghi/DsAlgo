package problems;
import java.util.*;

class PlaceElementstoMaximiseMinimumDistance 
{
    static boolean isFeasible(int mid, int arr[], int n,int k)
    {
        int pos = arr[0];
        int elements = 1;
        for (int i = 1; i < n; i++) 
        {
            if (arr[i] - pos >= mid) 
            {
                pos = arr[i];
                elements++;
                if (elements == k)
                    return true;
            }
        }
        return false;
    }
 
    static int largestMinDist(int arr[], int n, int k)
    {
        Arrays.sort(arr);
        int res = -1;
        int left = arr[0], right = arr[n - 1] - arr[0];
 
        while (left < right) 
        {
            int mid = (left + right) / 2;
            if (isFeasible(mid, arr, n, k)) 
            {
                res = Math.max(res, mid);
                left = mid + 1;
            }
            else
                right = mid;
        }
        return res;
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 8, 4, 9 };
        int n = arr.length;
        int k = 3;
        System.out.print(largestMinDist(arr, n, k));
    }
}