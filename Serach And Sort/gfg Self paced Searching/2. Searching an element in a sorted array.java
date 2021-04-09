Given a sorted array of size N and an integer K. Check if K is present in the array or not.


Example 1:

Input:
N = 5, K = 6
arr[] = {1,2,3,4,6}
Output: 1
Exlpanation: Since, 6 is present in 
the array at index 4 (0-based indexing),
output is 1.




class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int low=0,high=N,mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==K)
            return 1;
            
            else if(arr[mid]>K)
            high=mid-1;
            
            else
            low=mid+1;
        }
        return -1;
        
    }
}