Implement a Queue using Linked List. 
A Query Q is of 2 Types
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop an element from the queue and print the poped element)

Example 1:

Input:
Q = 5
Queries = 1 2 1 3 2 1 4 2
Output: 2 3
Explanation: n the first testcase
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2 the
    queue will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3.




/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode temp=new QueueNode(a);
        if(front==null)
        {
            front=rear=temp;
            return;
        }
        rear.next=temp;
        rear=temp;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
         if(front==null)
        {
            
            return -1;
        }
        QueueNode temp=front;
        int ans=temp.data;
        front=front.next;
       if(front==null)
        {
            
            rear=null;
        }
        return ans;
	}
}
// Time comp is O(1).
// Expected Auxiliary Space: O(1).