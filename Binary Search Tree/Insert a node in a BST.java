Given a BST and a key K. If K is not present in the BST, Insert a new Node with a value equal to K into the BST. 
Note: If K is already present in the BST, don't modify the BST.

URL-  https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

Input:
     2
   /   \
  1     3
K = 4
Output: 1 2 3 4
Explanation: After inserting the node 4
Inorder traversal will be 1 2 3 4.

Expected Time Complexity: O(Height of the BST).=log n
Expected Auxiliary Space: O(1).

Solution>>

class Solution{
    
    // The function returns the root of the BST (currently rooted at 'root') 
    // after inserting a new Node with value 'Key' into it. 
    Node insert(Node root, int key)
    {
        Node a=null;
        // your code here
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        
       
        if(key<root.data)
        {
            root.left=insert(root.left,key);
        }
        else if(key>root.data)
        {
            root.right=insert(root.right,key);
        }
        return root;
    }
