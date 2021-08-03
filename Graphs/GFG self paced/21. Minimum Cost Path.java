Given a square grid of size N, each cell of which contains integer cost which represents a cost to traverse through that cell, we need to find a path from top left cell to bottom right cell by which the total cost incurred is minimum.
From the cell (i,j) we can go (i,j-1), (i, j+1), (i-1, j), (i+1, j). 

Note: It is assumed that negative cost cycles do not exist in the input matrix.
 

Example 1:

Input: grid = {{9,4,9,9},{6,7,6,4},
{8,3,3,7},{7,4,9,10}}
Output: 43
Explanation: The grid is-
9 4 9 9
6 7 6 4
8 3 3 7
7 4 9 10
The minimum cost is-
9 + 4 + 7 + 3 + 3 + 7 + 10 = 43.
Example 2:

Input: grid = {{4,4},{3,7}}
Output: 14
Explanation: The grid is-
4 4
3 7
The minimum cost is- 4 + 3 + 7 = 14.
 

Your Task:
You don't need to read or print anything. Your task is to complete the function minimumCostPath() which takes grid as input parameter and returns the minimum cost to react at bottom right cell from top left cell.
 

Expected Time Compelxity: O(n2*log(n))
Expected Auxiliary Space: O(n2) 
  
  
  
  
  
  
  
  
  class Solution
{
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.

	class Pair
	{
	    int x,y,distance;
	    
	    Pair(int x,int y,int distance)
	    {
	        this.x=x;this.y=y;this.distance=distance;
	    }
	}	
	class WeightComparator implements Comparator<Pair>
	{
	    public int compare(Pair a,Pair b)
	    {
	        return a.distance-b.distance;
	    }
	}
	
	 int[] dx = { -1, 0, 1, 0 };
     int[] dy = { 0, 1, 0, -1 };
	
    public int minimumCostPath(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        
        int dist[][]=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            dist[i][j]=Integer.MAX_VALUE;
        }
        
        dist[0][0]=grid[0][0];
        
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>(n*m,new WeightComparator());
        
        pq.add(new Pair(0,0,dist[0][0]));
        
        while(!pq.isEmpty())
        {
            Pair curr=pq.poll();
            for(int i=0;i<4;i++)
            {
                int rows=curr.x+dx[i];
                int cols=curr.y+dy[i];
                
                if(rows>=0 && rows<n && cols>=0 && cols<m)
                {
                    if(dist[rows][cols]>dist[curr.x][curr.y]+grid[rows][cols])
                    {
                        if(dist[rows][cols]!=Integer.MAX_VALUE)
                        {
                            Pair adj=new Pair(rows,cols,dist[rows][cols]);
                            
                            pq.remove(adj);
                            
                        }
                        
                        dist[rows][cols]=dist[curr.x][curr.y]+grid[rows][cols];
                        
                        pq.add(new Pair(rows,cols,dist[rows][cols]));
                    }
                }
            }
        }
        return dist[n-1][m-1];
    }
    
}
 




Editorial:


// Back-end Complete function Template for JAVA

class Solution
{
    //these list store 4 possible moves from current cell.
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    
    static class Cell
    {
        int x;
        int y;
        int distance;
        
        Cell(int x, int y, int distance) 
        {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    
    //custom comparator for inserting cells into Priority Queue.
    static class distanceComparator 
      implements Comparator<Cell>
    {
        public int compare(Cell a, Cell b)
        {
            if (a.distance < b.distance)
            {
                return -1;
            }
            else if (a.distance > b.distance)
            {
                return 1;
            }
            else {return 0;}
        }
    }
    
    //Function to check if cell indexes are within bounds.
    static boolean isInsideGrid(int i, int j, int ROW, int COL)
    {
        return (i >= 0 && i < ROW &&j >= 0 && j < COL);
    }
    
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
    public int minimumCostPath(int[][] grid)
    {
        int row = grid.length;
        int col = grid[0].length;
        
        //dp list to store minimum cost to reach each cell.
        int[][] dp = new int[row][col];
    
        //initializing dp array by INT_MAX 
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                dp[i][j] = Integer.MAX_VALUE;
        
        dp[0][0] = grid[0][0];
        
        //using priority queue to store cell indexes and 
        //minimum cost to reach that cell.
        PriorityQueue<Cell> pq = new PriorityQueue<Cell>(row * col, new distanceComparator());
                      
        pq.add(new Cell(0, 0, dp[0][0]));
        while (!pq.isEmpty())
        {
            //storing first element of priority queue and popping it.
            Cell curr = pq.poll();
            
            //iterating over 4 possible neighbours of current cell.
            for(int i = 0; i < 4; i++)
            {
                int rows = curr.x + dx[i];
                int cols = curr.y + dy[i];
                
                //if cell indexes are within bounds.
                if (isInsideGrid(rows, cols, grid.length, grid[0].length))
                {
                    //ifdp value at neighbouring cell+current cell value is less
                    //than at current cell, we update dp value at current cell 
                    //and insert cell index with dp value in priority queue.
                    if (dp[rows][cols] >dp[curr.x][curr.y]+grid[rows][cols])
                    {
                        //if cell is already been reached once, we
                        //remove it from priority queue.
                        if (dp[rows][cols] != Integer.MAX_VALUE)
                        {
                            Cell adj = new Cell(rows, cols, dp[rows][cols]);
                            pq.remove(adj);
                        }
                        
                        dp[rows][cols]=dp[curr.x][curr.y]+grid[rows][cols];
                        pq.add(new Cell(rows, cols, dp[rows][cols]));
                    }
                }
            }
        }
        //returning dp value at bottom right corner cell.
        return dp[row - 1][col - 1];

    }
}
