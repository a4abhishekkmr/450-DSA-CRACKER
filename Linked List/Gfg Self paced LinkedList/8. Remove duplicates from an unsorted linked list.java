Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List. When a value appears in multiple nodes, the node which appeared first should be kept, all others duplicates are to be removed.

Example 1:

Input:
N = 4
value[] = {5,2,2,4}
Output: 5 2 4
Explanation:Given linked list elements are
5->2->2->4, in which 2 is repeated only.
So, we will delete the extra repeated
elements 2 from the linked list and the
resultant linked list will contain 5->2->4
Example 2:

Input:
N = 5
value[] = {2,2,2,2,2}
Output: 2
Explanation:Given linked list elements are
2->2->2->2->2, in which 2 is repeated. So,
we will delete the extra repeated elements
2 from the linked list and the resultant
linked list will contain only 2.
  
  
  
  
  
class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         if(head==null)
	return null;
	
	if(head.next==null)
	return head;
	
	//HAshing used as aux array
	 HashSet<Integer> set=new HashSet();
	
	Node curr=head;

	curr=head;
	Node prev=null;
// 	if(curr!=null && curr.data==prev.data)
// 	{
// 	    prev=curr.next;
// 	    curr=curr.next.next;
// 	}
	//bc
	
	while(curr!=null)//put all data
	{
	    if(set.contains(curr.data))
	    {
	        //shifting to one
	        prev.next=curr.next;
	        curr=curr.next;
	        
	    }
	    else{
	        set.add(curr.data);
	        prev=curr;
	        curr=curr.next;
	    }
	}
	return head;
    }
}
// Expected Time Complexity : O(N)
// Expected Auxilliary Space : O(N)
