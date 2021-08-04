Given an integer. Find how many structurally unique binary search trees are there that stores the values from 1 to that integer (inclusive). 

Example 1:

Input:
N = 2
Output: 2
Explanation:for N = 2, there are 2 unique
BSTs
     1               2  
      \            /
       2         1



class Solution
{
    //Function to return the total number of possible unique BST.
    static int mod=1000000007;
    static int numTrees(int n)
    {
        // Your code goes here
        //it is same as nth catalan number
        long dp[]=new long[n+1];
        
        dp[0]=1;
        
        for(int i=1;i<=n;i++)
        
        {
            dp[i]=0;
            for(int j=0;j<i;j++)
            dp[i]=(dp[i]%mod+(dp[j]%mod)*(dp[i-j-1]%mod))%mod;
        }
        return (int)dp[n]%mod;
        
        
    }
}
