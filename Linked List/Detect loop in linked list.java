link- https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
// driver code

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

class GFG
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            
            Solution x = new Solution();
            if( x.detectLoop(head) )
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
// } Driver Code Ends


/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

>>
Using hard turtle theorem, create two pointers: hare and turtle.
point both of them to head at first.


Now, turtle moves by one position and hare moves by two position.
If these two pointers meet at some time then loop exists. 
If we reach null without any meeting then no loop exists

*/


class Solution {
    public static boolean detectLoop(Node head){
        // Add code here
        Node fast=head.next;
        Node slow=head;
        //int count=0;
        
        // while(fast!=null)
        // {
        //     slow=slow.next;
        //     fast=fast.next.next;
            
        // }if(fast==slow)
        //     {
        //         return true;
        //     }else return false;
    
        while(fast!=slow)
        {
            if(fast==null || fast.next==null) return false;
            
            slow=slow.next;
             fast=fast.next.next;
        }return true;
    }
}