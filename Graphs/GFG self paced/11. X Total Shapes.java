Given  a grid of n*m consisting of O's and X's. The task is to find the number of 'X' total shapes.
Note: 'X' shape consists of one or more adjacent X's (diagonals not included).
 

Example 1:

Input: grid = {{X,O,X},{O,X,O},{X,X,X}}
Output: 3
Explanation: 
The grid is-
X O X
O X O
X X X
So, X with same colour are adjacent to each 
other vertically for horizontally (diagonals 
not included). So, there are 3 different groups 
in the given grid.

  
  
  

class Solution
{
    //Function to find the number of 'X' total shapes.
    public int xShape(char[][] grid)
    {
        // code here
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {if(grid[i][j]=='X')
               { dfs(grid,i,j,n,m);
            count++;}}
        }
        return count;
    }
    void dfs(char[][] grid,int i,int j,int n,int m)
    {
        if(i<0 || i>=n ||j<0 || j>=m || grid[i][j]=='O'|| grid[i][j]=='A')
        return;
        
        grid[i][j]='A';
        dfs(grid,i+1,j,n,m);
        dfs(grid,i,j+1,n,m);
        dfs(grid,i-1,j,n,m);
        dfs(grid,i,j-1,n,m);
        
    }
    
}
