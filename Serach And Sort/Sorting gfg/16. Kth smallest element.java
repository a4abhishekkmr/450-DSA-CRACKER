Given an array arr[] of N positive integers and a number K. The task is to find the kth smallest element in the array.

 

Example 1:

Input: 
N = 5, K = 3
arr[] = {3,5,4,2,9}

Output: 
4

Explanation: 
Third smallest element in the array is 4.
  
  
  
  


class Solution
{
    //Function to find the kth smallest element in the array.
    public static int kthSmallest(int arr[], int n, int k)
    {
        // Your code here
        int l=0,h=n-1;
        while(l<=h)
        {
            int p=partition(arr,l,h);
            //lomuto
            if(p==k-1)
            return arr[p];
            else if(p>k-1)
            h=p-1;
            else
            l=p+1;
        }
        return -1;
    }
    
    
    static int partition(int arr[],int l,int h)
    {
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }int temp1=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp1;
        
        return i+1;
    }
}
//Expected Time Complexity: O(NlogK)
// Expected Auxilliary Space: O(K)
