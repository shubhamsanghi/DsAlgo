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

public class LevelOrderTreversal 
{
	Node root;
	
	void printLevelOrder()
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		//q.add(null);
		
		while(!q.isEmpty()) 
		{
			Node t = q.poll();
			System.out.println(t.data);
			
			if(t.left != null)
				q.add(t.left);
			
			if(t.right != null)
				q.add(t.right);
		}
		
 	}

	public static void main(String args[])
    {
		LevelOrderTreversal tree_level = new LevelOrderTreversal();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }

}














