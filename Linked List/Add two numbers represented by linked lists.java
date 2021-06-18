Given two numbers represented by two linked lists of size N and M. The task is to return a sum list. The sum list is a linked list representation of the addition of two input numbers from the last.

Example 1:

Input:
N = 2
valueN[] = {4,5}
M = 3
valueM[] = {3,4,5}
Output: 3 9 0  
Explanation: For the given two linked
list (4 5) and (3 4 5), after adding
the two linked list resultant linked
list will be (3 9 0).
Example 2:

Input:
N = 2
valueN[] = {6,3}
M = 1
valueM[] = {7}
Output: 7 0
Explanation: For the given two linked
list (6 3) and (7), after adding the
two linked list resultant linked list
will be (7 0).
  
  
  
class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        if(first==null) return second;
        if(second==null) return first;
        
        if(first==null && second==null) return null;
        
        Node curr1=reverse(first);
        Node curr2=reverse(second);
        Node start=null;
        Node end=null;
        //Node curr=new Node();
        int carry=0;
        while(curr1!=null || curr2!=null)
        {
            int a= (curr1!=null)?curr1.data:0;
            int b= (curr2!=null)?curr2.data:0;
            int sum=carry+a+b;
            carry=sum/10;
            sum=sum%10;
            
            //int carry=sum/10;
            Node temp=new Node(sum);
            if(start==null)
            {
                start=temp;
                //start.data=sum;
                end=temp;
            }//1 node
            else{
                end.next=temp;
                end=temp;
            }
            // curr.data=sum;//ok
            // curr.next.data+=carry;
            
            if(curr1!=null) curr1=curr1.next;
            if(curr2!=null) curr2=curr2.next;
        }
        if(carry>0) end.next=new Node(carry);
        Node ans=reverse(start);
        return ans;
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
// Expected Time Complexity: O(N+M)
// Expected Auxiliary Space: O(Max(N,M))
