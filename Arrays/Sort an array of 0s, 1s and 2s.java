Sort an array of 0s, 1s and 2s 

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

Solution>>

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        Arrays.sort(a);
    }
}

Time Complexity-O(nlogn)
Space complexity-O(n) - due to array