A deque is a double-ended queue that allows enqueue and dequeue operations from both the ends.

Given a deque and Q queries. The task is to perform some operation on dequeue according to the queries as given below:
1. pb: query to push back the element x.
2. pf: query to push element x(given with query) to the front of the deque.
3. pp_b(): query to delete element from the back of the deque.
4. f: query to return a front element from the deque.

Example 1:

Input:
5
pf 5
pf 10
pb 6
f
pp_b

Output: 
10

Explanation: 
1. After push front deque will be {5}
2. After push front deque will be {10, 5}
3. After push back deque will be {10, 5, 6}
4. Return front element which is 10
5. After pop back deque will be {10, 5}



/* Function to push element to front
    * dq : dqueue in which element is to be pushed
    * x : element to be pushed
    */
    public static void push_back_pb(ArrayDeque<Integer> dq, int x){
        
        //Your code here
        dq.offerLast(x);
        
    }
    
    /* Function to pop element from back
    * dq : dqueue From which element is to be popped
    */
    public static void pop_back_ppb(ArrayDeque<Integer> dq){
        
      //Your code here
      if(!dq.isEmpty())
        dq.pollLast();
        else
        return;
    }
    
    /* Function to return element from front
    * dq : dqueue from which element is to be returned
    */
    public static int front_dq(ArrayDeque<Integer> dq){
        
      //Your code here
      if(!dq.isEmpty())
        return dq.peekFirst();
        else
        return -1;
    }
    
    /* Function to push element to front
    * dq : dqueue in which element is to be pushed
    * x : element to be pushed
    */
    public static void push_front_pf(ArrayDeque<Integer> dq, int x){
        
      //Your code here
        dq.offerFirst(x);
    }
//All operations done here are in O(1)
