You have an infinite supply of coins, each having some value. Find out the number of ways to use the coins to sum-up to a certain required value.

Example 1:

Input:
value = 4
numberOfCoins = 3
coins[] = {1,2,3}
Output: 4
Explanation: We need to make the change
for value = 4. The denominations are
{1,2,3} Change for 4 can be made:
1+1+1+1
1+1+2
1+3
2+2
So, as it is evident, we can do this in
4 ways.







class Solution
{
    //Function to find out the number of ways to use the coins to
    //sum up to a certain required value.
    public long numberOfWays(int coins[],int numberOfCoins,int value)
    {
        int n=numberOfCoins;
        int dp[][]=new int[value+1][n+1];
        dp[0][1]=1;
        for(int i=1;i<=n;i++) dp[0][i]=1;
        for(int j=1;j<=value;j++) dp[j][0]=0;
        
        for(int i=1;i<=value;i++)
        {
            for(int j=1;j<=n;j++)
            {
                dp[i][j]=dp[i][j-1];
                if(coins[j-1]<=i)
                dp[i][j]+=dp[i-coins[j-1]][j];
            }
        }
        return dp[value][n];
    }
}
