7. Longest Consecutive 1's 

Given a number N. Find the length of the longest consecutive 1s in its binary representation.

Example 1:

Input: N = 14
Output: 3
Explanation: 
Binary representation of 14 is 
1110, in which 111 is the longest 
consecutive set bits of length is 3.



class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int n) {
        
        // Your code here
        //we have to find longest sets count available in the binary of n
        //we will increase count and update the max and print the max.
        
        int max=0,counter=0;
        while(n>0)
        {
            if((n&1)==1)
            counter++;
            
            else
            counter=0;
            
            max=Math.max(counter,max);
            n=n>>1;//n/2 which is right shift
        }
        return max;
    }
}

TC=O(1).