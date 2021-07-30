Given a Directed Graph, find a Mother Vertex in the Graph (if present). 
A Mother Vertex is a vertex through which we can reach all the other vertices of the Graph.
 

Example 1:

Input: 

Output: 0
Explanation: According to the given edges, all 
nodes can be reaced from nodes from 0, 1 and 2. 
But, since 0 is minimum among 0,1 and 3, so 0 
is the output.
Example 2:

Input: 

Output: -1
Explanation: According to the given edges, 
no vertices are there from where we can 
reach all vertices. So, output is -1.
 

Your Task:
You don't need to read or print anything. Your task is to complete the function findMotherVertex() which takes V denoting the number of vertices and adjacency list as imput parameter and returns the verticex from through which we can traverse all other vertices of the graph. If there is more than one possible nodes then returns the node with minimum value.If not possible returns -1.
 

Expected Time Complexity: O(V + E)
Expected Space Compelxity: O(V)
 






class Solution
{
    //Function to find a Mother Vertex in the Graph.
    int count=0;
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        boolean vis[]=new boolean[V];
        int res=Integer.MAX_VALUE;
        
        // boolean flag=false;
        for(int i=0;i<V;i++)
        {
            count=0;
            DFS(adj,vis,i);
            if(count==V)
            {res=Math.min(res,i);}
            Arrays.fill(vis,false);
        }
        if(res==Integer.MAX_VALUE)
        return -1;
        else
        return res;
    }
    void DFS(ArrayList<ArrayList<Integer>>adj,boolean[] vis,int s)
    {count++;
    vis[s]=true;
        for(int u:adj.get(s))
        {if(vis[u]==false)
            DFS(adj,vis,u);
        }
    }
}
