Given a Binary search tree and a value X,  the task is to complete the function which will return the floor of x.

Note: Floor(X) is an element that is either equal to X or immediately smaller to X. If no such element exits return -1.

Example 1:

Input:
       8
     /  \
    5    9
   / \    \
  2   6   10
X = 3
Output: 2
Explanation: Floor of 3 in the given BST
is 2
Example 2:

Input:
       3
     /   \
    2     5
        /  \
       4    7
      /
     3
X = 1
Output: -1
Explanation: No smaller element exits



//User function Template for Java

class Sol
{
    //Function to return the floor of given number in BST.
    int floor(Node root, int key) 
    { 
        //code here.
        int res=-1;//bc
        while(root!=null)
        {
            if(root.data==key)
            return root.data;
            else if(root.data>key)
            root=root.left;
            else
            {
                res=root.data;
                root=root.right;
            }
        }
        return res;
    } 
 
}
//Expected Time Complexity: O(Height of the BST)
//Expected Auxiliary Space: O(Height of the BST).
