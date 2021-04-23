Implement a Stack using two queues q1 and q2.

Example 1:

Input:
push(2)
push(3)
pop()
push(4)
pop()
Output: 3 4
Explanation:
push(2) the stack will be {2}
push(3) the stack will be {2 3}
pop()   poped element will be 3 the 
        stack will be {2}
push(4) the stack will be {2 4}
pop()   poped element will be 4 




class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here
	    q2.add(a);
	    while(!q1.isEmpty())
	    {
	        q2.add(q1.remove());
	    }
	    
	    while(!q2.isEmpty())
	    {
	        q1.add(q2.remove());
	    }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
	    // Your code here
	    if(q1.isEmpty())
	    return -1;
	    
	    return q1.remove();
    }
	
}
//Time como: all operations are O(1) but push is of O(n)
//Aux space used ; 2 queues so O(n);
