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

public class SumAtKLevel 
{
	Node root;
	
	int sumAtk()
	{
		if(root == null)
			return -1;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		int l = 0;
		int s = 0;
		
		while(!q.isEmpty()) 
		{
			Node t = q.peek();
			q.remove();
			if(t != null)
			{
				if(l == 2)
					s+=t.data;

				if(t.left != null)
					q.add(t.left);
				
				if(t.right != null)
					q.add(t.right);
			}
			else if(!q.isEmpty())
			{
				q.add(null);
				l++;
			}

		}

		return s;
	}

	public static void main(String args[])
    {
		SumAtKLevel tree_level = new SumAtKLevel();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
 
        System.out.println(tree_level.sumAtk());

    }

}





