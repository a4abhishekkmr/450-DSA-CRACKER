Example 1:

Input: N = 7
Output: 4
Explanation: 7 is represented as 111 in 
binary form. The gray code of 111 is 100, 
in the binary form whose decimal equivalent 
is 4.
Example 2:

Input: N = 10
Output: 15
Explanation: 10 is represented as 1010 in 
binary form. The gray code of 1010 is 1111, 
in the binary form whose decimal equivalent 
is 15.


class Solution{
    
    //  Function to find the gray code of given number n
    public static int greyConverter(int n) {
        
        // Your code here
        while(n>0)
        {
            int a=n/2;
            int b=(n^a);
            
            n=n/2;
            return b;
        }
        return 0;
    }
    
}

// return (n^n/2);
// }}

this gives in O(1).