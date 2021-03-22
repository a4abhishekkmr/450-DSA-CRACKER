Row with max 1s 
Medium Accuracy: 42.51% Submissions: 15945 Points: 4
Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

Example 1:

Input: 
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based indexing).


Solution>>

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        //counter yha ni krna hai kyuki counter needs to be reset everytimes.
        int updater=0;
        int line=-1;//if not possible
        for(int i=0;i<n;i++)
        {
            int counter=0;
            for(int j=m-1;j>=0;j--)
            {
                if(arr[i][j]==1)
                {
                    counter++;
                }
                else
                {
                    break;
                }
            }if(counter>updater)
            {
                updater=counter;
                line=i;
            }
        }
        return line;
    }
}

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)