Given two lists sorted in increasing order, create a new list representing the intersection of the two lists. The new list should be made with its own memory — the original lists should not be changed.

Example 1:

Input:
L1 = 1->2->3->4->6
L2 = 2->4->6->8
Output: 2 4 6
Explanation: For the given first two
linked list, 2, 4 and 6 are the elements
in the intersection.
Example 2:

Input:
L1 = 10->20->40->50
L2 = 15->40
Output: 40
Your Task:
The task is to complete the function intersection() which should find the intersection of two linked list and add all the elements in intersection to the third linked list and return the head of the third linked list.

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(n+m)
Note: n,m are the size of the linked lists.
  
  
  Method1:= can be solbed using Hashing-
put values of Node1 into hashtable and then check for values of Node2
but one imp thing is to check redundancy in nde 2 so if we have done the contains part we will remove that  
thing from has so that next time when it goes for searching it will fail


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node start=null;
        Node res=null;
        Node end=null;
        Node curr1=head1;
        Node curr2=head2;
        while(curr1!=null && curr2!=null)
        {
            //same elements
            if(curr1.next!=null && curr1.next.data==curr1.data)
            {
                curr1=curr1.next;continue;
            }
            //pointer 1 to move if it is less
            if(curr1.data<curr2.data){curr1=curr1.next;}
            else if(curr1.data>curr2.data){curr2=curr2.next;}
            //pointer 2 is moved if that one is less
            else//now printing part
            {
                Node temp=new Node(curr1.data);
                if(start==null)//if new ll is empty
                {
                    start=temp;
                    end=temp;
                }
                else//if new ll has some elements
                {
                    end.next=temp;
                    end=temp;
                }
                curr1=curr1.next;curr2=curr2.next;
            }
        }
        return start;
    }
}
