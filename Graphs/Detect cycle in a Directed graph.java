Detect cycle in a directed graph 

Given a Directed Graph with V vertices and E edges, check whether it contains any cycle or not.

Input:

0----------->1
             |
             v
3<-----------2
U

Output: 1
Explanation: 3 -> 3 is a cycle


solution>>

// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if(new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean vis[] =new boolean[V];
        boolean restack[] =new boolean[V];
        // boolean a=false;
        for(int i=0;i<V;i++)
        {
            vis[i]=false;
            restack[i]=false;
        }
           for(int i=0;i<V;i++)
           if(cyclic(i,vis,restack,adj))
                return true;
        return false;
    }
    //Using DFS
    boolean cyclic(int curr, boolean[] vis,  boolean restack[], ArrayList<ArrayList<Integer>> adj)
    {
        vis[curr]=true;
        restack[curr]=true;
        //boolean a=false;
        for(int i=0;i<adj.get(curr).size();i++)
        {
            if(!vis[adj.get(curr).get(i)])
            {
                if(cyclic(adj.get(curr).get(i),vis,restack, adj))
                return true;
            }
            else if(restack[adj.get(curr).get(i)]) //dfs ka next traversal already present in
             return true;                                 //restack
        }
        restack[curr]=false;
        return false;
    }
}

// Expected Time Complexity: O(V + E)
// Expected Auxiliary Space: O(V)
