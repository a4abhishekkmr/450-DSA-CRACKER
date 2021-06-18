A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

Example 1:

Input:
LinkedList: 4->5->6
Output: 457 
Example 2:

Input:
LinkedList: 1->2->3
Output: 124 
  
  
  
class Solution
{
    public static Node addOne(Node head) 
    { 
         head = reverse(head);
 
        // Add one from left to right of reversed
        head = operation(head);
 
        // Reverse the modified list
        return reverse(head);
         
    }
    
    static Node operation(Node curr1)
    {//code here.
       
        //Node curr=new Node();
        Node res=curr1;
        Node end=null;
        int carry=1;
        
        int sum=0;
        while(curr1!=null)
        {
           sum=curr1.data+carry;
           carry=(sum >= 10)?1:0;
           sum=sum%10;
           curr1.data=sum;
           
           end=curr1;
           curr1=curr1.next;
        }
        if(carry>0) end.next=new Node(carry);
        return res;
    }
    static Node reverse(Node head)
    {
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
