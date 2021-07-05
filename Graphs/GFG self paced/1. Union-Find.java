This problem is to implement disjoint set union. There will be 2 incomplete functions namely union and find. You have to complete these functions. 

Union: Join two subsets into a single set.
isConnected: Determine which subset a particular element is in. This can be used for determining if two elements are in same subset.

Example 1:

Input:
N = 5
q = 4
Queries = 
Union(1,3)
isConnected(1,2)
Union(1,5)
isConnected(3,5)
Output:
0
1
Explanation: Initially all nodes 1 2 3 4 5
are not connected. 
After Union(1,3), node 1 and 3 will be
connected.
When we do isConnected(1,2),  as node 1
and 2 are not connected it will return 0.
After Union(1,5), node 1 and 5 will be
connected.
When we do isConnected(3,5),  as node
1 and 3 are connected, and node 1 and 5
are connected, hence 3 and 5 are
connected. Thus it will return 1.
Example 2:

Input:
N = 5
q = 4
Queries = 
Union(1,4)
Union(1,5)
isConnected(2,3)
Union(3,4)
Output: 0
  
  
  
  
  
  //User function Template for Java


class Solution
{
    //Function to merge two nodes a and b.
    public void union_(int a, int b, int parent[], int rank[])
    {
        // add your code here
        int az=find(a,parent);int bz=find(b,parent);
        if(az==bz) return;
        if(rank[az]<rank[bz])
            parent[az]=bz;
        else if(rank[az]>rank[bz])
            parent[bz]=az;
        else
        {
            parent[bz]=az;
            rank[az]++;
        }
        
    }
    //O(n*logN)
    int find(int x, int parent[])
    {
        if(parent[x]==x) return x;
        else
        return find(parent[x],parent);
    }//O(n)
    //Function to check whether 2 nodes are connected or not.
    public boolean isConnected(int a, int b, int par[], int rank[])
    {
        // add your code here
        return (find(a,par)==find(b,par));
    }

}
