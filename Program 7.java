import java.util.*;
public class Main
{
  Node head;
  static class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      data = d;
    }
  }
   
   void MidElement(Node head)
   {
    int count = 0;
    Node n = head;
    while(n != null)
    {
      count++;
      n = n.next;
    }
    int mid = count/2;
    // System.out.println(mid);
    n = head;
    for(int i=1;i<=mid;i++)
    {
      n = n.next;
    }
    System.out.println(n.data);
   }
   
   public static void main(String args[])
   {
    Main llist = new Main();
    llist.head = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);
    // Node fourth = new Node(40);
    
    llist.head.next = second;
    second.next = third;
    // third.next = fourth;
    
    llist.MidElement(llist.head);
   }
  }
    
    
