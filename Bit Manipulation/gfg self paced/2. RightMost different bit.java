Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers.

Example 1: 

Input: M = 11, N = 9
Output: 2
Explanation: Binary representation of the given 
numbers are: 1011 and 1001, 
2nd bit from right is different.

class Solution{
    /*  function to find position of rightmost different bit
    *   m, n : Integers to find rightmost different bits
    *   You can have a look in the locked code for information
    *   regarding other functions including driver code
    */ 
    public static int posOfRightMostDiffBit(int m, int n) {
            
        // Your code here        
            int ans=(n^m);
            int firstpos=(ans&-ans);
    int logvalue=(int)(Math.log(firstpos)/Math.log(2));
   return logvalue+1;

    }
}
TC=O(1)
ASC=O(1)
https://www.geeksforgeeks.org/position-rightmost-different-bit/