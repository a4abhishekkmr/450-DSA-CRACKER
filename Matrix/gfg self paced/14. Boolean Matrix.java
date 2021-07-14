Input:
R = 2, C = 2
matrix[][] = {{1, 0},
              {0, 0}}
Output: 
1 1
1 0 
Explanation:
Only cell that has 1 is at (0,0) so all 
cells in row 0 are modified to 1 and all 
cells in column 0 are modified to 1.
  
  
  
  
  class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
          int r=matrix.length;
        int c=matrix[0].length;
        
        int row[]=new int[r];
        int col[]=new int[c];
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==1)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<r;i++)
        {if(row[i]==1)
            for(int j=0;j<c;j++)
            {
                {matrix[i][j]=1;}
            }
        }
        for(int i=0;i<c;i++)
        {
            if(col[i]==1)
            for(int j=0;j<r;j++)
            matrix[j][i]=1;
        }
        

    }
}
