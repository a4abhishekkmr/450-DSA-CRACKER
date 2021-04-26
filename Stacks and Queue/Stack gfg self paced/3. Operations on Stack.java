Given a stack of integers and Q queries. The task is to perform the operation on stack according to the query.

The queries can be of 4 types:

i x: (adds element x in the stack).

r: (removes the topmost element from the stack).

h: Prints the topmost element.

f y: (check if the element y is present or not in the stack). Print "Yes" if present, else "No".
 

Example 1:

Input: 
Q = 6 
Queries = {(i, 2), (i, 4), (i, 3),
(i, 5), (h), (f, 8)}
Output: 
5
No
Explanation: 
Inserting 2, 4, 3, and 5 
onto the stack. Returning top element 
which is 5. Finding 8 will give No, 
as 8 is not in the stack.




class Geeks
{
    //Function to push an element into the stack.
    public static void insert(Stack<Integer> st, int x)
    {
        // Your code here
        st.push(x);
    }
    
    //Function to remove top element from stack.
    public static void remove(Stack<Integer> st)
    {
        // Your code here
        st.pop();
    }
    
    //Function to print the top element of stack.
    public static void headOf_Stack(Stack<Integer> st)
    {
        // Your code here
        System.out.println(st.peek());
    }
    
    //Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val)
    {
        // Your code here
        return st.contains(val);
    }
}
//Time comp is O(n) for finding else all in O(1)
