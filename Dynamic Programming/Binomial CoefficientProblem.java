nCr 

Given two integers n and r, find nCr. Since the answer may be very large, calculate the answer modulo 109+7.

Example 1:

Input: n = 3, r = 2
Output: 3
Explaination: 3C2 = 3. 

Example 2:

Input: n = 2, r = 4
Output: 0
Explaination: r is greater than n.

Your Task:
You do not need to take input or print anything. Your task is to complete the function nCr() which takes n and r as input parameters and returns nCr modulo 109+7.


Solution>>
class Solution{
    static int nCr(int n, int r)
    {
        // min n r (n-r)
        // factorial
        // save momory f!
        // n=n*f!
        // Approach 1
        // if(r>n)
        // return 0;
        // if(n==r || r==0)
        // return 1;
        // else
        // return nCr(n-1,r-1)+nCr(n-1,r);
         int mod=1000000007;
         int dp[]=new int[r+1];//agar r=4 then 4 boxes needed
         
         dp[0]=1;
         for(int i=1;i<=n;i++)
         {
             for(int j=Math.min(i,r);j>0;j--)
             {
                 dp[j]=(dp[j-1]+dp[j])%mod;//upar wale ka add krte jao ulta traingle formation in pascal's triangle
             }
         }int ans=dp[r];//%mod;
         return ans;
    }
}

Expected Time Complexity: O(n*r)
Expected Auxiliary Space: O(r)