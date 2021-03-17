Painting the Fence 

Given a fence with n posts and k colors, find out the number of ways of painting the fence such that at most 2 adjacent posts have the same color. Since answer can be large return it modulo 10^9 + 7.


Example 1:

Input:
N=3,  K=2 
Output: 6


Solution>>

class Solution
{
    long countWays(int n,int k)
    {
        //code here.
        long dp[]=new long[n+1];
        
        Arrays.fill(dp,0);
        long mod=1000000007;
        
        //this id for 1 fence;
        long same=0, diff=k;
        dp[1]=k;
        for(int i=2;i<=n;i++)
        {
            same=diff;
            diff=(dp[i-1]*(k-1));
            diff=diff%mod;
            dp[i]=(same+diff)%mod;
            //dp[i]=dp[i]%mod;
        }
        return dp[n];
        
    }
}


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).