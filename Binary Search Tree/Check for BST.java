iven a binary tree. Check whether it is a BST or not.
Note: We are considering that BSTs can not contain duplicate Nodes.

Example 1:

Input:
    2
 /    \
1      3
Output: 1 
Explanation: 
The left subtree of root node contains node 
with key lesser than the root node’s key and 
the right subtree of root node contains node 
with key greater than the root node’s key.
Hence, the tree is a BST.

My approach>>

public class Solution
{
    // return true if the given tree is a BST, else return false
    boolean isBST(Node root)
        {
            // code here.
            if(root==null)
            return true;
            
            //int flag=0;
            Node prev=null;
            if(isBST(root.left))
            return false;
            
            if(prev && root.data<=prev.data)
            {
                prev=null;
                return false;
            }
            prev=root;
            return isBST(root.right);
        }
}


Solution>>

public class Solution
{
    int min=Integer.MIN_VALUE;
    int max=Integer.MAX_VALUE;
    // return true if the given tree is a BST, else return false
    boolean isBST(Node root)
        {
            // code here.
            if(root==null)
            {
                return true;
            }
            if(fn(root.left,min,root.data)&& fn(root.right,root.data,max))
            return true;
            
            return false;
        }
        
        boolean fn(Node root, int min, int max)
        {
            if(root==null) return true;
            
            if(root.data>min && root.data<max)
            {
                if(fn(root.left,min,root.data) && fn(root.right,root.data,max))
                return true;
                
                
              
            }  return false;
        }
}

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the BST).