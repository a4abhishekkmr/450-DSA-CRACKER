Given two binary trees, the task is to find if both of them are identical or not. 


Example 2:

Input:
     1          1
   /   \      /   \
  2     3    2     3
Output: Yes
Explanation: There are two trees both
having 3 nodes and 2 edges, both trees
are identical having the root as 1,
left child of 1 is 2 and right child
of 1 is 3.
Example 2:

Input:
    1       1
  /  \     /  \
 2    3   3    2
Output: No
Explanation: There are two trees both
having 3 nodes and 2 edges, but both
trees are not identical.


class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    
	     //bc
	    if(root1==null && root2==null) return true;
	    
	    else if(root1==null && root2!=null) return false;
	    else if(root2==null && root1!=null) return false;
	    
	    if(root1.data!=root2.data)
	    return false;
	    
	   
	    if(root1!=null && root2!=null)
	    return ((root1.data==root2.data)&&isIdentical(root1.left,root2.left)&&isIdentical(root1.right,root2.right));
	    else
	    return false;
	}
	
}//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(Height of the Tree).