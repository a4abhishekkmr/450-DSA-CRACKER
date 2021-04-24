Given a Deque Deq containing N elements, the task is to traverse the Deq and print the elements of it. 

Example 1:

Input: 
5
1 2 3 4 5

Output: 
1 2 3 4 5

Explanation: 
Dqe will look like 
{1, 2, 3, 4, 5}.



public static void printDeque(ArrayDeque<Integer> deq)
{
   //Your code here
   //Print and add a new line at the end.
   for(int it: deq)
   System.out.print(it+" ");
   System.out.println();//this i had added to difference between multiple test cases
   //time is O(n)
   //aux space is O(1)
}
