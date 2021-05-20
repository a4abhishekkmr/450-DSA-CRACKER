Given an array arr[] of size N where every element is in the range from 0 to n-1. Rearrange the given array so that arr[i] becomes arr[arr[i]].

 

Example 1:

Input:
N = 2
arr[] = {1,0}
Output: 0 1
Explanation: 
arr[arr[0]] = arr[1] = 0.
arr[arr[1]] = arr[0] = 1.
 

Example 2:

Input:
N = 5
arr[] = {4,0,2,1,3}
Output: 3 4 2 0 1
Explanation: 
arr[arr[0]] = arr[4] = 3.
arr[arr[1]] = arr[0] = 4.
and so on.




//User function Template for Java

//
//The idea is to store each element’s new and old value as quotient and remainder of n, respectively (n being the size of the array). 
//For example, Suppose an element’s new value is 2, the old value is 1 and n is 3, then the element’s value is stored as 1 + 2*3 = 7. We can retrieve its old value by 7%3 = 1 and its new value by 7/3 = 2. 
class Solution
{
 
    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    static void arrange(long arr[], int n)
    {
        // your code here
        for(int i=0;i<n;i++)
        {
            arr[i]+=(arr[(int)arr[i]]%n)*n;
        }
        
        for(int i=0;i<n;i++)
        {
            arr[i]/=n;
        }
    }
}
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
