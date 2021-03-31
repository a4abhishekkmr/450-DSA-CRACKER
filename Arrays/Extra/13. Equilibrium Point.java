13. Equilibrium Point 
Easy Accuracy: 49.32% Submissions: 58497 Points: 2
Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Example 1:

Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
Explanation: For second test case 
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2).




class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==1) return 1;
        long sum=0;
        for(int i=0;i<n;++i)
        sum+=arr[i];
        
          long lsum=0;
        for(int i=0;i<n;++i){
        sum-=arr[i];     //sum is now right sum for index i
        if(lsum==sum)
        return i+1;
        
        lsum+=arr[i];
        
        }
        return -1;
    }
}

Time complexity==> O(n) and space is O(1). only 2 times n called one id for sum and next is for lsum by the way rsum is calculated by substarcting
sum-lsum.