Given a Binary Search Tree (BST) and a range l-h(inclusive), count the number of nodes in the BST that lie in the given range.

The values smaller than root go to the left side
The values greater and equal to the root go to the right side
Example 1:

Input:
      10
     /  \
    5    50
   /    /  \
  1    40  100
l = 5, h = 45
Output: 3
Explanation: 5 10 40 are the node in the
range
Example 2:

Input:
     5
    /  \
   4    6
  /      \
 3        7
l = 2, h = 8
Output: 5
Explanation: All the nodes are in the
given range.
  
  
  
  // A Binary Search Tree node


class Tree
{
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
    if(root==null) return 0;
    int left=getCount(root.left,l,h);
    int right=getCount(root.right,l,h);
    if(root.data>=l && root.data<=h)
    return left+right+1;
    else
    return left+right;

    }
}//TC->O(n) SC-> O(h)
