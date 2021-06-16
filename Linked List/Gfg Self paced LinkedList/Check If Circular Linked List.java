Given a singly linked list, find if the linked list is circular or not. A linked list is called circular if it not NULL terminated and all nodes are connected in the form of a cycle. An empty linked list is considered as circular.

Example 1:

Input:
LinkedList: 1->2->3->4->5
(the first and last node is connected,
i.e. 5 --> 1)
Output: 1
Example 2:

Input:
LinkedList: 2->4->6->7->5->1
Output: 0
  
  
  
  class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*///git
class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	
    Node start=head;
    if(start==null || start.next==null)
    return false;
    Node curr=head;
    while(curr.next!=null)
    {
        curr=curr.next;
        if(curr.next==start)
        return true;
    }
	return false;
    }
}

//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
