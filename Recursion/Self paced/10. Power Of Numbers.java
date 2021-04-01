10. Power Of Numbers 

Given a number and its reverse. Find that number raised to the power of its own reverse.
Note: As answers can be very large, print the result modulo 109 + 7.

Example 1:

Input:
N = 2
Output: 4
Explanation: The reverse of 2 is 2 and after raising power 
of 2 by 2 we get 4 which gives remainder as 4 by dividing 1000000007.

===========================================================
class Solution
{
    int mod=1000000007;
    int res=1;//min val
    long power(int n,int R)
    {
        //Your code here
        long i=1;
        
        // if(R==0)
        // return 1;
        if(n==0)
        return 0;
        
        if(R==0)
        return 1;
        
        long ans=0;
        if(R%2==0)
        {
            ans=power(n,R/2);
            ans=(ans*ans)%mod;
        }
        
        else
        {
            ans=n%mod;
            ans=(ans*power(n,R-1)%mod)%mod;
        }
        
        return (ans%mod);
    }

}

Expected Time Complexity: O(LogN). 
Expected Auxiliary Space: O(LogN). log n +1;

Idea=
Property 1:
(m * n) % p has a very interesting property:
(m * n) % p =((m % p) * (n % p)) % p

Property 2:
if b is even:
(a ^ b) % c = ((a ^ b/2) * (a ^ b/2))%c ? this suggests divide and conquer
if b is odd:
(a ^ b) % c = (a * (a ^( b-1))%c

Property 3:
If we have to return the mod of a negative number x whose absolute value is less than y:
then (x + y) % y will do the trick

Note:
Also as the product of (a ^ b/2) * (a ^ b/2) and a * (a ^( b-1) may cause overflow, hence we must be careful about those scenarios