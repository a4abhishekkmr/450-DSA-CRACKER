There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top (order does matter).

Example 1:

Input:
n = 4
Output: 5
Explanation:
You can reach 4th stair in 5 ways. 
Way 1: Climb 2 stairs at a time. 
Way 2: Climb 1 stair at a time.
Way 3: Climb 2 stairs, then 1 stair
and then 1 stair.
Way 4: Climb 1 stair, then 2 stairs
then 1 stair.
Way 5: Climb 1 stair, then 1 stair and
then 2 stairs.





class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        // your code here
        
       //it is based on problem of getting dp[n]=dp[n-1]+dp[n-2];
        //In this problem order  matters
        //means 1 2 1 can be used as 2 1 1 also as 1 1 2
       int mod=1000000007;
       int a=1;
       int b=2;
       if(n==1) return a;
       if(n==2) return b;
       int c=0;
       for(int i=3;i<=n;i++)
       {
           c=((a%mod)+(b%mod)%mod);
           a=b;
           b=c;
       }
       return c%mod;
    
    }
}
