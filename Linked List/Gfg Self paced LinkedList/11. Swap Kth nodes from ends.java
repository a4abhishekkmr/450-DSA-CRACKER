Given a singly linked list of size N, and an integer K. You need to swap the Kth node from the beginning and Kth node from the end of the linked list. Swap the nodes through the links. Do not change the content of the nodes.

 

Example 1:

Input:
N = 4,  K = 1
value[] = {1,2,3,4}
Output: 1
Explanation: Here K = 1, hence after
swapping the 1st node from the beginning
and end thenew list will be 4 2 3 1.

  
  class GFG
{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int K)
    {
        // your code here
        if(num<K)// Check if k is valid
        return head;
        // If x (kth node from start) and
        // y(kth node from end) are same
        if (2 * K - 1 == num)
            return head;
        
        else
        {// Find the kth node from beginning of linked list.
        // We also find previous of kth node because we need
        // to update next pointer of the previous.
        Node curr=head;
        Node curr_prev=null;
        for (int i = 1; i < K; i++)
        {
            curr_prev=curr;
            curr=curr.next;
        }
        // Similarly, find the kth node from end and its
        // previous. kth node from end is (n-k+1)th node
        // from beginning
        Node last=head;
        Node last_prev=null;
        
        for (int i = 1; i < num-K+ 1; i++) 
        {
            last_prev=last;
            last=last.next;
        }
        
        // If x_prev exists, then new next of it will be y.
        // Consider the case when y->next is x, in this case,
        // x_prev and y are same. So the statement
        // "x_prev->next = y" creates a self loop. This self
        // loop will be broken when we change y->next.
        if(curr_prev!=null)
        curr_prev.next=last;
        
        // Same thing applies to y_prev
        if(last_prev!=null)
        last_prev.next=curr;
        
        //swap next pointers
        Node temp=curr.next;
        curr.next=last.next;
        last.next=temp;
        
        //change head pointers when k is 1 or N
        if(K==1)
        head=last;
        
        if(K==num)
        head=curr;
        
        return head;
        }
    }
}
// Time Complexity: O(n), where n is the length of the list. 
// One traversal of the list is needed.
// Auxiliary Space: O(1). 
// No extra space is required.
