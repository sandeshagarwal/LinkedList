import java.util.*;
public class Main
{
  Node head;
  static class Node
  {
    int data;
    Node next;
    Node prev;
    Node(int d)
    {
      data = d;
      //System.out.println(d); We can print the values of d ie. the Linked List
    }
   }
  void PrintList()
  {
    Node n = head;
    while(n != null)
    {
      System.out.print(n.data+" ");
      n = n.next;
    }
   }
public static void main(String args[])
{ 
  Main llist = new Main();
  llist.head = new Node(10);
  llist.head.next = new Node(20);
  llist.head.next.next = new Node(30);
//   llist.head.next = second;
//   llist.head.next.next = third;
  llist.head.next.prev = llist.head;
  llist.head.next.next.prev = llist.head.next;
  
  llist.PrintList();
 }
}
