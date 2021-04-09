6. Left Index 

Given a sorted array of positive integers (elements may be repeated) and a number x. The task is to find the leftmost index of x in the given array.

Example 1:

Input:
N = 10
arr[] = {1,1,2,2,3,4,5,5,6,7}
x = 1
Output: 0
Explanation: 1 is present two times
in the array and its leftmost index 
is 0.



class LeftIndex{ 

    static int leftIndex(int N, int arr[], int K)
    {
       
       // Your code here
       int low=0,high=N-1,mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            
            if(arr[mid]>K)
            high=mid-1;
            
            else if(arr[mid]<K)
            low=mid+1;
            
            else
            {
                if(mid==0 || arr[mid-1]!=arr[mid])
                return mid;
                else
                high=mid-1;
            }
        }
        return -1;
   
    }
}