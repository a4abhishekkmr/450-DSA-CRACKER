Bit Difference  

You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.

Example 1:

Input: A = 10, B = 20
Output: 4
Explanation:
A  = 01010
B  = 10100
As we can see, the bits of A that need 
to be flipped are 01010. If we flip 
these bits, we get 10100, which is B.

public static int countBitsFlip(int a, int b){
        
        // Your code here
        return setBits(a^b);
    }
        
         static int setBits(int n) {
     int count=0;
        // code here
        while(n>0)
        
        {
           count=count+(n&1);
          n=n/2;
        }return count;
    
}
}

xor and do counting of the setBits

Second Approach
>> return Integer.bitCount(a^b);

Expected Time Complexity: O(log N).
Expected Auxiliary Space: O(1).