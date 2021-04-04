Given a positive integer N, determine whether it is odd or even.

 

Example 1:

Input:
N = 1
Output:
odd

class Solution{
    static String oddEven(int n){
        // code here
        if((n&1)==1)
        return "odd";
        else
        return "even";
    }
}

String return type
TC=O(1)