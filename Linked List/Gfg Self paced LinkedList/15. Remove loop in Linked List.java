You are given a linked list of N nodes. Remove the loop from the linked list, if present. 
Note: X is the position of the node to which the last node is connected to. If it is 0, then there is no loop.


Example 1:

Input:
N = 3
value[] = {1,3,4}
X = 2
Output: 1
Explanation: The link list looks like
1 -> 3 -> 4
     ^    |
     |____|    
A loop is present. If you remove it 
successfully, the answer will be 1. 
  
  
  
/*
class Node
{
    int data;
    Node next;
}
*/

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        //Use floyd cycle to detect loop
        Node slow=head, fast=head,fast1=head;
        //for circular LL
        
        boolean loop=false;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {loop=true;
            break;
            }
        }
        if(loop==false)
        return;
        else{
        slow=head;
        if(slow!=fast){
        while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
        }
        else
        {//for the part of circular linked list where n linear length  is 0
            while(fast.next!=slow)
            {fast=fast.next;}
            fast.next=null;
        }
        }
    }
}
//
// Expected time complexity : O(n)
// Expected auxiliary space : O(1)
