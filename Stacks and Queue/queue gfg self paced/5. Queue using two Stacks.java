Implement a Queue using 2 stacks s1 and s2 .
A Query Q is of 2 Types
(i) 1 x (a query of this type means  pushing 'x' into the queue)
(ii) 2   (a query of this type means to pop element from queue and print the poped element)

Example 1:

Input:
5
1 2 1 3 2 1 4 2

Output: 
2 3

Explanation: 
In the first testcase
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2 the queue 
    will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3.



class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   // Your code here
	   s1.push(x);
	   //int temp=s1.peek();
	   //s2.push(temp);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        if(s1.isEmpty() && s2.isEmpty())
        return -1;
	   // Your code here
	   while(!s1.isEmpty())
	   {s2.push(s1.pop());}
	   int ans= s2.pop();
	   while(!s2.isEmpty())
	   {s1.push(s2.pop());}
	   return ans;
    }
}
// Expected Time Complexity : O(1) for push() and O(N) for pop() or O(N) for push() and O(1) for pop()  
// Expected Auxilliary Space : O(1).