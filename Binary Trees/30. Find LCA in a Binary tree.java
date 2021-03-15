Find LCA in a Binary tree

Input:
n1 = 3 , n2 = 4
         5
        /
       2
     /  \
    3    4
Output: 2
Explanation: 
LCA of 3 and 4 is 2.


link for refferal- https://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/

solution-
class Tree
{

/* If n1 and n2 are present, return reference
   to LCA. If both are not present, return 
   null,. Else if left subtree contains any 
   of them return pointer to left.*/
	Node lca(Node root, int n1,int n2)
	{
		// Your code here
		if(root==null)
		  {  return null;}

		if(root.data==n1||root.data==n2)
		{
		    return root;
		}
		Node l=lca(root.left,n1,n2);
		Node r=lca(root.right,n1,n2);
		
		if(l!=null && r!=null)
		{
		    return root;
		}
		
		if(l!=null && r==null)
		{
		    return l;}
		    else
		    return r;
	}
}

/*
explanation- If we assume that the keys n1 and n2 are present in Binary Tree, we can find LCA using a single traversal of Binary Tree and without extra storage for path arrays. 
The idea is to traverse the tree starting from the root. If any of the given keys (n1 and n2) matches with the root, then the root is LCA (assuming that both keys are present). If the root doesn’t match with any of the keys, we recur for the left and right subtree. The node which has one key present in its left subtree and the other key present in the right subtree is the LCA. If both keys lie in the left subtree, then the left subtree has LCA also, otherwise, LCA lies in the right subtree.  

Time Complexity: The time complexity of the above solution is O(n) as the method does a simple tree traversal in a bottom-up fashion. 
Space complexity- O(h)- h is the height of tree*/
