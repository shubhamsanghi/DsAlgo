package BST;

public class balancedBstFromSortedArray 
{
	class Node
	{
		int data;
		Node left,right;
		
		public Node(int d)
		{
			data = d;
			left = right = null;
		}
	}
	static Node root;
	
	public Node build(int[] arr, int s, int e)
	{
		if(e < s)
			return null;
		
		int m = (s+e)/2;
		Node node = new Node(arr[m]);
		
		node.left = build(arr,s,m-1);
		node.right = build(arr,m+1,e);
		
		return node;
	}
	
	void preOrder(Node node) 
	{
        if (node == null) 	
            return;
      
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }



	public static void main(String[] args) 
	{
		balancedBstFromSortedArray tree = new balancedBstFromSortedArray();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        root = tree.build(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");
        tree.preOrder(root);
    }

}
