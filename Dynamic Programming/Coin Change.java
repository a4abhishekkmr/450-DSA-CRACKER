Coin Game with Max output

Example 1:

Input:
n = 4 , m = 3
S[] = {1,2,3}
Output: 4
Explanation: Four Possible ways are:
{1,1,1,1},{1,1,2},{2,2},{1,3}.

Solution>>

class Solution
{
    public long count(int S[], int m, int n) 
    { 
        //code here.
        long[] dp=new long[n+1];
        
        Arrays.fill(dp,0);   //O(n)
        
        dp[0]=1;
        
        for(int i=0;i<m;i++)
        {
            for(int j=S[i];j<=n;j++)
            {
                dp[j]=dp[j]+dp[j-S[i]];
            }
        }
        return dp[n];
    } 
}

Expected Time Complexity: O(m*n).
Expected Auxiliary Space: O(n). 