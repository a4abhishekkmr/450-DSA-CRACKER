Merge Without Extra Space 

Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order. Merge the two arrays into one sorted array in non-decreasing order without using any extra space.


Example 1:

Input:
N = 4, M = 5
arr1[] = {1, 3, 5, 7}
arr2[] = {0, 2, 6, 8, 9}
Output: 0 1 2 3 5 6 7 8 9
Explanation: Since you can't use any 
extra space, modify the given arrays
to form 
arr1[] = {0, 1, 2, 3}
arr2[] = {5, 6, 7, 8, 9}


class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int i=n-1,j=0,k=0;
        while(i>=0 && j<m)//min(n,m)
        {
            
            if(arr1[i]>arr2[j])
            {//swap
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            } i--;j++;
        }
        Arrays.sort(arr1);//nlogn
        Arrays.sort(arr2);//mlogm
    }
}
// Tc:O(max(m,n)log(max(m,n));
// Aux space:O(1)