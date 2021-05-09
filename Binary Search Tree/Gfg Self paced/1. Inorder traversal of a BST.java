Inorder traversal means traversing through the tree in a Left, Node, Right manner. We first traverse left, then print the current node, and then traverse right. This is done recursively for each node.
Given a BST, find its in-order traversal.

Example 1:

Input:
       5
    /    \
   2      7
    \       \
    3        8
Output: 2 3 5 7 8




class Tree
{
    //Function to return a list containing the inorder traversal of the BST.
    ArrayList<Integer> inOrder(Node root)
    {
        // code here 
         ArrayList<Integer> al=new  ArrayList<Integer>();
         inorder(root,al);
         return al;
    }
    void inorder(Node root, ArrayList<Integer> al)
        
        {
            if(root==null) return;
            else{
            inorder(root.left,al);
            al.add(root.data);
            inorder(root.right,al);
            }
        }
}
//Expected Time Complexity: O(N), where N = Number of nodes in BST
//Expected Auxiliary Space: O(Height of the BST).