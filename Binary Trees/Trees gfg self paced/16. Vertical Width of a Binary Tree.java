Given a Binary Tree of N nodes. Find the vertical width of the tree.

Example 1:

Input:
          1
       /    \
      2      3
     / \    / \
    4   5  6   7
            \   \
             8   9
Output: 6
Explanation: The width of a binary tree is
the number of vertical paths in that tree.




class Pair{
    Node node;
    int hd;
    Pair(Node n,int h){node=n;hd=h;}
}

class Tree
{
    //Function to find the vertical width of a Binary Tree.
    public static int verticalWidth(Node root)
	{
	    // code here.
	    if(root==null) return 0;
	    Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> mp=new TreeMap<>();
        q.add(new Pair(root,0));
        while(q.isEmpty()==false){
            Pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            if(mp.containsKey(hd)==false)
                mp.put(hd,curr.data);
            if(curr.left!=null)
                q.add(new Pair(curr.left,hd-1));
            if(curr.right!=null)
                q.add(new Pair(curr.right,hd+1));
        }
        int res=mp.size();
	   return res;
	}
}
//
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(Height of the Tree).