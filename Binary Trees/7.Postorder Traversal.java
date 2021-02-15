
//User function Template for Java



//User function Template for Java

/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> b=new ArrayList<Integer>();

       if(root!=null)
       {
           postOrder(root.left);
           postOrder(root.right);
           System.out.print(root.data+" ");
       } return b;
    }
}
