package trees;
import java.util.*;

class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;	
	}
}

public class SumReplacement 
{
	public static Node root;
	void sum(Node root)
	{
		if(root == null)
			return ;
		
		sum(root.left);
		sum(root.right);
		
		if(root.left != null)
			root.data += root.left.data;
		
		if(root.right != null)
			root.data += root.right.data;

		return Math.max(r, l)+1;
		
	}
	void print(Node root) 
	{
		if(root == null)
			return;
		System.out.println(root.data);
		print(root.left);
		print(root.right);
	}
	
		

	public static void main(String args[])
    {
		SumReplacement tree_level = new SumReplacement();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
 
        print(root);
        tree_level.sum(root);
        print(root);


    }

}