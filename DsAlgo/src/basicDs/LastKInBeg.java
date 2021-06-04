package basicDs;
import java.util.*;

class LastKInBeg {
	 
    // Class for a node of
    // the linked list
    static class Node {
 
        // Data and the pointer
        // to the next node
        int data;
        Node next;
 
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
 
    // Function to print the linked list
    static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("NULL");
    }
 
    // Recursive function to return the
    // count of nodes in the linked list
    static int cntNodes(Node node)
    {
        if (node == null)
            return 0;
 
        return (1 + cntNodes(node.next));
    }
 
    // Function to update and print
    // the updated list nodes
    static void updateList(Node head, int m)
    {
 
        // Total nodes in the list
        int cnt = cntNodes(head);
 
        if (cnt != m && m < cnt) {
 
            // Count of nodes to be skipped
            // from the beginning
            int skip = cnt - m;
            Node prev = null;
            Node curr = head;
 
            // Skip the nodes
            while (skip > 0) {
                prev = curr;
                curr = curr.next;
                skip--;
            }
 
            // Change the pointers
            prev.next = null;
            Node tempHead = head;
            head = curr;
 
            // Find the last node
            while (curr.next != null)
                curr = curr.next;
 
            // Connect it to the head
            // of the sub list
            curr.next = tempHead;
        }
 
        // Print the updated list
        printList(head);
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        // Create the list
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(3);
 
        int m = 3;
 
        updateList(head, m);
    }
}





