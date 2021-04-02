9. Power Using Recursion 

You are given two numbers n and p. You need to find np.

Example 1:

Input:
n = 9 p = 9 
Output: 3874204899
Explanation: 387420489 is the value 
obtained when 9 is raised to the 
power of 9.

class Solution
{
    static int RecursivePower(int n,int p)
    {
        // add your code here
    if(n<=1)
    return n;
    if(p==0)
    return 1;
    
    return n*RecursivePower(n,p-1);
    }
 
}

Time comp= O(p).
Auxiliary Space: O(p).  as p+1 times called recursion