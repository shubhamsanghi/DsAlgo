package greedyAlgorithm;

public class FractionalKnapsack 
{
	static void func(int w[], int v[], double W, int n)
	{
		double arr[] = new double[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = v[i]/w[i];
		}
		
		for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] > arr[min_idx])
                    min_idx = j;
            }
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
            int temp1 = w[min_idx];
            w[min_idx] = w[i];
            w[i] = temp1;
            
            temp1 = v[min_idx];
            v[min_idx] = v[i];
            v[i] = temp1;
        }
		
		double s = 0;
		int i = 0;
		while(W!=0.0)
		{
			if(w[i] <= W)
			{
				s += v[i];
				W -= w[i];
				++i;
			}
			else
			{
				s += W*v[i]/w[i];
				W = 0.0;
			}
		}
		System.out.println(s);

		
	}

	public static void main(String[] args) 
	{
		int w[] = {7,4,6,5,6};
		int v[] = {21,24,12,40,30}; 
		double W = 20.0;
		int n = 5;
		func(w, v, W, n);
		

	}

}
