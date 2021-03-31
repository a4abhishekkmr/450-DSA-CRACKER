3. Count Total Digits in a Number 
Easy Accuracy: 50.0% Submissions: 20517 Points: 2
You are given a number n. You need to find the count of digits in n.

Example 1:

Input:
n = 1
Output: 1
Explanation: Number of digit in 1 is 1.
Example 2:

Input:
n  = 99999
Output: 5
Explanation:Number of digit in 99999 is 5

class Solution
{
    // complete the below function
    public static int countDigits(int n)
    {
        // add your code here
        if(n<=9)
        return 1;
        
        return recursion(n);
        
        
    }
    
    static int recursion(int n)
    {
        if(n==0) 
        return 0;
        
        return 1+recursion(n/10);
    }
}

Expected Time Complexity: O(Logn). as O(d) in which d is the size of n;
Expected Auxiliary Space: O(Logn). as d+1 times callled which is equals to approx log(n)
