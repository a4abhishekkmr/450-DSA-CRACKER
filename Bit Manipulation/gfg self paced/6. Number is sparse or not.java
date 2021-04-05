Given a number N. The task is to check whether it is sparse or not. A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.

Example 1:

Input: N = 2
Output: true
Explanation: Binary Representation of 2 is 10, 
which is not having consecutive set bits. 
So, it is sparse number.

Example 2:

Input: N = 3
Output: false
Explanation: Binary Representation of 3 is 11, 
which is having consecutive set bits in it. 
So, it is not a sparse number.



class Solution{
    
    // Function to check if the given number is sparse or not
    public static boolean isSparse(int n){
        
        // Your code here
        //if a number having consecutive sets of 1 called sparse 
        //so we have to fing the non consecutive sets.
        
        if(n<=2) return true;
         
        while(n>0)
        {
            if(((n&1)!=0) && ((n&2)!=0))
            {
                return false;
            }
            n=n/2;//right sift=divide by 2.
        }
        
        return true;
    }
    
}

like 3= 011== n&1    n&10 in boolean
tc=O(1)

One can also do by adding and finding 2 consecutive numbers.