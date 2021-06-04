package trees;
import java.util.*;

public class Traversals 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Node root = create();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
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
	
	static void inOrder(Node root)
	{
		if(root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);	
	}
	
	static void preOrder(Node root)
	{
		if(root == null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);	
	}
	
	static void postOrder(Node root)
	{
		if(root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);	
		System.out.print(root.data+" ");

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