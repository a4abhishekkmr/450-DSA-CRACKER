1. Find first set bit 

Given an integer an N. The task is to return the position of first set bit found from the right side in the binary representation of the number.
Note: If there is no set bit in the integer N, then return 0 from the function.  

Example 1:

Input: N = 18
Output: 2
Explanation: Binary representation of 
18 is 010010,the first set bit from the 
right side is at position 2.


class Solution{
    /*  Function to find position with first set bit
    *   n: input integer
    */
    public static int getFirstSetBit(int n){
            
        // Your code here
    //         int count=1;
    //         while((n&1)!=1)
    //         {
    //             count++;
    //             n=n>>1;
    //         }
    //         return count;
    // }
    // TLE
    
    if(n==0) return 0;
    int ans=(n&-n);
    int logvalue=(int)(Math.log(ans)/Math.log(2));
   return logvalue+1;
}
}
TC=O(1)