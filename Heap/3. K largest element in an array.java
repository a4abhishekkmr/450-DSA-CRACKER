k largest elements 

Given an array Arr of N positive integers, find K largest elements from the array.  The output elements should be printed in decreasing order.

Example 1:

Input:
N = 5, K = 2
Arr[] = {12, 5, 787, 1, 23}
Output: 787 23
Explanation: 1st largest element in the
array is 787 and second largest is 23.



class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
int ans[]=new int[k];
//created a priority queue that contains elements of size k of descending order
for(int i=0;i<n;i++)
q.add(arr[i]);

for(int i=0;i<k;i++){
int temp=q.poll();
ans[i]=temp;}
return ans;
}
}
// 1) Build a Max Heap tree in O(n) 
// 2) Use Extract Max k times to get k maximum elements from the Max Heap 
//Aux space=O(k)