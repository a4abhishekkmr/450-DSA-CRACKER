https://www.geeksforgeeks.org/binary-search-tree-set-2-delete/


Given a Binary Search Tree and a node value X. Delete the node with the given value X from the BST. If no node with value x exists, then do not make any change. 

Example 1:

Input:
      2
    /   \
   1     3
X = 12
Output: 1 2 3
Explanation: In the given input there
is no node with value 12 , so the tree
will remain same.

Solution >>

class Tree
{
    // Return the root of the modified BST after deleting the node with value X
	public static Node deleteNode(Node root, int key)
	
	{
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;
 
        /* Otherwise, recur down the tree */
        if (key < root.data)
            root.left = deleteNode(root.left, key);
        else if (key > root.data)
            root.right = deleteNode(root.right, key);
 
        // if key is same as root's 
        // key, then This is the
        // node to be deleted
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.data = minValue(root.right);
 
            // Delete the inorder successor
            root.right = deleteNode(root.right, root.data);
        }
 
        return root;
    }
 
   static int minValue(Node root)
    {
        int minv = root.data;
        while (root.left != null) 
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
	}

Expected Time Complexity: O(Height of the BST).
Expected Auxiliary Space: O(Height of the BST).