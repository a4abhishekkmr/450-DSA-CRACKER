Given a Binary Search Tree and a node value X, find if node with value X is present in the BST or not. 


Example 1:

Input:
         2
          \
          81
        /    \
      42      87
    /   \       \
   45   66      90
x = 87
Output: 1
Explanation: As 87 is present in the
given nodes , so the output will be 1.



class BST
{
    //Function to search a node in BST.
    boolean search(Node root, int x)
    {
	    // Your code here
	    if(root==null)
	    return false;
	    
	    else if(root.data==x)
	    return true;
	    
	    else if(root.data<x)
	    return search(root.right,x);
	    
	    else
	    return search(root.left,x);
    }
}
//
// Expected Time Complexity: O(Height of the BST)
// Expected Auxiliary Space: O(1).