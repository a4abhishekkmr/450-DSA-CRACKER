Given a square matrix of size N x N. The task is to rotate it by 90 degrees in anti-clockwise direction without using any extra space. 

Example 1:

Input:
N = 3 
matrix[][] = {{1, 2, 3},
              {4, 5, 6}
              {7, 8, 9}}
Output: 
Rotated Matrix:
3 6 9
2 5 8
1 4 7

class Solution{
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        int temp[][]=new int[n][n];
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        temp[n-j-1][i]=matrix[i][j];
        
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        matrix[i][j]=temp[i][j];
    }
}
Here my code takes O(n^2) time with O(n^2) aux space complexity.