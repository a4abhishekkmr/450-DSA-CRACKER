Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.


Example 1:

Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.



class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int arr[], int n, int X) { 
    
       // Your code Here
    Arrays.sort(arr);
    
    int low=0,high=0;
    
    for(int i=0;i<n-2;i++)
    {
    low=i+1;
    high=n-1;
    while(low<high)
    {
        if(arr[i]+arr[low]+arr[high]==X)
        return true;
        
        else if(arr[i]+arr[low]+arr[high]<X)
        low++;
        
        else if(arr[i]+arr[low]+arr[high]>X)//else
        high--;
    }
    }
    return false;
    }
}
//O(n^2) with and O(1) aux space..