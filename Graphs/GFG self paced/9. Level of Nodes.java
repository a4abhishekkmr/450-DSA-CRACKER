Input Format:

First line of the custom input must contain two space separated integers V denoting the number of vertices and E denoting the number of edges. Next E lines contains two space-separated integers denoting each edge. Last line contains an integer X denoting Node X.

Example:

6 5
0 1
0 2
1 3
1 4
2 5
4
  
  
  Output=2
  

  
  class Solution
{
    //Function to find the level of node X.
    
    
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        // code here
        boolean vis[]=new boolean[V];
        int level=0;
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(0);
        vis[0]=true;
        boolean flag=false;
        while(!q.isEmpty())
        {
            level++;
            int t=q.size();
            while(t-->0)
            {
                int u=q.remove();
                if(u==X)
                {flag=true;return level-1;}
                
                for(int x:adj.get(u))
                {
                    if(vis[x]==false)
                {vis[x]=true;
                    q.add(x);
                }
                }
            }
        }
        if(flag==false)
        return -1;
        
        return level;
    }
}
