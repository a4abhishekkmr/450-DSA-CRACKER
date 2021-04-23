Implement a Queue using an Array. Queries in the Queue are of the following type:
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop element from queue and print the poped element)

Example 1:

Input:
Q = 5
Queries = 1 2 1 3 2 1 4 2
Output: 2 3
Explanation:
In the first test case for query 
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2 the 
    queue will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3 

Your Task :
You are required to complete the two methods push() which take one argument an integer 'x' to be pushed into the queue and pop() which returns a integer poped out from othe queue. If the queue is empty, it should return -1 on a pop operation. 

Expected Time Complexity: O(1) for both push() and pop().
Expected Auxiliary Space: O(1) for both push() and pop().

Constraints:
1 ≤ Q ≤ 10^5
1 ≤ x ≤ 10^5


class MyQueue {

    int front, size,rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		size=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    //i am not considering here the case when size is gretaer then capacity as in constrainst
	    //it is given that the max length will go till the 10^5 and array is of 10^5+5;
	    //it will be like
	    //if(size==100005) return;
	    int rear=front+size-1;
	    rear=(rear+1)%100005;
	    arr[rear]=x;
	    size++;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(size==0) return -1;
		int temp=arr[front];
		front=(front+1)%100005;
		size--;
		
		return temp;
	} 
}
//As i am using Circular queue which will give all my operations in O(1)
//and Aux space is tthe space required by array
