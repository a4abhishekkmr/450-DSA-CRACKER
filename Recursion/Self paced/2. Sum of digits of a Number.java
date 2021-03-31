2. Sum of Digits of a Number 

You are given a number n. You need to find the sum of digits of n.

Example 1:

Input:
n = 1
Output: 1
Explanation: Sum of digit of 1 is 1.
Example 2:

Input:
n = 99999
Output: 45
Explanation: Sum of digit of 99999 is 45.

class Solution
{
    // complete the function
    public static int sumOfDigits(int n)
    {
        // add your code here
        return(fn(n));
    }
    static int fn(int n)
    {
        if(n<=9)
        return n;
        
        return (n%10)+fn(n/10);
    }
}

Time complexity-(logn +1) actually O(d) times where d is the size of element.
Auxiliary Space: O(Logn) (Recursive). O(d) times where d is the size of element.
Here i saved 1 of the aux space by putting n<=9. if i set n==0 then it would have movved to O(d+1);