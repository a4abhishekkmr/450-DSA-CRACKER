Count Inversions 

Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 

Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).


class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        //it we use naive solution it will take n^2 so i am mving towards efficeint way
        //that uses merge sort
        
        return invCount(arr,0,N-1);
    }
    static long invCount(long arr[],long l, long r)
        {
            long res=0;
        if(l<r)
        {
            long m=(long)(l+r)/2;
            res+=(long)invCount(arr,l,m);
             res+=(long)invCount(arr,m+1,r);
              res+=(long)CountandMerge(arr,l,m,r);
        }
        return res;
    }
    
    //fucnction count and merge
    static long CountandMerge(long arr[], long l, long m, long r)
    {
        long n1=m-l+1,n2=r-m;
        long left[]=new long[(int)n1];
        long right[]=new long[(int)n2];
        
        for(long i=0;i<n1;i++)
        left[(int)i]=arr[(int)(l+i)];
        
        for(long i=0;i<n2;i++)
        right[(int)i]=arr[(int)(m+i+1)];
        
        long res=0,i=0,j=0,k=l;
        
        while(i<n1 && j<n2)
        {
            if(left[(int)i]<=right[(int)j])
            {arr[(int)k]=left[(int)i];i++;}
            
            else
            {
                arr[(int)k]=right[(int)j];j++;
                res+=(n1-i);
            }
            k++;
        }
        while(i<n1)
        {
            arr[(int)k]=left[(int)i];
            i++;k++;
        }
        while(j<n2)
        {
            arr[(int)k]=right[(int)j];
            j++;k++;
        }
        
        return res;
        
    }
}