You are given a matrix of dimensions (n1 x m1). You have to exchange its first column with the last column.

Example 1:

Input:
n1 = 4, m1 = 4
matrix[][] = {{1, 2, 3, 4},
              {5, 6, 7, 8},
              {9, 10, 11, 12},
              {13, 14, 15,16}}
Output: 
4 2 3 1 8 6 7 5 12 10 11 9 16 14 15 13
Explanation:
Matrix is as follow:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
After exchanging first column with 
last column, we have matrix as follows:
4 2 3 1
8 6 7 5
12 10 11 9
16 14 15 13
  
  
  
  
  class Solution
{
    //Function to exchange first column of a matrix with its last column.
    static void exchangeColumns(int matrix[][])
    {
        // code here 
        int r=matrix.length;
        int c=matrix[0].length;
        
        int first=0,last=c-1;
        for(int i=0;i<r;i++)
        {
            int temp=matrix[i][first];
            matrix[i][first]=matrix[i][last];
            matrix[i][last]=temp;
        }
    }
}
