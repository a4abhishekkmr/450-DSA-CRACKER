Given two sorted linked lists consisting of N and M nodes respectively. The task is to merge both of the list (in-place) and return head of the merged list.
 

Example 1:

Input:
N = 4, M = 3 
valueN[] = {5,10,15,40}
valueM[] = {2,3,20}
Output: 2 3 5 10 15 20 40
Explanation: After merging the two linked
lists, we have merged list as 2, 3, 5,
10, 15, 20, 40.
  
  
  
  /*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node a, Node b) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     if(a==null) return b;
     if(b==null) return a;
     
     Node head=null,tail=null;
     //first point
     if(a.data<=b.data)
     {
         head=tail=a;
         a=a.next;
     }
     else
     {
         head=tail=b;b=b.next;
     }
     while(a!=null && b!=null)
     {
         if(a.data<=b.data)
         {tail.next=a;tail=a;a=a.next;}
         
         else
         {tail.next=b;tail=b;b=b.next;}
     }
     if(a==null) tail.next=b;
     
     else
     tail.next=a;
     
     return head;
   } 
}
//O(m+n)
Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(1)
