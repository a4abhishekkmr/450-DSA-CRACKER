Check Mirror in N-ary tree

Example

     1                    1
   /    \               /   \
 2      3             3     2

Output: 1

    1                      1
  /  \                   /  \
 2    3                2    3

Output: 0


Example:
Input:
2
3 2
1 2 1 3
1 3 1 2
3 2
1 2 1 3
1 2 1 3
Output:
1
0


class BinaryTree  
{ 
    // Return True if the given trees are isomotphic. Else return False.
    boolean isIsomorphic(Node root1, Node root2)  
    { 
        if(root1==null && root2==null)
        {
            return true;
        }
        if(root1==null || root2==null)
        {
            return false;
        }
        
        if(root1.data!=root2.data)
        {
            return false;
        }
        
        return isIsomorphic(root1.left,root2.right)&&isIsomorphic(root1.right,root2.left);
         // code here.
    }
    
}