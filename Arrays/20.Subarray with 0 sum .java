Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.

Example 1:

Input:
5
4 2 -3 1 6

Output: 
Yes

Explanation: 
2, -3, 1 is the subarray 
with sum 0.



class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //here i will use the approach of finding sum==0 in the array
        for(int i=0;i<n;i++)
        if(arr[i]==0)
        return true;
        
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++)
        prefix[i]=prefix[i-1]+arr[i];
        
        //we need to checkk duplicates by Hash
        Set<Integer> hash=new HashSet<>();
        
        for(Integer items:prefix)
        {
            if(hash.add(items)==false)
            return true;
        }
        
        
        
        //this is to check weather the prefix sum is equals to 0
        for(int i=0;i<n;i++)
        if(prefix[i]==0)
        return true;
        
        return false;
}
}
//Time complexity=O(n) with O(1)
// Iterate through the array and for every element arr[i], calculate prefix sum.
// If we consider all prefix sums, we can notice that there is a subarray with 0 sum 
// when either a prefix sum repeats or prefix sum becomes 0.
// In both cases, we return true else we store the prefix sum in map or set and keep iterating.
// Return false if you don't get any subarray with 0 sum.