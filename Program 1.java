import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int d)
    {
        data = d;
        next = null; 
    }
}
class LL{
    Node head;
    
void Insert(int x)
{
    Node temp = new Node(x);
    temp.next = head;
    head = temp;
//   System.out.println(temp+"temp "+head);
}

 void printList() 
    { 
        Node c = head; 
        // System.out.println("Hi");
        System.out.println(c+" "+head);
        while (c != null) { 
            System.out.print(c.data + " "); 
            // System.out.println("Hi");
            c = c.next; 
        } 
    } 
}
public class Main
{
	public static void main(String args[]) 
	{
	    LL obj = new LL();
	    obj.Insert(10);
	    obj.Insert(20);
	    obj.Insert(30);
	   // System.out.println(obj.head);
	    obj.printList();
	}
}
