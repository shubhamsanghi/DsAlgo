package graphs;
import java.util.*;

public class Graphs1 
{
	private LinkedList<Integer> adj[];
	
	public Graphs1(int v)
	{
		adj = new LinkedList[v];
		for(int i=0; i<v; i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
			
	}
	
	public void addEdge(int source, int destination)
	{
		adj[source].add(destination);
		adj[destination].add(source);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of vertices and edges");
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		Graphs1 graph = new Graphs1(v);
		for(int i=0; i<e; i++)
		{
			int source = sc.nextInt();
			int destination = sc.nextInt();
			graph.addEdge(source,destination);
		}

	}

}
