6. First Repeating Element 
https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1/?track=DSASP-Hashing&batchId=154#

Given an array arr[] of size n, find the first repeating element. The element should occurs more than once and the index of its first occurrence should be the smallest.

 

Example 1:

Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
Explanation: 
5 is appearing twice and 
its first appearence is at index 2 
which is less than 3 whose first 
occuring index is 3.

class Solution{
    //Function to return the position of the first repeating element.
    public static int firstRepeated(int []arr, int n) 
    {
        //Your code here
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int x:arr)
        h.put(x,h.getOrDefault(x,0)+1);
        
        for(int i=0;i<n;i++)
        {
            if(h.get(arr[i])>1)
            return i+1;
        }
        return -1;
    }
}
//tc=O(n)
//aux space=O(n)
