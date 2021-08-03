Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, Find the number of strongly connected components in the graph.
 



class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        boolean vis[]=new boolean[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++)
        {
            if(vis[i]==false)
            {
                DFSrec(adj,i,st,vis);
            }
        }//step 1 all dfs from its edges
        
        //now step2
        //reverse edges
        ArrayList<ArrayList<Integer>> revadj =new ArrayList<ArrayList<Integer>>();
        for(int v=0;v<V;v++)
        {
            revadj.add(new ArrayList<Integer>());
        }
        for(int v=0;v<V;v++)
        {
            for(int u:adj.get(v))
            revadj.get(u).add(v);
        }
         //printStack(st);
         
         //step 3
        int count = 0;
        boolean visited[]=new boolean[V];
    
        while(!st.isEmpty())
        {
        int v = st.pop();
        
        if(visited[v] == false)
        {
            DFSrec1(revadj, v, visited);
            count++;
        }
    }
    
    return count;
    }

    void DFSrec(ArrayList<ArrayList<Integer>> adj,int s,Stack st,boolean vis[])
    {
        vis[s]=true;
        
        for(int u:adj.get(s))
        {
            if(vis[u]==false)
            DFSrec(adj,u,st,vis);
        }
        st.push(s);
    }
    
    void DFSrec1(ArrayList<ArrayList<Integer>> revadj,int s,boolean vis[])
    {
        vis[s]=true;
        for(int u:revadj.get(s))
        {
            if(vis[u]==false)
            DFSrec1(revadj,u,vis);
        }
    }
}
