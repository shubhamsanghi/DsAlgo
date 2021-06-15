package BST;

public class IdenticalBst 
{
	static class Node
	{
		int data;
		Node left,right;
		
		public Node(int d)
		{
			data = d;
			left = right = null;
		}
	}
	 static void inorder(Node node)
	 {
		 if(node  == null)
			 return ;
		 
		 inorder(node.left);
		 System.out.println(node.data + " ");
		 inorder(node.right);
	 }
	 
	 static int isIdentical(Node root1,Node root2)
	 {
		 if(root1 == null && root2 == null)
			 return 1;
		 else if((root1 == null && root2 != null) || (root2 == null && root1 != null))
			 return 0;
		 else
		 {
			 if(root1.data == root2.data && isIdentical(root1.left,root2.left) == 1 && isIdentical(root1.right,root2.right) == 1)
				 return 1;
			 else 
				 return 0;
		 }
		 
		 
	 }
	
	public static void main(String[] args)
	{
	    Node root1 = new Node(5);
	    Node root2 = new Node(5);
	    root1.left = new Node(3);
	    root1.right = new Node(8);
	    root1.left.left = new Node(2);
	    //root1.left.right = new Node(4);
	    root1.left.right = new Node(5);

	  
	    root2.left = new Node(3);
	    root2.right = new Node(8);
	    root2.left.left = new Node(2);
	    root2.left.right = new Node(4);
	  
	    if (isIdentical(root1, root2)==1)
	        System.out.print("Both BSTs are identical");
	    else
	        System.out.print("BSTs are not identical");
	}
}
