9. Addition Under Modulo 

Given two numbers a and b, find the sum of a and b. Since the sum can be very large, find the sum modulo 109+7.

 

Example 1:

Input:
a = 9223372036854775807
b = 9223372036854775807
Output: 582344006
Explanation: 
9223372036854775807 + 9223372036854775807 
= 18446744073709551614.
18446744073709551614 mod (109+7)
= 582344006

class Solution {
    public static long sumUnderModulo(long a, long b){
        // code here
        long mod=1000000007;
        long ans=a%mod+b%mod;
        return ans%mod;
    }   
}
TC=O(1)
aux=O(1)