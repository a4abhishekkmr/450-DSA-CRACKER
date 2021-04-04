3. Check whether K-th bit is set or not 

Given a number N and a bit number K, check if Kth bit of N is set or not. A bit is called set if it is 1. Position of set bit '1' should be indexed starting with 0 from LSB side in binary representation of the number.

Example 1:

Input: N = 4, K = 0
Output: No
Explanation: Binary representation of 4 is 100, 
in which 0th bit from LSB is not set. 
So, return false.


class CheckBit{
    
    static boolean checkKthBit(int n, int k){
        
        // Your code here
        //using left shift
        if(((n)&(1<<k))!=0)
        return true;
        
        else
        return false;
    }
    
}
TC=O(1)
SC=O(1).