Given a Deque deq of size N containing non-negative integers and a positive integer K, the task is to rotate elements of the deque by K places in a circular fashion. There will be two rotations which you have to implement depending on the type rotating query. Below is the description of rotating type and value of K for which you have to rotate in circular way:
Type-1. right_Rotate_Deq_ByK(): this function should rotate deque by K places in a clockwise fashion.
Type-2. left_Rotate_Deq_ByK(): this function should rotate deque by K places in an anti-clockwise fashion.

Example 1:

Input:
6
1 2 3 4 5 6
1 2

Output: 
5 6 1 2 3 4 

Explanation: 
The dequeue is 1 2 3 4 5 6. 
The query type is 1 and k is 2. So, we 
need to right rotate dequeue by 2 times. 
In 1 right rotation we get 6 1 2 3 4 5. 
In another we get 5 6 1 2 3 4.





public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
{
    //Your code here
    for(int i=0;i<k;i++)
    {
        int temp=deque.pollFirst();
        deque.offerLast(temp);
    }
    //used temp for simplicity to read only, in one line it is possible
}

public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
{
    //Your code here
    for(int i=0;i<k;i++)
    {
        deque.offerFirst(deque.pollLast());
    }
}
//time comp is O(k) and aux space used is O(1)