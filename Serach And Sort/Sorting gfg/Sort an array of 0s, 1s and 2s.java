Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
  
  
  class Solution
{//Dutch National Flag Algorithm
    public static void sort012(int arr[], int n)
    {
        // code here 
        int l=0,h=n-1,mid=0;
        while(mid<=h)
        {
            if(arr[mid]==0)
            {
                int temp=arr[l];
                arr[l]=arr[mid];
                arr[mid]=temp;
                
                l++;mid++;
            }
            else if(arr[mid]==1)
            mid++;
            
            else
            {
                
                int temp=arr[h];
                arr[h]=arr[mid];
                arr[mid]=temp;
                
                h--;
            }
        }
    }
}
TC=O(n) and space O(1)
