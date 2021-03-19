BFS of graph 

Given a directed graph. The task is to do Breadth First Traversal of this graph starting from 0.
Note: One can move from node u to node v only if there's an edge from u to v and find the BFS traversal of the graph starting from the 0th vertex, from left to right according to the graph. Also, you should only take nodes directly or indirectly connected from Node 0 in consideration.


Example 1:
          0
      /   |  \
    1    2   3
           |
          4

Output: 0 1 2 3 4
Explanation: 
0 is connected to 1 , 2 , 3.
2 is connected to 4.
so starting from 0, it will go to 1 then 2
then 3.After this 2 to 4, thus bfs will be
0 1 2 3 4.


class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean vis[]=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        ArrayList <Integer> b=new ArrayList<Integer>();
        q.add(0);//given 0th vertex
        vis[0]=true;
         while(!q.isEmpty()){
            int curr=q.poll();
            b.add(curr);
             //if(curr==V) break; alag cheej
            
            
             for(int neighbour:adj.get(curr)){
                if(!vis[neighbour]){
                     q.add(neighbour);
                    vis[neighbour]=true;
                 }
             }
         }
       return b;      
        
    }
}
    //Earlier code was this
    //abhi ke lie
    
//     public int bfs(int source, int destination)
//     {
//         boolean vis[]=new boolean[adj.length];
//         int parent[]=new int[adj.length];
//         Queue<Integer> q=new LinkedList<>();
        
//         q.add(source);
//         parent[source]=-1;
//         vis[source]=true;
        
//         while(!q.isEmpty()){
//             int curr=q.poll();
//             if(curr==destination) break;
            
//             for(int neighbour:adj[curr]){
//                 if(!vis[neighbour]){
//                     q.add(neighbour);
//                     parent[neighbour]=curr;
//                 }
//             }
//         }
        
//         int curr=destination;
//         int distance=0;
//         while(parent[curr]!=-1){
//             System.out.print(curr+" ");
//             curr=parent[curr];
//             distance++;
//         }
//         return curr;
//     }
// }