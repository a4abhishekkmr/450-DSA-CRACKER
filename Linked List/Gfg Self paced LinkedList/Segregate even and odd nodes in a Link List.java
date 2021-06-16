Given a link list of size N, modify the list such that all the even numbers appear before all the odd numbers in the modified list. The order of appearance of numbers within each segregation should be same as that in the original list.


Example 1:

Input: 
N = 7
Link List = 
17 -> 15 -> 8 -> 9 -> 2 -> 4 -> 6 -> NULL

Output: 8 2 4 6 17 15 9

Explaination: 17,15,8,9 are odd so they appear 
first and 2,4,6 are the even numbers that appear later.

Example 2:

Input:
N = 4
Link List = 1 -> 3 -> 5 -> 7

Output: 1 3 5 7

Explaination: There is no even number. 
So ne need for modification.


//User function Template for Java

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        // code here
        Node evenstart=null;
        Node evenend=null;
        Node oddstart=null;
        Node oddend=null;
        Node curr=head;
        
        while(curr!=null)
        {
            int temp=curr.data;
            
            if(temp%2==0)
            {
                if(evenstart==null)
                {
                    evenstart=curr;
                    evenend=evenstart;
                }
                else
                {
                    evenend.next=curr;
                    evenend=evenend.next;
                }
            }
            else
            {
                if(oddstart==null)
                {
                    oddstart=curr;
                    oddend=oddstart;
                }
                else
                {
                    oddend.next=curr;
                    oddend=oddend.next;
                }
            }
            curr=curr.next;//iterate through the nodes to check
        }
        //Now merging time
        if(oddstart==null || evenstart==null)
        return head;
        evenend.next=oddstart;
        oddend.next=null;
        return evenstart;
    }
}
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)
