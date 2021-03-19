DFS of Graph 

Given a connected undirected graph. Perform a Depth First Traversal of the graph.
Note: Use recursive approach to find the DFS traversal of the graph starting from the 0th vertex from left to right according to the graph..


Example 1:

Input:
          0
      /   | \
     1    2   4
                /
              3 

Output: 0 1 2 4 3
Explanation: 
0 is connected to 1, 2, 4.
1 is connected to 0.
2 is connected to 0.
3 is connected to 0.
4 is connected to 0, 3.
so starting from 0, it will go to 1 then 2
then 4, and then from 4 to 3.
Thus dfs will be 0 1 2 4 3.



class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
         boolean vis[]=new boolean[V];
        ArrayList <Integer> b=new ArrayList<Integer>();
       dfs(0,vis,b,adj);
       
       return b;
    }
    
    public void dfs(int curr, boolean[] vis, ArrayList<Integer> b, ArrayList<ArrayList<Integer>> adj)
    {
        vis[curr]=true;
        b.add(curr);
        
        for(int i=0;i<adj.get(curr).size();i++)
        {
            if(!vis[adj.get(curr).get(i)])
            {
                dfs(adj.get(curr).get(i),vis,b,adj);
            }
        }
    }
}
//Expected Time Complexity: O(V + E)
//Expected Auxiliary Space: O(V)