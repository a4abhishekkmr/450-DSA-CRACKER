Cyclically rotate an array by one 

Given an array, rotate the array by one position in clock-wise direction.
 

Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4

Solution>>

class Compute {
    
    public void rotate(long arr[], long n)
    {
        long last=arr[(int)n-1];
        int index=(int)n;
        for(int x=index-1;x>0;x--)
        {
            arr[x]=arr[x-1];
        }
        arr[0]=last;
    }
}

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
