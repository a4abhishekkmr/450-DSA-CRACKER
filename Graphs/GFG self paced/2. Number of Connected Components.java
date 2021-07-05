This problem is to find the number of connected components. There will be 2 incomplete functions namely unionNodes and findNumberOfConnectedNodes. You have to complete these functions. 

unionNodes: Join two subsets into a single set.
findNumberOfConnectedNodes: Determine number of different connected components in a graph.

Example 1:

Input:
N = 5
M = 2
Edges[] = {(1,3),(1,5)}
Output: 3
Explanation: Initially all nodes 1 2 3 4 5
are not connected. 
After 1 3, node 1 and 3 will be connected.
After 1 5, node 1 and 5 will be connected.
Finally we have {1,3,5}, {2}, {4}. So we
have a total of 3 connected components.
  
  
  
  Example 2:

Input:
N = 5
M = 4
Edges[] = {(1,4),(2,3),(1,5)}
Output: 2
Explanation: Initially all nodes 1 2 3 4 5
are not connected.
After 1 4, node 1 and 4 will be connected.
After 2 3, node 2 and 3 will be connected.
After 1 5, node 1 and 5 will be connected.
Finally we have {1,4,5}, {2, 3}. So we
have total of 2 connected components
Your Task:

You have to complete the function unionNodes() which merges the node1 and node2. You will also have to complete the function findNumberOfConnectedNodes() function will returntotal number of different connected components in a graph.
  
  
  
//User function Template for Java


class Solution
{

    //Function to merge two nodes a and b.
    static void unionNodes( int a, int b, int parent[], int rank[], int n) 
    { 
        //code here
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
        // for(int i=0;i<n;i++)
        // System.out.print(rank[i]);
        // System.out.println();
    }
    static int find(int x, int parent[])
    {
        if(parent[x]==x) return x;
        else
        return find(parent[x],parent);
    }

    //Function to determine number of connected components.
    static int findNumberOfConnectedComponents( int n, int parent[], int rank1[]) 
    {
        // add your code
        //  for(int i=0;i<n;i++)
        // System.out.print(parent[i]);
        // System.out.println();
        // boolean check[]=new boolean[n+1];
        // for(int i=0;i<n;i++)
        // {
        //     check[find(i,parent)]=true;
        // }
        // int count=0;
        // for(int i=0;i<n+1;i++)
        // if(check[i]==true)count++;
        int count=0;
        for(int i=1;i<=n;i++)
        if(find(i,parent)==i) count++;
        //
        return count;
    }
}


