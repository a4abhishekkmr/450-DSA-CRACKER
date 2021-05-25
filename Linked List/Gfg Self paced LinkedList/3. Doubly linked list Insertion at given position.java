Given a doubly-linked list, a position p, and an integer x. The task is to add a new node with value x at the position just after pth node in the doubly linked list.

Example 1:

Input:
LinkedList: 2<->4<->5
p = 2, x = 6 
Output: 2 4 5 6
Explanation: p = 2, and x = 6. So, 6 is
inserted after p, i.e, at position 3
(0-based indexing).
  
  
  
  class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head, int pos, int x)
	{
		// Your code here
		
		
		Node temp=new Node(x);
		if(head==null)
		{head=temp;
		return;}
		Node curr=head;

		for(int i=0;i<pos;i++)
		{curr=curr.next;
		}
		//bc
		//like
		//if pos is 1st or last
		if(curr.next==null)
		{
		    curr.next=temp;
		temp.prev=curr;
		}
		else{
		curr.next.prev=temp;
		temp.next=curr.next;
		temp.prev=curr;
		curr.next=temp;
		}
	}
}
//Expected Time Complexity : O(N)
// Expected Auxilliary Space : O(1)
