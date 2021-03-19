Detect cycle in an undirected graph 
Medium Accuracy: 35.66% Submissions: 66201 Points: 4
Given an undirected graph with V vertices and E edges, check whether it contains any cycle or not. 

Example 1:

Input:   

0----1-----2
         |        |
        4------3

Output: 1
Explanation: 1->2->3->4->1 is a cycle

Solution>>

class Solution
{
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++)
        visited[i]=false;
        
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
           if(cyclic(i,visited,-1,adj))
                return true;
        }
        return false;
    }
    
    boolean cyclic(int curr, boolean visited[], int parent, ArrayList<ArrayList<Integer>> adj)
    {
        visited[curr]=true;
        for(int i=0; i<adj.get(curr).size(); i++)
        {
            if(!visited[adj.get(curr).get(i)])
            {
                if(cyclic(adj.get(curr).get(i), visited, curr, adj))
                return true;
            }
            
            else if(adj.get(curr).get(i)!=parent)
            return true;
        }
        //agar upar ka cases not true then return false;
        return false;
    }
}

//Expected Time Complexity: O(V + E)
//Expected Space Complexity: O(V)
 