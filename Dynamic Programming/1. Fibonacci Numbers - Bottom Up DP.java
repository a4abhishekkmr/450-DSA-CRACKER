One of the rudimentary problems to understand DP is finding the nth Fibonacci number. Here, we will solve the problem using a bottom-up approach.
You are given a number N. You need to find the Nth Fibonacci number. The first two number of the series are 1 and 1.

Example 1:

Input:
N = 5
Output: 5
Example 2:

Input:
N = 7
Output: 13
Explanation: Some of the numbers of the
Fibonacci numbers are 1, 1, 2, 3, 5, 8,13
..... (N stars from 1).
  
  
  
  class Solution
{
    //Function to find the nth fibonacci number using bottom-up approach.
    public long findNthFibonacci(int number)
    {
        // Your Code Here
        //Bottom Up DP means it is asking for tabulation..
        //so for this 1?=>2?=>3 and goes on
        long f[]=new long[number+1];
        //preset
        f[0]=0;f[1]=1;
        for(int i=2;i<=number;i++)
        f[i]=f[i-1]+f[i-2];
        
        return f[number];
    }

}

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
