Find position of set bit 

Given a number N having only one ‘1’ and all other ’0’s in its binary representation, find position of the only set bit. If there are 0 or more than 1 set bit the answer should be -1. Position of  set bit '1' should be counted starting with 1 from LSB side in binary representation of the number.

Example 1:

Input:
N = 2
Output:
2

Explanation:
2 is represented as "10" in Binary.
As we see there's only one set bit
and it's in Position 2 and thus the
Output 2.

class Solution {
    static int findPosition(int N) {
        // code here
        int l=Integer.bitCount(N);
        if(l==1)
        {
            int a= (int)( (Math.log(N)/Math.log(2)));
            return a+1;
        }
        else
        return -1;
        
    }
};

Expected Time Complexity: O(log(N))
Expected Auxiliary Space: O(1)