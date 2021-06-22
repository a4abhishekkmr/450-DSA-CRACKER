Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, check whether it contains any cycle or not.


Example 1:

Input:

0->1->2->3(self loop)

Output: 1
Explanation: 3 -> 3 is a cycle

Example 2:

Input:
1->2->0

Output: 0
Explanation: no cycle in the graph


/*Complete the function below*/

class Solution 
{//Using cahn's Algo
    //Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // code here
        int indegree[]=new int[V];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            for(int x:adj.get(i))
            indegree[x]++;
        }
        //stored indegree
        for(int i=0;i<V;i++)
        if(indegree[i]==0)
        q.add(i);
        
        int count=0;
        while(!q.isEmpty())
        {
            int u=q.poll();
            for(int x:adj.get(u))
            if(--indegree[x]==0)
            {
                q.add(x);
            }
            count++;
        }
        if(count!=V)
        return true;
        
        return false;
    }
}
//Expected Time Complexity: O(V + E)
//Expected Auxiliary Space: O(V)
