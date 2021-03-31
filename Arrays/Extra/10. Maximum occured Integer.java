10. Maximum occured integer 

Given n integer ranges, the task is to find the maximum occurring integer in these ranges. If more than one such integer exits, find the smallest one. The ranges are given as two arrays L[] and R[].  L[i] consists of starting point of range and R[i] consists of corresponding end point of the range.

For example consider the following ranges.
L[] = {2, 1, 3}, R[] = {5, 3, 9)
Ranges represented by above arrays are.
[2, 5] = {2, 3, 4, 5}
[1, 3] = {1, 2, 3}
[3, 9] = {3, 4, 5, 6, 7, 8, 9}
The maximum occurred integer in these ranges is 3.


class Solution{
    //Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int L[], int R[], int n, int maxx){
        
        int[] arr=new int[1000000];
        
        //adding 1 at Li index and substractiong 1 at Ri index
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            arr[L[i]]=arr[L[i]]+1;//reachable;
            arr[R[i]+1]=arr[R[i]+1]-1;
            
            if(max<R[i])
            max=R[i];
            
        }
        
        //finding prefix sum and array
        
        int sum=arr[0];
        int index=0;
        for(int i=1;i<max+1;i++)
        {
            arr[i]+=arr[i-1];
            //found prefix now,
            if(sum<arr[i])
            {sum=arr[i];
            index=i;}
            //this updates the index to the greatest prefix in the array
        }
        return index;
    }
    
}

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(maxx).