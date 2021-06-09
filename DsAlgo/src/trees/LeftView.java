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

public class LeftView 
{
	Node root;
	
	void printLevelOrder()
	{
		if(root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		//q.add(null);
		while(!q.isEmpty()) 
		{
			Node t = null;
			int n = q.size();
			for(int i=0;i<n;i++)
			{
				t = q.peek();
				q.remove();
				if(i == 0)
					System.out.println(t.data);					
			}
			
			if(t.left != null)
				q.add(t.left);
			
			if(t.right != null)
				q.add(t.right);
		} 
		
 	}

	public static void main(String args[])
    {
		LeftView tree_level = new LeftView();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.6root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
        


 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }

}