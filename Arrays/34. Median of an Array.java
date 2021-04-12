Find the median 

Given an array arr[] of N integers, calculate the median
 

Example 1:

Input: N = 5
arr[] = 90 100 78 89 67
Output: 89
Explanation: After sorting the array 
middle element is the median

class Solution
{
    public int find_fact(int[] v)
    {
        // Code here
        int n=v.length;
        Arrays.sort(v);
        if(n%2!=0)
        return v[n/2];
        else
        return (v[n/2-1]+v[n/2])/2;
    }
}
tc=O(nlogn)
Aux space=O(1)