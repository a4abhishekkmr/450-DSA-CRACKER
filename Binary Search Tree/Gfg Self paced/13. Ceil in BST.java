Given a BST and a number X, find Ceil of X.
Note: Ceil(X) is a number that is either equal to X or is immediately greater than X.

Example 1:

Input:
      5
    /   \
   1     7
    \
     2 
      \
       3
X = 3
Output: 3
Explanation: We find 3 in BST, so ceil
of 3 is 3.
Example 2:

Input:
     10
    /  \
   5    11
  / \ 
 4   7
      \
       8
X = 6
Output: 7
Explanation: We find 7 in BST, so ceil
of 6 is 7.
  
  
  //User function Template for Java

class Tree 
{
    //Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) 
    { 
        if (root == null)
            return -1;
        // Code here
        int res=-1;//bc
        while(root!=null)
        {
            if(root.data==key)
            return root.data;
            else if(root.data>key)
            {
            res=root.data;
            root=root.left;
            }
            else
            {
                root=root.right;
            }
        }
        return res;
        
    } 
}
//Expected Time Complexity: O(Height of the BST)
//Expected Auxiliary Space: O(Height of the BST).
