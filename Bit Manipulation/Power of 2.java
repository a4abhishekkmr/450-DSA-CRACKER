Power of 2

Input: N = 1
Output: true
Explanation: 1 is equal to 2 raised to 0 (20 == 1).

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long N){
        
        // Your code here
        if(N==0)
        {
            return false;
        }
        while(N>1)
        {
            if(N%2!=0)
            {
                return false;
            }
            N=N/2;
        }return true;
        
    }
    
}

one more method is that you can do this via Count set bits in an integer which gives if it is one just give the answer true else false.


Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).
and here i have done O(logn)