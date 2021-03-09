Given a Binary Search Tree. The task is to find the minimum element in this given BST.

Example 1:

Input:
           5
         /    \
        4      6
       /        \
      3          7
     /
    1
Output: 1
Expected Time Complexity: O(Height of the BST)
Expected Auxiliary Space: O(Height of the BST).
but here i am taking a single space
only min variable


class Tree
{
    int minValue(Node root)
    {
       //bc
       if(root.left==null)
       {
           return root.data; 
       }
       int min=root.data;
       if(root.data>root.left.data)
       {
           min=minValue(root.left);
       }
       return min;
    }
}

