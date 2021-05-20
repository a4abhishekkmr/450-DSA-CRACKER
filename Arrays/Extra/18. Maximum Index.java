Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] <= A[j].
 

Example 1:
Input:
N = 9
A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output:
6
Explanation:
In the given array A[1] < A[7]
satisfying the required 
condition(A[i] <= A[j]) thus giving 
the maximum difference of j - i 
which is 6(7-1).
  
  
  
 class Solution{
    
    // arr[]: input array
    // n: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
        int high=n-1,low=0;
        int diff=0,res=0;
        while(low<=high)
        {
            if(arr[low]<=arr[high])
            {
                diff=high-low;
                res=Math.max(res,diff);
                low++;
                high=n-1;
            }
            else
            {high--;}
        }
        return res;
    }
}
//
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
 
