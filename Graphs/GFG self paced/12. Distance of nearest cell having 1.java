Given a binary grid. Find the distance of nearest 1 in the grid for each cell.
The distance is calculated as |i1 – i2| + |j1 – j2|, where i1, j1 are the row number and column number of the current cell and i2, j2 are the row number and column number of the nearest cell having value 1.
 

Example 1:

Input: grid = {{0,1,1,0},{1,1,0,0},{0,0,1,1}}
Output: {{1,0,0,1},{0,0,1,1},{1,1,0,0}}
Explanation: The grid is-
0 1 1 0 
1 1 0 0 
0 0 1 1 
0's at (0,0), (0,3), (1,2), (1,3), (2,0) and
(2,1) are at a distance of 1 from 1's at (0,1),
(0,2), (0,2), (2,3), (1,0) and (1,1)
respectively.







class Solution
{
    class Pair{
        int x;
        int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    
    int xDir[]={0,0,-1,1};
    int yDir[]={-1,1,0,0};
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        int ans[][]=new int[n][m];
        
        Queue<Pair> q=new LinkedList<>();
        //clearing all 1's->0
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans[i][j]=12345678;//Unknown
                if(grid[i][j]==1)
                {
                    ans[i][j]=0;
                    q.add(new Pair(i,j));
                }
            }
        }
        
        while(!q.isEmpty())
        {
            Pair temp=q.poll();
            int a=temp.x;
            int b=temp.y;
            for(int i=0;i<4;i++)
            {
                int xNew=a+xDir[i];
                int yNew=b+yDir[i];
                //isSafe
                if( isSafe(xNew,yNew,n,m)&& ans[xNew][yNew]>ans[a][b]+1)
                {
                    ans[xNew][yNew]=ans[a][b]+1;
                    q.add(new Pair(xNew,yNew));
                }
            }
             
        }
        
        return ans;
        
    }
    boolean isSafe(int xNew,int yNew,int n,int m)
    {if(xNew>=0 &&xNew<n &&yNew>=0 && yNew<m)
    return true;
    else return false;
    }
}
