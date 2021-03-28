Find second largest element 

Given an array of elements. Your task is to find the second maximum element in the array.

Example 1:

Input:
N=5
arr[] = { 2, 4, 5, 6, 7 }
Output:  6
Explanation:
The largest element is 7 and 
the second largest element is 6.


class Solution
{ 
    public static int print2largest(int A[],int N) 
    {
        //CODE HERE
        int res=-1,largest=0;
        for(int i=1;i<N;i++)
        {
            if(A[i]>A[largest])
            {
                res=largest;
                largest=i;
            }
            else if(A[i]!=A[largest])
            {
                if(res==-1 || A[i]>A[res])
                    res=i;
            }
        }
        if(res==-1)
        return -1;
        else
        return A[res];
    }
}
TC-O(n) theta
aux space-O(1);