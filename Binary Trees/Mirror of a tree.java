Mirror Tree 

Given a Binary Tree, convert it into its mirror.

Example 1:

Input:
      1
    /  \
   2    3
Output: 2 1 3
Explanation: The tree is
   1    (mirror)  1
 /  \    =>      /  \
3    2          2    3
The inorder of mirror is 2 1 3

Expected Time Complexity: O(N).
space used=> O(1)

Solution>>


class Solution
{
    void mirror(Node node)
    {
	// Your code here
	if(node==null)
	return;
	
	mirror(node.left);
	mirror(node.right);
	Node temp=node.left;
	node.left=node.right;
	node.right=temp;
	
    }
}