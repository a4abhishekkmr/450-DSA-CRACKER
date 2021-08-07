Consider a game where a player can score 3 or 5 or 10 points in a move. Given a total score n, find the number of distinct combinations to reach the given score.

Example 1:

Input:
n = 8
Output: 1
Explanation:when n = 8,{3,5} and {5,3}
are the two possible permutations but
these represent the same cobmination.
Hence output is 1.
Example 2:

Input:
n = 20
Output: 4
Explanation:When n = 20, {10,10},
{5,5,5,5},{10,5,5} and {3,3,3,3,3,5}
are different possible permutations.
Hence output will be 4.
Your Task:
Complete count() function which takes N as an argument and returns the number of ways/combinations to reach the given score.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
  
  
  
  
  
  //Recusive soln
//Function to find the number of distinct combinations to reach the given score.
// public static int count(int sum)
// {
//     //Your code here
//     int steps[]=new int[3];
//     steps[0]=3;
//     steps[1]=5;
//     steps[2]=10;
    
//     return count(steps,3,sum);
    
// }
// static int count(int steps[],int n,int m)
// {
//     if(m==0) return 1;
//     if(n==0) return 0;
    
//     int res=count(steps,n-1,m);
//     if(steps[n-1]<=m)
//     res+=count(steps,n,m-steps[n-1]);
    
//     return res;
// }

//DP soln
public static int count(int sum)
{
    int n=3;
    int steps[]=new int[3];
    steps[0]=3;
    steps[1]=5;
    steps[2]=10;
    
    
    int dp[][]=new int[sum+1][n+1];
    for(int i=0;i<=n;i++) dp[0][i]=1;
    for(int i=1;i<sum;i++) dp[i][0]=0;
    
    for(int i=1;i<=sum;i++)
    {
        for(int j=1;j<=n;j++)
        {
            dp[i][j]=dp[i][j-1];
            if(steps[j-1]<=i)
            dp[i][j]+=dp[i-steps[j-1]][j];
        }
    }
    return dp[sum][n];
}
