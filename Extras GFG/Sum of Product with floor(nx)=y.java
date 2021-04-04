Sum of product of x and y with floor(n/x) = y 

Given a positive integer n. Find the sum of product of x and y such that floor(n/x) = y .
 

Example 1:

Input: n = 5
Output: 21
Explanation: Following are the possible 
pairs of (x, y):
(1, 5), (2, 2), (3, 1), (4, 1), (5, 1).
So, 1*5 + 2*2 + 3*1 + 4*1 + 5*1 
   = 5 + 4 + 3 + 4 + 5 
   = 21.

class Solution
{
    public long sumofproduct(int n)
    {
        // code here

        int sum=0,y=0;
        for(int i=1;i<=n;i++)
        {
            y=(n/i);
            sum+=i*y;
        }
        return sum;
    }
}
Expected Time Complexity: O(n)
Expected Space Compelxity: O(1)
