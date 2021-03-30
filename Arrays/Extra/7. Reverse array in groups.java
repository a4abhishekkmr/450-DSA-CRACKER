7. Reverse array in groups 

Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

 

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.



class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i=0;i<n;i=i+k)
        reverse(arr,i,Math.min(i+k-1,n-1));
    }
    
    void reverse(ArrayList<Integer> arr, int start, int end){
    while(start<end)
    {
        Collections.swap(arr,start,end);
        start++;
        end--;
    }
    }
}

TC-O(n/2) n times operation when k is even. else O(n/2+1) when k is odd.

 