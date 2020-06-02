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
    Node curr = head;
    int len = 0; // we have to find the length of the Linked List
    for(curr = head;curr !=null;curr= curr.next) // we can also use a while loop here while(curr != null)
      len++;
   System.out.println("The length of the Linked List is "+ len);
   // We have to print the nth node from the end ie. from the beginning it is (len-n+1)
   curr  = head;
   if(n >= len)
    System.out.println("n is invalid");
   for(int i=1;i<=(len-n+1);i++)
   { 
    curr = curr.next;
   }
   System.out.println("Hi");
    System.out.println(curr.data);
  }
   
   public static void main(String args[])
   {
    Main llist = new Main();
    llist.head = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);
    Node fourth =  new Node(40);
    
    llist.head.next = second;
    second.next = third;
    third.next = fourth;
    int n = 2;
    llist.PrintNth(llist.head,n);
   }
  }
   
   
