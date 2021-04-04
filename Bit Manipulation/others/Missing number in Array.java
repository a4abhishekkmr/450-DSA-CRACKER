
Given an array of size N-1 such that it can only contain distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {1,2,3,4,5,6,7,8,10}
Output: 9.

class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
  
        int sum=0;
        for(int i=1;i<=n;i++)
        sum=sum^i;
        
        int xum=0;
        for(int i=0;i<n-1;i++)
        xum=xum^array[i];
        
        return sum^xum;
    }
}
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).