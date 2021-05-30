Given a array of size n, find the minimum difference between any pair of elements in given array.


Example 1:

Input: 
Arr = [2, 4, 5, 9, 7]
Output: 
1
Explanation: Difference between 5 and 4 is 1.
  
  //User function Template for Java

class Solution{
    //Function to find minimum difference between any pair of elements in an array.
    public static int MinimumDifference(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        
        int diff=Integer.MAX_VALUE;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
             diff=arr[i+1]-arr[i];
             res=Math.min(res,diff);
        }
        return res;
    }
};//TC=O(nlogn) due to sorting.
