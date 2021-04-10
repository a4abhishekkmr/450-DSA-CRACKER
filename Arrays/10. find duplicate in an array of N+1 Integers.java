https://leetcode.com/problems/find-the-duplicate-number/
287. Find the Duplicate Number

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [1,1]
Output: 1

class Solution {
    public int findDuplicate(int[] arr) {
        
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            if(arr[i]==arr[j])
                return arr[i];
        }
        return -1;
    }
}
time=O(n^2)
Aux space=O(1)

Next Approach
class Solution {
    public int findDuplicate(int[] arr) {
        
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
                return arr[i];
        }
        return -1;
    }
}
time=O(nlogn)
space=O(1)