Given a grid of dimension nxm containing 0s and 1s. Find the unit area of the largest region of 1s.
Region of 1's is a group of 1's connected 8-directionally (horizontally, vertically, diagonally).
 

Example 1:

Input: grid = {{1,1,1,0},{0,0,1,0},{0,0,0,1}}
Output: 5
Explanation: The grid is-
1 1 1 0
0 0 1 0
0 0 0 1
The largest region of 1's 
  
Example 2:

Input: grid = {{0,1}}
Output: 1
Explanation: The grid is-
0 1
The largest region of 1's is 
  
  
  
  class Solution
{
    //Function to find unit area of the largest region of 1s.
    int count=0;
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {if(grid[i][j]==1)
               { dfs(grid,i,j,n,m);
               
               res=Math.max(res,count);
               count=0;}//reset
            }//end of j
        }//end of i
        
        return res;
    }
     void dfs(int[][] grid,int i,int j,int n,int m)
    { 
        
        if(i<0 || i>=n ||j<0 || j>=m || grid[i][j]==0)
        return;
        count++;
        grid[i][j]=0;
        dfs(grid,i+1,j,n,m);
        dfs(grid,i,j+1,n,m);
        dfs(grid,i-1,j,n,m);
        dfs(grid,i,j-1,n,m);
        dfs(grid,i-1,j-1,n,m);
        dfs(grid,i-1,j+1,n,m);
        dfs(grid,i+1,j+1,n,m);
        dfs(grid,i+1,j-1,n,m);
        
    }
}
