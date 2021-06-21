Given the adjacency list of a bidirectional graph. Your task is to return the adjacency list for each vertex.


Example 1:

Input:

Output: 
0-> 1-> 4 
1-> 0-> 2-> 3-> 4 
2-> 1-> 3 
3-> 1-> 2-> 4 
4-> 0-> 1-> 3
Explanation:
As 0,1 and 3 is connected to 4 so 4th row
of the list containing 4 and its connected
nodes 0,1 and 3 and we have to add those in
sorted order and same for every row.


Example 2:

Input:


Output: 
0-> 2-> 3 
1-> 2 
2-> 0-> 1 
3-> 0
Explanation:
As 2 and 3 is connected to 0 so 0th row
of the list containing 0 and its connected 
nodes 2 and 3 and we have to add those in
sorted order and same for every row. 


  
  
  
  
class Solution
{
    //Function to return the adjacency list for each vertex.
    public ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<ArrayList<Integer>> al= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++)
        {
            al.add(new ArrayList<>());
            al.get(i).add(i);
            al.get(i).addAll(adj.get(i));
        }
        return al;
    }
}
// Expected Time Complexity: O(V + E)
// Expected Auxiliary Space: O(1)
