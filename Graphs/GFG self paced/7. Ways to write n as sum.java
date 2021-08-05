Given a positive integer N, the task is to find the number of different ways in which N can be written as a sum of two or more positive integers.

Example 1:

Input:
N = 5
Output: 6
Explanation: 
1+1+1+1+1
1+1+1+2
1+1+3
1+4
2+1+2
2+3
So, a total of 6 ways.
  
  
  
  
  class Solution
{
    // function to count ways in which n can be
    // expressed as the sum of two or more integers
    int mod=1000000007;
    int countWays(int n)
    {
        if(n<=1)
        return 0;

    int coins[]=new int[n];
    for(int i=0;i<n;i++)
    {
        coins[i]=i+1;
    }
    long dp[][]=new long[n+1][n+1];
        dp[0][1]=1;
        for(int i=1;i<=n;i++) dp[0][i]=1;
        for(int j=1;j<=n;j++) dp[j][0]=0;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                dp[i][j]=dp[i][j-1];
                if(coins[j-1]<=i)
                dp[i][j]=((dp[i][j]%mod)+(dp[i-coins[j-1]][j]%mod))%mod;
            }
        }
        return (int)(dp[n][n]-1)%mod;
    
        
    }
}
