Number of 1 Bits 

Input:
N = 6
Output:
2
Explanation:
Binary representation is '110' 
So the count of the set bit is 2.


class Solution {
    static int setBits(int n) {
     int count=0;
        // code here
        while(n>0)
        
        {
           count=count+(n&1);
          n=n/2;
        }return count;
    
}//return Integer.bitCount(N);
}

Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(1)