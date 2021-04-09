Median in a row-wise sorted Matrix 

Given a row wise sorted matrix of size RxC where R and C are always odd, find the median of the matrix.

Example 1:

Input:
R = 3, C = 3
M = [[1, 3, 5], 
     [2, 6, 9], 
     [3, 6, 9]]

Output: 5

Explanation:
Sorting matrix elements gives us 
{1,2,3,3,5,6,6,9,9}. Hence, 5 is median.


class Solution {
    int median(int matrix[][], int r, int c) {
        // code here  
        ArrayList<Integer> al=new ArrayList<Integer>(r+c);
        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        al.add(matrix[i][j]);
        
        Collections.sort(al);
        
        int mid=(r*c)/2;
        int ans=0;
         ans=al.get(mid);
        return ans;
    }
}

Time complexity=O(r*c)
Space comp=O(r+c)