Levelorder traversal means traversing through the tree level by level, from left to right.
Given a BST, find its level-order traversal. 


Example 1:

Input:
      5
    /   \
   2     7
   \      \
    3      8
Output: 5 2 7 3 8




class Solution
{
    //Function to return the level order traversal of a BST.
    static ArrayList<Integer> levelOrder(Node node)
    {
        // code here 
        ArrayList<Integer> al=new ArrayList<Integer>();
        if(node==null) return al;
        Queue<Node> q=new LinkedList<Node>();
        q.add(node);
        while(q.isEmpty()==false)
        {
            Node curr=q.poll();
            
            al.add(curr.data);
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
        }
        return al;
    }
}
//Expected Time Complexity: O(N), where N = number of nodes in BST.
//Expected Auxiliary Space: O(N).