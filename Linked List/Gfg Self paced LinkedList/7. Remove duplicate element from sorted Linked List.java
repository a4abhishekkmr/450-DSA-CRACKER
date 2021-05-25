Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
Note: Try not to use extra space. Expected time complexity is O(N). The nodes are arranged in a sorted way.

Example 1:

Input:
LinkedList: 2->2->4->5
Output: 2 4 5
Explanation: In the given linked list 
2 ->2 -> 4-> 5, only 2 occurs more 
than 1 time.
  
  
  class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	if(head==null)
	return null;
	
	if(head.next==null)
	return head;
	
	Node front=head.next;//ek step aage
	Node prev=head;
	
	while(front!=null)
	{
	    if(front.data==prev.data)
	    {
	        prev.next=front.next;//shifted once and deeted
	        front=prev.next;//Now prev next given to front means again front ready to search duplicate pairs
	        
	    }
	    else{
	        prev=front;//moved once
	        front=front.next;
	        
	    }
	}
	
	 return head;
    }
}
// Expected Time Complexity : O(N)
// Expected Auxilliary Space : O(1)
