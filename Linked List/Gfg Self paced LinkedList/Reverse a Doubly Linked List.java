Given a doubly linked list of n elements. The task is to reverse the doubly linked list.

Example 1:

Input:
LinkedList: 3 <--> 4 <--> 5
Output: 5 4 3
Example 2:

Input:
LinkedList: 75 <--> 122 <--> 59 <--> 196
Output: 196 59 122 75
  
  
  
  /*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

*/
public static Node reverseDLL(Node  head)
{
    //Your code here
    if(head==null || head.next==null)//shit man
    return head;
    
    Node prev=null,curr=head;
    while(curr!=null)
    {
        prev=curr.prev;
        curr.prev=curr.next;
        curr.next=prev;
        curr=curr.prev;
    }
    return prev.prev;
}

//Expected Time Complexity: O(n).
//Expected Auxiliary Space: O(1).
