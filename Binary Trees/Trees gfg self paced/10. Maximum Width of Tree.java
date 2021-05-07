Given a Binary Tree, find the maximum width of it. Maximum width is defined as the maximum number of nodes in any level.
For example, maximum width of following tree is 4 as there are 4 nodes at 3rd level.

          1
       /     \
     2        3
   /    \    /    \
  4    5   6    7
    \
      8

Example 1:

Input:
       1
     /    \
    2      3
Output: 2



class Solution
{
    //Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root)
    {
        // Your code here
        if(root==null) return 0;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        int res=0;
        while(q.isEmpty()==false)
        {
            int count=q.size();
            res=Math.max(res,count);
            for(int i=0;i<count;i++)
            {
                Node curr=q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return res;
    }		
}



