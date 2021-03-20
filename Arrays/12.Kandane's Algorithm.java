Kadane's Algorithm 

Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Example 1:

Input:
N = 5
arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which is a contiguous subarray.

Solution>>

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int sum=0;
        int maxi=0;
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            maxi=Math.max(sum,maxi);
            if(sum<0) sum=0;
        }
        return maxi;
    }
}

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
speciality of Kadane's algo