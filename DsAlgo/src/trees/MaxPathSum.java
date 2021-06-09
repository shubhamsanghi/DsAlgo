package trees;
import java.util;

class Node
{
	Node left, right;
	int data;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
}

public class MaxPathsum 
{
	Node root;
	int m = -9999;
	int s = 0;
	
	public int func(Node node,int s)
	{
		if(node == null)
			return 0;
		if (node.data >= m)
		{
			s += node.data;
			return func(node);
		}
		
		if(node.left != null && node.left.data >= m)
		{
			s += node.left.data;
			return func(node.left);
		}
		else return;
			
		
			
		
		
		if(node.left == null && node.right == null)
			return;
		
		if(node.left != null)
		{
			flatten(node.left);
			
			Node temp = node.right;
			node.right = node.left;
			node.left = null;
			Node curr = node.right;
			
			while(curr.right != null)
				curr = curr.right;
			
			curr.right = temp;
			
			flatten(node.right);
		}
	}	
	
	public void inOrder(Node node)
	{
		if (node == null)
	        return;
		 
	    inOrder(node.left);
	    System.out.print(node.data + " ");
	    inOrder(node.right);
	}	
 
	public static void main(String[] args)
	{
		MaxPathsum tree = new MaxPathsum();
	 
	    tree.root = new Node(1);
	    tree.root.left = new Node(2);
	    tree.root.right = new Node(5);
	    tree.root.left.left = new Node(3);
	    tree.root.left.right = new Node(4);
	    tree.root.right.right = new Node(6);
	 
	    System.out.println("The Inorder traversal after " + "flattening binary tree ");
	                        
	    tree.flatten(tree.root);
	    tree.inOrder(tree.root);
	}
	

}

