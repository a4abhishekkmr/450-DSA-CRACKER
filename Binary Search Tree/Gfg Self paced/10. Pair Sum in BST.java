Given a BST and a number X. The task is to check if any pair exists in BST or not whose sum is equal to X.

Example 1:

Input:
      8
    /   \
   5     9
  / \
 1   3
X = 4
Output: 1
Explanation: For the given input, there
exist a pair whose sum is, i.e, (3,1).
Example 2:

Input:
      0
       \
        1
         \ 
          3
        /  \
       2    7
             \
              8
X = 6
Output: 0
Explanation: For the given input , there
exists no such pair whose sum is 6.
  
  
  
// User function Template for Java


class GFG 
{
    //Function to check if any pair exists in BST
    //whose sum is equal to given value.
    static boolean findPair(Node root, int X) 
    {
        // Your code
        TreeSet<Integer> s=new TreeSet<Integer>();
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {Node curr=q.poll();
        if(s.contains(X-curr.data))
        return true;
        s.add(curr.data);
        if(curr.left!=null)
        q.add(curr.left);
        if(curr.right!=null)
        q.add(curr.right);
        }
        return false;
    }
}//Here i used O(H) time and O(H)+O(N)space
