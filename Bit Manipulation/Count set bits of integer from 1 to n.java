Count total set bits 

You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).

Example 1:

Input: N = 4
Output: 5
Explanation:
For numbers from 1 to 4.
For 1: 0 0 1 = 1 set bits
For 2: 0 1 0 = 1 set bits
For 3: 0 1 1 = 2 set bits
For 4: 1 0 0 = 1 set bits
Therefore, the total set bits is 5.

Solution>>
class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
        int x=Largestpowerof2(n);
        if(n==0) return 0;  //bc
        
        int bitsuptorange=(1<<(x-1))*x;
        int msb=n-(1<<(x))+1;
        int rest=n-(1<<x);
        
        int ans=bitsuptorange+msb+countSetBits(rest);
        
        return ans;
    }
    public static int Largestpowerof2(int n)
    {
        int x=0;
        while((1<<x)<=n)
        {
            x++;
        }return x-1;
    }
}

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).
