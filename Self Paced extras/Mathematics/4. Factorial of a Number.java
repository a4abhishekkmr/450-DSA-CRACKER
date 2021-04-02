4. Factorial Of Number 
Easy Accuracy: 52.06% Submissions: 16923 Points: 2
Given a positive integer N. The task is to find factorial of N.

Example 1:

Input:
N = 4
Output: 24
Explanation: 4! = 4 * 3 * 2 * 1 = 24

class Solution {

    public long factorial(int n) {
        // Your code here
        if(n==1||n==0) return 1;
        
        long a=(n)*factorial(n-1);
        return a;
    }
}

Time Complexity : O(N)
Auxilliary Space : O(N)-recursive
