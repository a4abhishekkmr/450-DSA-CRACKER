One of the rudimentary problems to understand DP is finding the nth Fibonacci number. Here, we will solve the problem using the top-down approach.

You are given a number N. You need to find Nth Fibonacci number. The first two term of the series are 1 and 1.

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
Your Task:
You don't need to take any input. You have to complete the function findNthFibonacci() which takes 2 arguments(number N and dp array to store the answer) and returns the answer.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
Note: This space is used by dp array.
  
  
  
  
  
class Solution
{
    //Function to find the nth fibonacci number using top-down approach.
    public long findNthFibonacci(int n, long dp[])
    {
        // Your Code Here
        //Top Down DP means it is asking for Memoitation..
        //so for this 5?=>4?=>3 and goes on..
        // long memo[]=new long[m+1];
        // Arrays.fill(dp,-1);
        long res=0;
        if(dp[n]==0){
        if(n==0 || n==1)
        return n;
        else
        {res=findNthFibonacci(n-1,dp)+findNthFibonacci(n-2,dp);
        dp[n]=res;
        }
        }
        return dp[n];
        
    }

}
