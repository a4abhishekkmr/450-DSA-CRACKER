Number of occurrence 
Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Example 1:

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.

class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int freq=1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                freq++;
            }
        }
        return freq-1;
    }
}

TC=O(n)
aux space- O(1).