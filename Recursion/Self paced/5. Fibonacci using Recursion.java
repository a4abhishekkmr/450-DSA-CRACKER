5. Fibonacci Using Recursion 

You are given a number n. You need to find nth Fibonacci number.
F(n)=F(n-1)+F(n-2); where F(1)=1 and F(2)=1

Example 1:

Input:
n = 1
Output: 1
Explanation: The first fibonacci
 number is 1
Example 2:

Input:
n = 20
Output:6765
Explanation: The 20th fibonacci 
number is 6765


class Solution
{
    static int fibonacci(int n)
    {
        // your code here
        if(n<=1)
        return n;
        
        return fibonacci(n-1)+fibonacci(n-2);
    }
}

Time complexity=O(n)
Aux space=O(n) as 2 times N sized stack is called.