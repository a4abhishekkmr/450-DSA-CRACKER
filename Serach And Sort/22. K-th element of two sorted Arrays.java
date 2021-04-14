Given two sorted arrays arr1 and arr2 of size M and N respectively and an element K. The task is to find the element that would be at the k’th position of the final sorted array.
 

Example 1:

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
Explanation:
The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.


class Solution {
    public long kthElement( int a[], int b[], int n, int m, int x) {
        //merged the 2 sorted array and found the kth element in it.
        int ans[]=new int [n+m];
        int i=0;int j=0;int k=0;
        while((i<n) && j<m)
        {
            if(a[i]<=b[j])
            {
                ans[k]=a[i];
                i++;
                k++;
            }
            else
            {
                ans[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<n)
        {
            ans[k]=a[i];
                i++;
                k++;
        }
        while(j<m)
        {
            ans[k]=b[j];
                j++;
                k++;
        }
        
        return (long)ans[x-1];
    }
}

//TC(n+m log(n+m))
//aux=O(n+M)
