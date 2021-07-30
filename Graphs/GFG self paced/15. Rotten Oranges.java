Given a grid of dimension nxm where each cell in the grid can have values 0, 1 or 2 which has the following meaning:
0 : Empty cell
1 : Cells have fresh oranges
2 : Cells have rotten oranges

We have to determine what is the minimum time required to rot all oranges. A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right) in unit time. 
 

Example 1:

Input: grid = {{0,1,2},{0,1,2},{2,1,1}}
Output: 1
Explanation: The grid is-
0 1 2
0 1 2
2 1 1
Oranges at positions (0,2), (1,2), (2,0)
will rot oranges at (0,1), (1,1), (2,2) and 
(2,1) in unit time.
Example 2:

Input: grid = {{2,2,0,1}}
Output: -1
Explanation: The grid is-
2 2 0 1
Oranges at (0,0) and (0,1) can't rot orange at
(0,3).
  
  
  
  
  
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    class Pair
    {
        int x=0;
        int y=0;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    boolean isSafe(int i,int j,int n,int m)
    {
        return(i>=0 && j>=0 &&i<n && j<m);
    }
    boolean isDelim(Pair temp)
    {
        return (temp.x == -1 && temp.y == -1);
    }
    public int orangesRotting(int[][] grid)
    {
        // Code here
        Queue<Pair>q=new LinkedList<>();
        
        
        int ans=0;
        
        int n=grid.length;
        int m=grid[0].length;
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {if(grid[i][j]==2)
               { q.add(new Pair(i,j));
               }
            }//end of j
        }//end of i
        
        // Separate these rotten oranges from the oranges which will rotten
        // due the oranges in first time frame using delimiter
        
        q.add(new Pair(-1,-1));
        
        while(q.isEmpty()==false)
        {
            while(!isDelim(q.peek()))
            {Pair temp=q.peek();
                if(isSafe(temp.x+1,temp.y,n,m) && grid[temp.x+1][temp.y]==1)
                    // Make the orange rotten
                   { grid[temp.x+1][temp.y] = 2;
                   
                   
                   q.add(new Pair(temp.x+1,temp.y));
                   
                   }
                   if(isSafe(temp.x-1,temp.y,n,m) && grid[temp.x-1][temp.y]==1)
                    // Make the orange rotten
                   { grid[temp.x-1][temp.y] = 2;
                   
                   
                   q.add(new Pair(temp.x-1,temp.y));
                   
                   }
                   if(isSafe(temp.x,temp.y+1,n,m) && grid[temp.x][temp.y+1]==1)
                    // Make the orange rotten
                   { grid[temp.x][temp.y+1] = 2;
                   
                   
                   q.add(new Pair(temp.x,temp.y+1));
                   
                   }
                   if(isSafe(temp.x,temp.y-1,n,m) && grid[temp.x][temp.y-1]==1)
                    // Make the orange rotten
                   { grid[temp.x][temp.y-1] = 2;
                   
                   
                   q.add(new Pair(temp.x,temp.y-1));
                   
                   }
                   q.remove();
            }
            //pop the delimeter
            q.remove();
            
            // If oranges were rotten in current frame than separate the
            // rotten oranges using delimiter for the next frame for processing.
            if (!q.isEmpty()) 
            {
                q.add(new Pair(-1,-1));
                ans++;
            }
        }
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {if(grid[i][j]==1)
                return -1;
            }//end of j
        }
        return ans;
        
    }
}
