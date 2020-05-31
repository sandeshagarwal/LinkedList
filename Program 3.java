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
      //System.out.println(d); we can print the value of d here ie. the linked list
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
  Node second = new Node(20);
  Node third = new Node(30);
  llist.head.next = second;
  second.next = third;
  second.prev = llist.head;
  third.prev = second;
  
  llist.PrintList();
 }
}
