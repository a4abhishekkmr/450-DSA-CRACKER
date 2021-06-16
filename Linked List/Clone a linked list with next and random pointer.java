You are given a special linked list with N nodes where each node has a next pointer pointing to its next node. You are also given M random pointers , where you will be given M number of pairs denoting two nodes a and b  i.e. a->arb = b.

ArbitLinked List1

Example 1:

Input:
N = 4, M = 2
value = {1,2,3,4}
pairs = {{1,2},{2,4}}
Output: 1
Explanation: In this test case, there
re 4 nodes in linked list.  Among these
4 nodes,  2 nodes have arbit pointer
set, rest two nodes have arbit pointer
as NULL. Second line tells us the value
of four nodes. The third line gives the
information about arbitrary pointers.
The first node arbit pointer is set to
node 2.  The second node arbit pointer
is set to node 4.
Example 2:

Input:
N = 4, M = 2
value[] = {1,3,5,9}
pairs[] = {{1,1},{3,4}}
Output: 1
Explanation: In the given testcase ,
applying the method as stated in the
above example, the output will be 1.


Expected Time Complexity : O(n)
Expected Auxilliary Space : O(1)

  
  
  /*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
class Node {
    int data;
    Node next, arb;

    Node(int d) 
    { 
        data = d;
        next = arb = null; 
        
    }
}*/
class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
        Node curr=head,next=null,temp=null;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=new Node(curr.data);
            curr.next.next=next;//reached that one  (curr.next).next
            curr=next;
        }
    curr=head;
    while(curr!=null)
    {
        if(curr.next!=null)
        curr.next.arb=(curr.arb)!=null?curr.arb.next:curr.arb;
        
        curr=curr.next.next;
    }
    //cloning done now retrieve
    
    Node original=head,copy=head.next;
    
    temp=copy;
    
    while(original!=null)
    {
        original.next=original.next.next;
        
        copy.next=(copy.next!=null)?copy.next.next:copy.next;
        
        original=original.next;
        copy=copy.next;
        
    }
    return temp;
}
}

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(1)
