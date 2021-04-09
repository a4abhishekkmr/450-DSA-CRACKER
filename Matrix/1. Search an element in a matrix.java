Search in a matrix 

Given a matrix mat[][] of size N x M, where every row and column is sorted in increasing order, and a number X is given. The task is to find whether element X is present in the matrix or not.

Example 1:

Input:
N = 3, M = 3
mat[][] = 3 30 38 
         44 52 54 
         57 60 69
X = 62
Output:
0
Explanation:
62 is not present in the matrix, so output is 0

Solution>>

class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        // your code here
        int rows=N;
        int cols=M;
        int target=X;
        //now
        int flag=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
             if(mat[i][j]==target)
             {
                 flag=1;
                 break;
             }
            }
        }
        if(flag==1)
            return 1;
        else
            return 0;
    }
}

TC-O(n*m)
SC-O(1)