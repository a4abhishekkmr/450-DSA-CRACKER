7. Primality Test 

A prime number is a number which is only divisible by 1 and itself.
Given number N check if it is prime or not.
 

Example 1:

Input:
N = 5
Output: Yes
Explanation: 5 is only divisible by 1 
and itself. So, 5 is a prime number.


class Solution {
    public boolean isPrime(int n) {
      // code here
      if(n==1) return false;
      
      for(int i=2;i*i<=n;i++)
      {
          if(n%i==0)
          return false;
          
      }
      return true;
      
    }
}
tc=n^1/2