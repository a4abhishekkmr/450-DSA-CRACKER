Given a BST and an integer. Find the least absolute difference between any node value of the BST and the given integer.

Example 1:

Input:
        10
      /   \
     2    11
   /  \ 
  1    5
      /  \
     3    6
      \
       4
K = 13
Output: 2
Explanation: K=13. The node that has
value nearest to K is 11. so the answer
is 2
Example 2:

Input:
      8
    /   \
   1     9
    \     \
     4    10
    /
   3
K = 9
Output: 0
Explanation: K=9. The node that has
value nearest to K is 9. so the answer
is 0.

//User function Template for Java

class Solution
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    static int minDiff(Node  root, int K) 
    { 
        // Write your code here
       int ans= floorandceil(root,K);
        return ans;
    } 
    
    static int floorandceil(Node root, int x)
    {
        
        int floor=0;
        int ceil=0;
        while(root!=null)
        {
            if(root.data==x)
            return 0;
            else if(root.data>x)
            {
                ceil=root.data;
                root=root.left;
            }
            else
            {
                floor=root.data;
                root=root.right;
            }
        }
        return (Math.min((Math.abs(x-floor)),Math.abs((ceil-x))));
    }
}
// Expected Time Complexity: O(Height of the BST).
// Expected Auxiliary Space: O(Height of the BST).
