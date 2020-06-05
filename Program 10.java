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
  
  void PrintNth(Node head,int n)
  {
    Node first = head;
    Node second = head;
    for(int i=0;i<n;i++)
    {
      second = second.next;
    }
    while(second != null)
    {
      first = first.next;
      second = second.next;
    }
    System.out.println(first.data);
   }
   
   public static void main(String args[])
   {
    Main llist = new Main();
    llist.head = new Node(10);
    Node new2 = new Node(20);
    Node new3 = new Node(30);
    Node new4 = new Node(40);
    
    llist.head.next = new2;
    new2.next = new3;
    new3.next = new4;
    
    int n = 2;
    
    llist.PrintNth(llist.head,n);
   }
  }
    
  
