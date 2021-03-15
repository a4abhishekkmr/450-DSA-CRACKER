Sum Tree 

Given a Binary Tree. Check whether it is a Sum Tree or not.

A Binary Tree is a Sum Tree in which value of each node x is equal to sum of nodes present in its left subtree and right subtree . An empty tree is also a Sum Tree as sum of an empty tree can be considered to be 0. A leaf node is also considered as a Sum Tree.

Example 1:

Input:
    3
  /   \    
 1     2

Output: 1
Explanation: The given tree is a sum 
tree so return a boolean true.

Input:

          10
        /    \
      20      30
    /   \ 
   10    10

Output: 0
Explanation: The given tree is not a sum
tree. For the root node, sum of elements
in left subtree is 40 and sum of elements
in right subtree is 30. Root element = 10
which is not equal to 30+40.

Solution >>


class Tree
{
	boolean isSumTree(Node root)
	{
	    if(root==null)
	    return true;
       if(root.data==(sum(root.left)+ sum(root.right)))
            {
                return true;
            }
            else
            {
                return false;
            }      
	}

	int sum(Node root)
	{
	    if(root==null)
	    return 0;
	    
	    else{
	        int temp=root.data;
	        root.data=(sum(root.left)+ sum(root.right));
	        return temp+root.data;
	    }
}}