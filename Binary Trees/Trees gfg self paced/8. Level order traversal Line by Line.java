Given a Binary Tree, your task is to find its level order traversal.
For the below tree the output will be 1 $ 2 3 $ 4 5 6 7 $ 8 $.

          1
       /     \
     2        3
   /    \     /   \
  4     5   6    7
    \
     8

Example 1:

Input:
          1
        /
       4
     /   \
    4     2
Output:1 $ 4 $ 4 2 $


Your Task:
This is a function problem. You don't need to read input. Just complete the function levelOrder() that takes nodes as parameter and returns level order traversal as a 2D list.

Note: The driver code prints the levels '$' separated.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).


class Level_Order_Traverse
{
    //Function to return the level order traversal line by line of a tree.
    static ArrayList<ArrayList<Integer>> levelOrder(Node root) 
    {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
        
        // Your code here
        if(root==null) return ans;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        //int index=0;
        while(q.isEmpty()==false)
        {
            ArrayList<Integer> al= new  ArrayList<Integer>();
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                Node curr=q.poll();
                al.add(curr.data);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            ans.add(al);
        }
        return ans;
    }
}