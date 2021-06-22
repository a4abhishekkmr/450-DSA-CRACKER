Given a Binary Tree, find the vertical traversal of it starting from the leftmost level to the rightmost level.
If there are multiple nodes passing through a vertical line, then they should be printed as they appear in level order traversal of the tree.

Example 1:

Input:
           1
         /   \
       2       3
     /   \   /   \
   4      5 6      7
              \      \
               8      9           
Output: 
4 2 1 5 6 3 8 7 9 
Explanation:

Example 2:

Input:
       1
    /    \
   2       3
 /    \      \
4      5      6
Output: 4 2 1 5 3 6
  
  
  
  
  
//User function Template for Java
// idea : do leveloreder traversal and need to make a Pair class(to add node along with is horz distance)
class pair
{
    Node node;
    int hd;
    pair(Node node, int hd) { this.node =node ; this.hd=hd; }

}
class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
         ArrayList <Integer> ans = new ArrayList <Integer>();
        Queue<pair> q = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> mp= new TreeMap<>();

        q.add(new pair(root,0));
        
        while(!q.isEmpty())
        {
            pair p = q.poll(); Node curr=p.node; int hd =p.hd;

            // putting in map
            if(mp.containsKey(hd))
            mp.get(hd).add(curr.data);

            else
            {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(curr.data);
                mp.put(hd,al);
            }

            if(curr.left!=null) q.add(new pair(curr.left , hd-1));
            if(curr.right!=null) q.add(new pair(curr.right, hd+1));
        }
        

        // traverse
        for(Map.Entry<Integer,ArrayList<Integer>> p : mp.entrySet())
        {
            ArrayList<Integer> al = p.getValue();
            for( int x :al)
            {
                ans.add(x);
            }
        }

        return ans;
    }
}
// TC: O(n) - since level order - enqueue and dequeueing all node once.
// SC: O(n) - storing all node in treeMap
