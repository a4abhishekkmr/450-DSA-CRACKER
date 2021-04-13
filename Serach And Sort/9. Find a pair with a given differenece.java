Find Pair Given Difference 

Given an array Arr[] of size L and a number N, you need to write a program to find if there exists a pair of elements in the array whose difference is N.

Example 1:

Input:
L = 6, N = 78
arr[] = {5, 20, 3, 2, 5, 80}
Output: 1
Explanation: (2, 80) have difference of 78.



class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        int low=0;
        int high=1;
        if(arr[size-1]-arr[low]<n)
        return false;
        
        while(low<size && high<size)
        {
            if(arr[high]-arr[low]==n) return true;
            
            else if((arr[high]-arr[low])<n)
            high++;

            else
            low++;
        }
        return false;
    }
}
//Expected Time Complexity: O(L* Log(L)).
//Expected Auxiliary Space: O(1).