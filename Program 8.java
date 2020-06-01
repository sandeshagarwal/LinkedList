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
    Node fast = head;
    Node slow = head;
    while( fast != null && fast.next != null)
    {
      fast = fast.next.next; 
      slow = slow.next;
    }
    System.out.println(slow.data);
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
    
    llist.MidElement(llist.head); //non-static variable head cannot be referenced from a static context
    // therefore it is referenced via object llist
   }
  }
   
