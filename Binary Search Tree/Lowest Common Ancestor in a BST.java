Lowest Common Ancestor in a BST 

Given a Binary Search Tree (with all values unique) and two node values. Find the Lowest Common Ancestors of the two nodes in the BST.

Example 1:

Input:
              5
           /    \
         4       6
        /         \
       3           7
                    \
                     8
n1 = 7, n2 = 8
Output: 7

Solution--
class BST
{   
    // Returns the LCA of the nodes with values n1 and n2
    // in the BST rooted at 'root' 
	Node LCA(Node root, int n1, int n2)
	{
        // code here.  
        if(root==null)
        return null;
        
        if(root.data==n1 || root.data==n2)
        {
            return root;
        }
        Node l=LCA(root.left,n1,n2);
        Node r=LCA(root.right,n1,n2);
        
        if(l!=null && r!=null)
        {
            return root;
        }
        
        if(l!=null && r==null)
        {
            return l;
        }
        else
        return r;
    }
    
}
