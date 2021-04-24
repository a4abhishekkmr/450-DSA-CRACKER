Given an array arr[] of size N containing non-negative integers. You need to insert all elements of the array to deque and return it.

Example 1:

Input: 
5
1 2 3 4 5

Output: 
1 2 3 4 5

Explanation: 
After insert in the deque 
it will look like {1, 2, 3, 4, 5}.



class Solution{
        public static ArrayDeque<Integer> deque_Init(int arr[], int n)
    {
        //Your code here
        ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
        for(int i=0;i<n;i++)
        ad.add(arr[i]);
        
        return ad;
    }
}
//Time is O(n) and aux space is the space used by arraydeque :O(n)