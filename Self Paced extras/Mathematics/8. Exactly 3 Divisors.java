8. Exactly 3 Divisors 

Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.

 

Example 1:

Input:
N = 6
Output: 1
Explanation: The only number with 
3 divisor is 4.
 

Example 2:

Input:
N = 10
Output: 2
Explanation: 4 and 9 have 3 divisors.


class Solution
{
    
    public int exactly3Divisors(int N)
    {
        //Your code here
        int count=0;
         for(int i=2;i*i<=N;i++)
      {
          if(isPrime(i) && (i*i)<=N)
          count++;
      }
      
      return count;
    }
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
Expected Time Complexity : O(N^1/2 * N^1/4)
Expected Auxilliary Space :  O(1)