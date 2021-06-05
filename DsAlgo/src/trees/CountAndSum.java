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

public class CountAndSum 
{
	static Node root;
	int count(Node root)
	{
		if(root == null)
			return 0;
		return count(root.left)+count(root.right)+1;
		
	}
	int sum(Node root)
	{
		if(root == null)
			return 0;
				
		return sum(root.left)+sum(root.right)+root.data;
		
	}

		

	public static void main(String args[])
    {
		CountAndSum tree_level = new CountAndSum();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
 
        System.out.println(tree_level.count(root));
        System.out.println(tree_level.sum(root));


    }

}