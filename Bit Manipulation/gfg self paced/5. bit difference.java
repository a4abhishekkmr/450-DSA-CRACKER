Bit Difference 

We define f (X, Y) as number of different corresponding bits in binary representation of X and Y. For example, f (2, 7) = 2, since binary representation of 2 and 7 are 010 and 111, respectively. The first and the third bit differ, so f (2, 7) = 2.

You are given an array A of N integers, A1, A2 ,…, AN. Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N. Return the answer modulo 109+7.

Example 1:

Input: N = 2
A = {2, 4}
Output: 4
Explaintion: We return 
f(2, 2) + f(2, 4) + 
f(4, 2) + f(4, 4) = 
0 + 2 + 
2 + 0 = 4.

Solution>>


class Solution{
    static int countBits(int N, long A[])
    {
        // code here
        int mod=1000000007;
        if(N==1)
        {
            return 0;
        }//bc
        int sum=0;
        for(int i=0;i<32;i++)
        {
            int count=0;
            for(int j=0;j<N;j++)
            {
            
            if((((int)A[(int)j]) & (1<<i))==0)
            count++;
           // sum+=setBits(a^b);
            }
            sum+=(count*(N-count)*2);
        }
        return sum%mod;
    }
}

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)