import java.util.*;
public class Main  //usually it is public class linkedlist
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
    
    llist.PrintList();
   }
}
  
