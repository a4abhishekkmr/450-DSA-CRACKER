A frog jumps either 1, 2, or 3 steps to go to the top. In how many ways can it reach the top. As the answer will be large find the answer modulo 1000000007.

Example 1:

Input:
N = 1
Output: 1
Example 2:

Input:
N = 4
Output: 7
Explanation:Below are the 7 ways to reach
4
1 step + 1 step + 1 step + 1 step
1 step + 2 step + 1 step
2 step + 1 step + 1 step
1 step + 1 step + 2 step
2 step + 2 step
3 step + 1 step
1 step + 3 step




class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        // add your code here
        int mod=1000000007;
        int a=1;
        int b=2;
        int c=4;
        if(n==1) return a;
        if(n==2) return b;
        if(n==3) return c;
        int d=0;
        for(int i=4;i<=n;i++)
        {
            d=((a%mod+b%mod)%mod+c%mod)%mod;
            a=b;
            b=c;
            c=d;
        }
        return d%mod;
    }
    
}
