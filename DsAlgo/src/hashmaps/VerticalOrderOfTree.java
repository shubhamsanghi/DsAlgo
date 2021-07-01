package hashmaps;

import java.util.*;
 
class Node 
{
    int key;
    Node left, right;
    Node newNode(int key)
    {
        Node node = new Node();
        node.key = key;
        node.left = node.right = null;
        return node;
    }
}
 
class Qobj 
{
    int hd;
    Node node;
    Qobj(int hd, Node node)
    {
        this.hd = hd;
        this.node = node;
    }
}
 
public class VerticalOrderOfTree 
{
 
   
    static void printVerticalOrder(Node root)
    {
        if (root == null)
            return;
 
        
        TreeMap<Integer, ArrayList<Integer> > m = new TreeMap<>();
        int hd = 0;
 
       
        Queue<Qobj> que = new LinkedList<Qobj>();
        que.add(new Qobj(0, root));
 
        while (!que.isEmpty()) {
            // pop from queue front
            Qobj temp = que.poll();
            hd = temp.hd;
            Node node = temp.node;
 
            if (m.containsKey(hd)) {
                m.get(hd).add(node.key);
            }
            else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(node.key);
                m.put(hd, al);
            }
            if (node.left != null)
                que.add(new Qobj(hd - 1, node.left));
            if (node.right != null)
                que.add(new Qobj(hd + 1, node.right));
        }
 
       
        for (Map.Entry<Integer, ArrayList<Integer> > entry : m.entrySet()) {
            ArrayList<Integer> al = entry.getValue();
            for (Integer i : al)
                System.out.print(i + " ");
            System.out.println();
        }
    }
 
    public static void main(String ar[])
    {
        Node n = new Node();
        Node root;
        root = n.newNode(1);
        root.left = n.newNode(2);
        root.right = n.newNode(3);
        root.left.left = n.newNode(4);
        root.left.right = n.newNode(5);
        root.right.left = n.newNode(6);
        root.right.right = n.newNode(7);
        root.right.left.right = n.newNode(8);
        root.right.right.right = n.newNode(9);
        root.right.right.left = n.newNode(10);
        root.right.right.left.right = n.newNode(11);
        root.right.right.left.right.right = n.newNode(12);
        System.out.println("Vertical order traversal is ");
        printVerticalOrder(root);
    }
}