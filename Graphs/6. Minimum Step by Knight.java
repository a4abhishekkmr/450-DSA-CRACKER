Steps by Knight 

Given a square chessboard, the initial position of Knight and position of a target. Find out the minimum steps a Knight will take to reach the target position.

Note:
The initial and the target position co-ordinates of Knight have been given accoring to 1-base indexing.

 

Example 1:

Input:
N=6
knightPos[ ] = {4, 5}
targetPos[ ] = {1, 1}
Output:
3



class Solution
{
   class ans
    {
        int x, y , dis; 
        public ans( int x, int y, int dis)
        {
            this.x =  x; 
            this.y =  y;
            this.dis = dis;
        }
    }
    
     boolean isInside(int x, int y , int n)
    {
        if( x>=1 && x <=n && y>=1 && y<=n)
        return true;
        
        return false;
    }

    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
     int dx[] = { -2, -1 ,1, 2, 2, 1, -1, -2};
        int dy[] = {  1, 2, 2, 1, -1, -2, -2, -1};
        
        ArrayList<ans> q =  new ArrayList<>();   // also can use vector - > Vector<ans> = new Vector<>(); and line 78=> t=q.firstElement()
        
        q.add( new ans(KnightPos[0] , KnightPos[1] , 0) ) ;  // adding given pos of knight
        
        ans t ;
        int x , y ;
        boolean vis[][] = new boolean[N+1][N+1];
        
        // initially all is false by def in java
        

        // mark the added pos as true
        vis[KnightPos[0]][KnightPos[1]] =  true;
        
        
        
        // loop while q not empty  + BC: return dis if target found + else visit all 8 poss points and mark true. 
        //- then again visit all 8 point and mark true for the new point added in q
        
        while(!q.isEmpty())
        {
            t = q.get(0);
            q.remove(0);
            
            //BC
            if(t.x == TargetPos[0] && t.y == TargetPos[1])
            return t.dis;
            
            for( int i = 0 ; i < 8 ; i++)
            {
                x = t.x + dx[i];
                y = t.y + dy[i];
                
                if(isInside(x, y , N) && !vis[x][y])
                  {
                      vis[x][y] = true;
                      q.add( new ans(x , y , t.dis+1) ) ; 
                  }
            }
        }
        return -1;   // not poss
    }

}

//TC: O(n*8)  - O(n)
//SC : O(8) + O(8) + O(n^2) for vis[][] = O(n^2) 