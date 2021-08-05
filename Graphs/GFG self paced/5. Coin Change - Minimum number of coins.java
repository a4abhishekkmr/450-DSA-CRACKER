You are given an amount denoted by value. You are also given an array of coins. The array contains the
denominations of the give coins. You need to find the minimum number of coins to make the change for value using the coins of given denominations. Also, keep in mind that you have infinite supply of the coins.

Example 1:

Input:
value = 5
numberOfCoins = 3
coins[] = {3,6,3}
Output: Not Possible
Explanation:We need to make the change for
value = 5 The denominations are {3,6,3}
It is certain that we cannot make 5 using
any of these coins.





class Solution
{
    //Function to find the minimum number of coins to make the change 
    //for value using the coins of given denominations.
    public long minimumNumberOfCoins(int coins[],int numberOfCoins,int value)
    {
        // your code here
        //use of memo
        int n=numberOfCoins;
        int dp[]=new int[value+1];
        dp[0]=0;
        for(int i=1;i<=value;i++) dp[i]=Integer.MAX_VALUE;
        
        for(int i=1;i<=value;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(coins[j]<=i)
                {
                    int res=dp[i-coins[j]];
                    if(res!=Integer.MAX_VALUE && res+1<dp[i])
                    dp[i]=res+1;
                }
            }
        }
        return (dp[value]==Integer.MAX_VALUE)?-1:dp[value];

    }
}
