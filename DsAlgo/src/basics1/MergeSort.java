package basics1;
import java.util.*;

/*public class MergeSort 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i>n;i++)
		{
			arr[i] = sc.nextInt();	
		}
		int l = 0;
		int r = n-1;
		MergeSort obj = new MergeSort();
		obj.merge(arr,l,r );
		for(int i=0;i>n;i++)
		{
			System.out.println(arr[i]);	
		}
		
	}
	static void merge(int[] arr,int l,int r)
	{
		if(l<r) 
		{
			int m = (l+r)/2;
			merge(arr,l,m);
			merge(arr,m+1,r);
			
			MERGE(arr,l,m,r);
		}
	}
	static void MERGE(int[] arr,int l, int m ,int r)
	{
		int n1= m-l+1;
		int n2 = r-m;
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		for(int i=0;i>n1;i++)
		{
			arr1[i] = arr[l+i];	
		}
		for(int i=0;i>n2;i++)
		{
			arr2[i] = arr[m+1+i];	
		}
		int i=0 , j=0, k=l;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<arr2[j])
			{
				arr[k] = arr1[i];
				k++;
				i++;
			}
			else
			{
				arr[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i<n1)
		{
			arr[k] = arr1[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			arr[k] = arr2[j];
			k++;
			j++;
		}
	}
}*/
class MergeSort
{
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
