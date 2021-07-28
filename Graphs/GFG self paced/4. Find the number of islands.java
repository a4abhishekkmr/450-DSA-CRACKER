Given a grid consisting of '0's(Water) and '1's(Land). Find the number of islands.
Note: An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.
 

Example 1:

Input:
grid = {{0,1},{1,0},{1,1},{1,0}}
Output:
1
Explanation:
The grid is-
0 1
1 0
1 1
1 0
All lands are connected.


class Solution
{
    //Function to find the number of islands.
    public int numIslands(char[][] grid)
    {
        // Code here
        
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {if(grid[i][j]=='1')
               { dfs(grid,i,j,n,m);
            count++;}}
        }
        return count;
    }
    void dfs(char[][] grid,int i,int j,int n,int m)
    {
        if(i<0 || i>=n ||j<0 || j>=m || grid[i][j]=='0'|| grid[i][j]=='A')
        return;
        
        grid[i][j]='A';
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
