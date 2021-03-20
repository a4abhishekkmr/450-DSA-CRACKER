Kth smallest element 

Given an array arr[] and a number K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.

Solution>>
public static int kthSmallest(int[] arr, int l, int r, int k) 
{ 
    //Your code here
    Arrays.sort(arr);
    int t=arr[k-1];
    return t;
} 

Time complexity-O(nlogn)
Space-O(n)- due to array