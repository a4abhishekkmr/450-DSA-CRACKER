Min distance between two given nodes of a Binary Tree

Input:
        1
      /  \
     2    3
a = 2, b = 3
Output: 2
Explanation: The tree formed is:
       1
     /   \ 
    2     3
We need the distance between 2 and 3.
Being at node 2, we need to take two
steps ahead in order to reach node 3.
The path followed will be:
2 -> 1 -> 3. Hence, the result is 2. 



Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    int findDist(Node root, int a, int b) {
        // Your code here
        Node nn=lca(root,a,b);
        
        int d1=dist(nn,a,0);int d2=dist(nn,b,0);
        
        return d1+d2;
        
        
    }
    Node lca(Node root, int n1,int n2)
	{
		// Your code here
		if(root==null)
		  {  return null;}

		if(root.data==n1||root.data==n2)
		{
		    return root;
		}
		Node l=lca(root.left,n1,n2);
		Node r=lca(root.right,n1,n2);
		
		if(l!=null && r!=null)
		{
		    return root;
		}
		
		if(l!=null && r==null)
		{
		    return l;}
		    else
		    return r;
	}
	
	int dist(Node n1, int f, int in)
	{
	    if(n1==null) return -1;
	    
	    if(n1.data==f) return in;
	    
	    int l= dist(n1.left,f,in+1);
	
	    if(l==-1) return dist(n1.right,f,in+1);
	    else return l;
	    
	}
}