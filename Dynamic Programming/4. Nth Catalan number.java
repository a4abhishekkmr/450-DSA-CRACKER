Nth catalan number 

Given a number N. The task is to find the Nth catalan number.
The first few Catalan numbers for N = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
Note: Positions start from 0 as shown above.

Example 1:

Input:
N = 5
Output: 42
Example 2:

Input:
N = 4
Output: 14

class Solution{
    public static BigInteger findCatalan(int n)
    {
        //Your code here
        
        BigInteger f = new BigInteger("1");
        
        for( int i =1 ;i<=n ; i++)  // (n) !
        {
            f = f.multiply(BigInteger.valueOf(i)); 
        }
        
        BigInteger g  = f;
        g=g.multiply(f);  // n! * n!
        
        
        BigInteger h = new BigInteger("1");  // (2n) !
        for( int i =1 ;i<=2*n ; i++)
        {
            h = h.multiply(BigInteger.valueOf(i)); 
        }
        
        BigInteger res = h.divide(g);   // (2n) ! / ( ( n! * n!) 
        
        res=res.divide(BigInteger.valueOf(n+1));
        
        return res;
    }
  
}

// TC : O(n)
// S  : O(1)
editorial