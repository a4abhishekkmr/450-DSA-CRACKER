5. Max and Second Max 

Given an array arr[] of size N of positive integers which may have duplicates. The task is to find the maximum and second maximum from the array, and both of them should be distinct, so If no second max exists, then the second max will be -1.

Example 1:

Input:
N = 3
arr[] = {2,1,2}
Output: 2 1
Explanation: From the given array 
elements, 2 is the largest and 1 
is the second largest.

class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int n, int arr[])
    {
        //code here.
        ArrayList <Integer> al=new ArrayList<Integer>(2);

        al.add(largest(n,arr));
        al.add(second(n,arr));
        
        return al;
    }
    static int largest(int n,int arr[])
    {
        int largest=0;
        for(int i=0;i<n;i++)
        if(arr[i]>arr[largest])
        largest=i;
        return arr[largest];
    }
    
    static int second(int n,int arr[])
    {
        int res=-1;
        int x=largest(n,arr);
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=x)
            {
                if(res==-1)
                res=i;
                else if(arr[i]>arr[res])
                res=i;
            }
        }
        if(res!=-1)
        return arr[res];
        
        return -1;
    }
}

Time complexity- O(n)
Aux space-O(1).