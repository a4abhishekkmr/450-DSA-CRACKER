Given a weighted, undirected and connected graph of V vertices and E edges, Find the shortest distance of all the vertex's from the source vertex S.
Note: The Graph doesn't contain any negative weight cycle.


  
  //User function Template for Java


class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        int dist[]=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        int res=0;
        dist[S]=0;
        //now finalized array means elements are finalized
        boolean fin[]=new boolean[V];
        //op started
        for(int count=0;count<V;count++)
        {
            int u=-1;
            for(int i=0;i<V;i++)//no need to check for last
            if(fin[i]==false && (u==-1 || dist[i]<dist[u]))
            u=i;
            
            fin[u]=true;
            
            for(ArrayList<Integer>ab : adj.get(u))
             if(fin[ab.get(0)]==false) //&& (ab.get(0))!=0 )//Not connected by path
             //here i removed the not connected part as in Al of al of al it 
             //is not like graph where redundant data(0) is stored.. so in al no unecessary data is stored no needed to check
             //for not connected it wont be given
            dist[ab.get(0)]=Math.min(dist[ab.get(0)],dist[u]+ab.get(1));

// another simple soln
        //   for (int i = 0; i < adj.get(u).size(); i++) {

        //     int v = adj.get(u).get(i).get(0);
        //     int costUV = adj.get(u).get(i).get(1);


        //     if (!fin[v] && dist[u] + costUV < dist[v]) {

        //     dist[v] = dist[u] + costUV;

        //      }
        //     }
        }
        return dist;
    }
}
// for (int v = 0; v < V; v++) 
    
//     			if (graph[u][v]!=0 && fin[v] == false) 
//     				dist[v] = Math.min(dist[v],dist[u]+graph[u][v]); 

  
TC=
  SC=
  
