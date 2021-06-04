package trees;
import java.util.*;

public class trees1 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Node root = create();
	}
	
	static Node create() 
	{
		Node root = null;
		System.out.println("enter data");
		int n = sc.nextInt();
		if(n == -1)
			return null;
		root = new Node(n);
		
		System.out.println("enter left of data");
		root.left = create();
		
		System.out.println("enter right of data");
		root.right = create();
		
		return root;
	}

}
class Node
{
	Node left,right;
	int data;
	
	public Node(int d)
	{
		data = d;
		left = null;
		right = null;
	}
	
}