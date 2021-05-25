You are given a pointer/ reference to the node which is to be deleted from the linked list of N nodes. The task is to delete the node. Pointer/ reference to head node is not given. 
Note: No head reference is given to you. It is guaranteed that the node to be deleted is not a tail node in the linked list.

Example 1:

Input:
N = 2
value[] = {1,2}
node = 1
Output: 2
Explanation: After deleting 1 from the
linked list, we have remaining nodes
as 2.
  
  
  //Function to delete a node without any reference to head pointer.
class Solution
{
    void deleteNode(Node del)
    {
         // Your code here
         //catches from the given node
         //then copy a as a.next
         //the node del automatically deleted
         Node p=del;
         while(p.next!=null)
         {
             p.data=p.next.data;
             p=p.next;
         }
         
         //till now done like
//          For Input:
// 2
// 1 2
// 1
// your output is: 
// 2 2 

         //but we need to delete the last node
         p=del;
         while(p.next.next!=null)
         {
             p=p.next;
         }
         p.next=null;//freed last element
    }
}
//TC=O(n) and aux O(1)
