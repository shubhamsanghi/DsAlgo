package basics1;
import java.util.*;

public class MatrixSearch2d 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j] = sc.nextInt();
			}

		}
		int r=0,c=m-1;
		boolean flag =  false;
		while(r<n && c>=0)
		{
			if(arr[r][c] == t)
				flag = true;
			if(arr[r][c] > t)
				c--;
			else 
				r++;
		}
		if (flag)
			System.out.println("found");
		else 
			System.out.println("notfound");
	}
}

			