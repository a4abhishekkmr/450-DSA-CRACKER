Given an array Arr of n integers arranged in a circular fashion. Your task is to find the minimum absolute difference between adjacent elements.

Example 1:

Input:
n = 7
Arr[] = {8,-8,9,-9,10,-11,12}
Output: 4
Explanation: The absolute difference 
between adjacent elements in the given 
array are as such: 16 17 18  19 21 23 4
(first and last). Among the calculated 
absolute difference the minimum is 4.

class Solution{
    
    //Function to find minimum adjacent difference in a circular array.
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        
        // Your code here
        
        int temp=Math.abs(arr[n-1]-arr[0]);
        
        for(int i=0;i<n-1;i++)
        {
            arr[i]=Math.abs(arr[i]-arr[i+1]);
        }
        
        //now
        int min=arr[0];
        for(int i=0;i<n-1;i++)
        if(arr[i]<min)
        min=arr[i];
        
        return Math.min(min,temp);
    }
}

TC=O(n)+O(n)=> O(n).
SC=>O(n).