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

public class Height 
{
	static Node root;
	int count(Node root)
	{
		if(root == null)
			return 0;
		int l = count(root.left);
		int r = count(root.right);

		return Math.max(r, l)+1;
		
	}
	
		

	public static void main(String args[])
    {
		Height tree_level = new Height();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
 
        System.out.println(tree_level.count(root));


    }

}