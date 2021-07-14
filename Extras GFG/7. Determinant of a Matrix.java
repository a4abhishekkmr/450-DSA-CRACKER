Input:
N = 4
matrix[][] = {{1, 0, 2, -1},
              {3, 0, 0, 5},
              {2, 1, 4, -3},
              {1, 0, 5, 0}}
Output: 30
Explanation:
Determinant of the given matrix is 30.
  
  
  
  class Solution
{
    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int matrix[][], int n)
    {
        // code here 
        int D=0;
        if(n==1) return matrix[0][0];
        int temp[][]=new int[n][n];
        int sign=1;
        //for each element of first row
        for(int i=0;i<n;i++)
        {
            cofactor(matrix,temp,i,n);
            D+=sign*matrix[0][i]*determinantOfMatrix(temp,n-1);
            sign=-sign;
        }
        return D;
    }
    static void cofactor(int matrix[][],int temp[][], int i, int n)
    {int ii=0,jj=0;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
                if(r!=0 && c!=i)
                {
                   temp[ii][jj++]=matrix[r][c]; 
                }
                if(jj==n-1)
                {
                    jj=0;ii++;
                }
            }
        }
    }
}
