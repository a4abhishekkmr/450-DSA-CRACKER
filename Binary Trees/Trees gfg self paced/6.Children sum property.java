6. Children Sum Parent 
Easy Accuracy: 50.49% Submissions: 26046 Points: 2
Given a Binary Tree. Check whether all of its nodes have the value equal to the sum of their child nodes.


Example 1:

Input:
     10
    /
  10 
Output: 1
Explanation: Here, every node is sum of
its left and right child.
Example 2:

Input:
       1
     /   \
    4     3
   /  \
  5    N
Output: 0
Explanation: Here, 1 is the root node
and 4, 3 are its child nodes. 4 + 3 =
7 which is not equal to the value of
root node. Hence, this tree does not
satisfy the given conditions.



class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        if ((isSumProperty1(root)))
        return 1;
       else return 0;
    }
    public static boolean isSumProperty1(Node root)
   { if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        
        int sum=0;
        if(root.left!=null) sum+=root.left.data;
        if(root.right!=null) sum+=root.right.data;
        return (root.data==sum && isSumProperty1(root.left) && isSumProperty1(root.right));}
}

//Expected Time Complexiy: O(N).
//Expected Auxiliary Space: O(Height of the Tree).