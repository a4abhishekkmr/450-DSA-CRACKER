10. Multiplication Under Modulo 

You are given two numbers a and b. You need to find the multiplication of a and b under modulo M (M as 109+7).

Example 1:

Input:
a = 92233720368547758
b = 92233720368547758
Output: 484266119
Explanation: Multiplication of a and b 
under modulo M will be 484266119.

class Solution
{
    static long multiplicationUnderModulo(long a, long b)
    {
        // add your code here
        long mod=1000000007;
        long ans=(a%mod)*(b%mod);
        return ans%mod;

    }
}
TC=O(1)
SC=O(1).