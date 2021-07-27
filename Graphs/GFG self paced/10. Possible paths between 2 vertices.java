Input Format:

First line should contain V and E. Each of next E lines should contain two space separated integers.Next one line contains the source and destination.
Example:

5 7
0 1 
0 2 
0 4 
1 3 
1 4 
2 4 
3 2
0 4
  
  
  output=4
  
  
  
  class Solution
{
    //Function to count paths between two vertices in a directed graph.
    int count=0;
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source, int destination)
    {
        // Code here
        //boolean visited[]=new boolean[V];
       
        Dfs(adj,source,destination);
        
        return count;
    }
    
    void Dfs(ArrayList<ArrayList<Integer>> adj, int s, int d)
    {
        
        if(s==d)
        {count++;
        }
        
        else
        {
            for(int u:adj.get(s))
            {
                    Dfs(adj,u,d);
            }
        }
        
    }
}
