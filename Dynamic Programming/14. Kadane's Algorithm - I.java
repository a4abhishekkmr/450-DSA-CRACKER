Kadane's algorithm comes into picture when we want to find the maximum possible sum in an array when summing the contiguous elements of the array.

You are given an array. Find the maximum possible sum of contiguous elements of the array ending at each position in the array. Also, return the overall maximum that we can achieve.

 

Example 1:

Input:
N = 6
arr[] = {5,-2,-3,32,-5,65}
Output: 5 3 0 32 27 92
        92
Explanation: Maximum sum at each index is
5, 3, 0, 32, 27, 92. And, maximum sum for
contiguous array is 92.
  
  
  
  
  
  class Solution
{
    //Function to print the maximum contiguous subarray sum ending at each 
    //position in the array and return the overall maximum.
    public long maximumSum(int arr[], int sizeOfArray)
    {
       //code here
       int TempMax=arr[0];
       int Max=arr[0];
       //int result[]=new int[sizeOfArray];
       //result[0]=arr[0];
       System.out.print(arr[0]+" ");
       for(int i=1;i<sizeOfArray;i++)
       {
           TempMax=Math.max(arr[i],TempMax+arr[i]);
           //result[i]=TempMax;
           System.out.print(TempMax+" ");
           Max=Math.max(TempMax,Max);
       }
    //   for(int i:result)
    //   System.out.print(i+" ");
       System.out.println();
       return Max;
    }

}//DOne in O(N) time and O(1) space.
