Example 1:

Input: grid = {{3,0,3,0,0},{3,0,0,0,3}
,{3,3,3,3,3},{0,2,3,0,0},{3,0,0,1,3}}
Output: 0
Explanation: The grid is-
3 0 3 0 0 
3 0 0 0 3 
3 3 3 3 3 
0 2 3 0 0 
3 0 0 1 3 
There is no path to reach at (3,1) i,e at 
destination from (4,3) i,e source.
Example 2:

Input: grid = {{1,3},{3,2}}
Output: 1
Explanation: The grid is-
1 3
3 2
There is a path from (0,0) i,e source to (1,1) 
i,e destination.
  
  
  
  
  
  
  
 class Solution
{
    //Function to find whether a path exists from the source to destination.
    boolean flag=false;
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=n;
        
        
        int a=0,b=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)//source found
                {
                    a=i;b=j;
                    break;
                }
            }
        }
        dfs(a,b,n,m,grid);
        return flag;
    }
    void dfs(int i,int j,int n,int m,int [][] grid)
    {
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==0 || flag==true)
        return;
        
        if(grid[i][j]==2)
        {
            flag=true;
            return;
        }
       grid[i][j]=0;//marks for the visited not to be visit
        dfs(i+1,j,n,m,grid);
        dfs(i,j+1,n,m,grid);
        dfs(i-1,j,n,m,grid);
        dfs(i,j-1,n,m,grid);
        
    }
} 
