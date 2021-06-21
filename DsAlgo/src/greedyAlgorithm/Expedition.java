package greedyAlgorithm;
import java.util.*;

public class Expedition 
{
	static class pair
	{
		int dist;
		int fuel;
		pair(int d,int f)
		{
			dist = d;
			fuel = f;
		}
	}
	
	static void MinStops(int dis[], int fue[], int town, int l)
	{
		int stops = 0;
		
		for(int i=0;i<dis.length;i++)
		{
			dis[i] = town - dis[i];
		}
		
		for (int i = 0; i < dis.length-1; i++)
        {
            int m = i;
            for (int j = i+1; j < dis.length; j++)
            {
                if (dis[j] < dis[m])
                    m = j;
            }
            int temp = dis[m];
            dis[m] = dis[i];
            dis[i] = temp;
            
            int temp1 = fue[m];
            fue[m] = fue[i];
            fue[i] = temp1;  
        }
		
		PriorityQueue<pair> maxheap = new PriorityQueue<pair>((a, b) -> b.fuel - a.fuel);
		
		for(int i=0;i<dis.length;i++)
		{
			if(l>=town)
			{
				System.out.println(0);
				break;
			}
			if(l >= dis[i])
			{
				pair p1 = new pair(dis[i],fue[i]);
				maxheap.add(p1);
			}
			else
			{
				pair p2 = maxheap.poll();
				l += p2.dist;
				stops++;
			}
				
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int i = 0;
		while(l <= town)
		{
			while(i > dis.length && l >= dis[i] )
			{
				pair p1 = new pair(dis[i],fue[i]);
				maxheap.add(p1);
				i++;
			}
			pair p2 = maxheap.poll();
			if(p2 != null)
			{
				l += p2.fuel;
				stops++;
			}
		}*/
		
		System.out.println(stops);
	}
	

	public static void main(String[] args) 
	{
		int dis[] = {4, 5, 11, 15};
		int fue[] = {4, 2, 5, 10};
		int town = 25;
		int l = 10;
		MinStops(dis, fue, town, l);

	}

}
